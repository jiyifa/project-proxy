package com.jiyifa.proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//代码生成、编译、重新动态load到JVM
public class MyClassLoader extends ClassLoader{
	private File baseDir;
	public MyClassLoader() {
		// TODO Auto-generated constructor stub
		String basePath = MyClassLoader.class.getResource("").getPath();
		this.baseDir = new File(basePath);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String className = MyClassLoader.class.getPackage().getName() + "." + name;
		if(baseDir!=null) {
			File classFile = new File(baseDir,name.replace("\\.", "/")+".class");
			if(classFile.exists()) {
				FileInputStream in = null;
				ByteArrayOutputStream out = null;
				try {
					in = new FileInputStream(classFile);
					out = new ByteArrayOutputStream();
					byte[] buff = new byte[1024];
					int len;
					while((len=in.read(buff)) != -1 ) {
						out.write(buff, 0, len);
					}
					return defineClass(className, out.toByteArray(), 0,out.size());
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					classFile.delete();
					if(null != in) {
						try {
							in.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(null != out) {
						try {
							out.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		return super.findClass(name);
	}

}
