package com.wrw;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.wrw.test.pojo.Users;
import com.wrw.test.service.UsersServiceI;



public class TEst {
	
	
	
	@Test
	@Transactional
	public void testFindById() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersServiceI userServiceI =  context.getBean(UsersServiceI.class);
		//Users news = new Users();
		
		//news.setUserPhone(fateherId);
		
		//User newsw=userServiceI.findById(fateherId);
		List<Users>  list=userServiceI.findAll();
		 
		System.out.println(list);
	}

}
