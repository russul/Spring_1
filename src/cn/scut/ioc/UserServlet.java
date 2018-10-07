package cn.scut.ioc;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServlet {
	// 要调用service类中的方法
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void fun() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean2.xml");
		UserService userService = (UserService) context.getBean("userService");
		UserServlet userServlet=(UserServlet)context.getBean("userServlet");
		System.out.println(userServlet.userService);
		userService.show();
		
	}
}
