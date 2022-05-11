package com.spellhaven.spring0510_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student stu1 = ctx.getBean("jaehyun", Student.class);		
		System.out.println(stu1.getName());
		
		Student stu2 = ctx.getBean("jaehyun", Student.class);
		stu2.setName("정지수");
		System.out.println(stu2.getName());

		// 어. stu1 객체도 원래 값인 "정재현"이 아니라 "정지수"로 출력되는군.
		// 이게 무슨 얘기냐? 자바빈의 기본값은 scope = "singleton"이라는 얘기다.
		// stu1이 곧 stu2인데, stu2 이름을 바꿨으니 당연히 stu1.getName을 하면 바꾼 값이 나오지.
		// applicationCTX.xml에서 scope = "prototype"로 변경하니, stu1과 stu2는 다른 객체로 생성되었다. stu2 이름만 바꿀 수 있었다.
		System.out.println(stu1.getName());
		
		if(stu1.equals(stu2)) {
			System.out.println("stu1과 stu2는 같은 객체를 참조하고(가리키고) 있디.");
		} else {
			System.out.println("stu1과 stu2는 다른 객체를 참조하고(가리키고) 있디.");
		}

	}

}




