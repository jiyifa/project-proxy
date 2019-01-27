package com.jiyifa.proxy.cglib;

public class Test {
	public static void main(String[] args) {
		//jdk的动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口

		//cglib动态代理是通过生成一个被代理对象的子类，然后重写父类方法
		//生成以后的对象，可以强制转换为被代理对象（也就是自己写的类）
		//子类引用赋值给父类
		try {
			Mary obj = (Mary)new DemoMeipo().getInstance(Mary.class);
			obj.findLove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
