package com.example.CustomerProfile;

import com.example.CustomerProfile.model.Profile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@SpringBootApplication
public class CustomerProfileApplication {
	Logger l = Logger.getLogger(getClass().getName());

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileApplication.class, args);
	}

	@Bean
	public Map<Integer, Profile> profspec(){
		Map<Integer, Profile> profileMap = new HashMap<>();
		profileMap.put(1,new Profile(1,2,"nana","male"));
		l.info("we are i proff spec.");
		return profileMap;
	}

}
