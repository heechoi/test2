package com.dgit.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationCtx.xml");
		StudentInfo info = ctx.getBean(StudentInfo.class);
		info.getInfo();
		ctx.close();
	}
}
