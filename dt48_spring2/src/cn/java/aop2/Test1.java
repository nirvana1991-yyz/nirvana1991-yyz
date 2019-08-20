package cn.java.aop2;

import java.lang.reflect.Constructor;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		Class c1=Class.forName("cn.java.aop2.BankServiceImpl");
		Constructor constructor1= c1.getConstructor();
		//Constructor constructor2=c1.getConstructor(BankServiceProxy.class,Security.class);
		BankServiceImpl bankServiceImpl=(BankServiceImpl)constructor1.newInstance();
		System.out.println(bankServiceImpl.toString());
	}

}
