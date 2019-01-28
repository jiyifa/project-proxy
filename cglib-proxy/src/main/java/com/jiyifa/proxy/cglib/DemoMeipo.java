package com.jiyifa.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DemoMeipo implements MethodInterceptor{

	//疑问
	//好像并没有持有被代理对象的引用

	public Object getInstance(Class clazz) throws Exception{
		//通过反射机制，给它实例化
		Enhancer enhancer = new Enhancer();
		//把父类设置为谁？
		//这一步就是告诉cglib,生成子类需要继承哪个类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		//第一步,生成源代码
		//第二步，编译生成class文件
		//第三步，加载到jvm中，并返回被代理的对象
		return enhancer.create();
	}

	//同样是字节码重组这样一件事情
	//对于使用API的用户来说，是无感知的
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated methodfactory stub
		System.out.println("你的性是：" + "得给你找个异性才行");
		System.out.println("开始进行海选。。。");
		System.out.println("------------------------------------------------------------");
		//这个obj的引用是由cglib给我们new出来的
		//cglib new出来的对象，是被代理对象的子类（继承了我们自己写的那个类）
		//OOP，在new子类之前，实际默认先调用了我们supper()方法的，
		//new 了子类的同时，必须先new出父类，这就相当于是间接的持有了父类的引用
		//子类重写了父类的所有方法
		//我们改变了子类对象的某些属性，是可以间接的操作父类属性的
		proxy.invokeSuper(obj, args);
		System.out.println("如果合适的话，就准备办事");
		return null;
	}

}
