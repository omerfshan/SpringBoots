package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import UserServices.UserServices;
import com.omersahan.entity.User;
@Configuration
public class AppConfig {

	@Bean
	public UserServices UserSevice() {
		UserServices userServices =new UserServices();
		List<User> userList=new ArrayList<>();
		userList.add(new User("Enes"));
		userList.add(new User("Harun"));
		
		userServices.setUserList(userList);
		return userServices;
	}
}
