package com.bjsxt.service;
import org.junit.Test;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;
import com.bjsxt.spring.BeanFactory;
import com.bjsxt.spring.ClassPathXmlApplicationContext;


public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		// Spring自动装配
		// 读取配置文件，然后得到各个映射关系
		// 程序初始化，把这些东西放到一个容器中
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		
		UserService service = (UserService)applicationContext.getBean("userService");

		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}

}
