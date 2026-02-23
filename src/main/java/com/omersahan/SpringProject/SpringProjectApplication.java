package com.omersahan.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.omersahan.entity.User;
import UserServices.UserServices;
import config.AppConfig;

public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserServices userServices =context.getBean(UserServices.class);
		
		for (User user:userServices.getUserList()) {
			System.out.println(user.getName());
		}
				
	}

}
