package cn.scut.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperty {
	@Test
	public void fun() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean3.xml");
		Person p = (Person) context.getBean("person");
		Person p1 = (Person) context.getBean("person");
		System.out.println(p == p1);
		p.show();
		System.out.println(p.getUser()==p1.getUser());
		System.out.println(p.getMap().get("a"));
		System.out.println(p.getArr().length);
		System.out.println(p.getList().size());
		System.out.println(p.getProperties().get("driverClass"));
	}
}
