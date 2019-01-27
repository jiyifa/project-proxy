package com.jiyifa.proxy.jdk;

import java.io.FileOutputStream;

import sun.misc.ProxyGenerator;

public class Test {
	public static void main(String[] args) {
		try {
			Person obj = (Person)new Meipo().getInstance(new XiaoXingXing());
			System.out.println(obj.getClass());
			obj.findLove();

			//原理：
			//1.拿到被代理对象的引用，然后获取他的接口
			//2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			//3.把被代理的对象引用也拿到了
			//4.重新动态生成一个class字节码
			//5.然后编译

			//获取字节码内容
			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
			FileOutputStream os = new FileOutputStream("$Proxy0.class");
			os.write(data);
			os.close();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
