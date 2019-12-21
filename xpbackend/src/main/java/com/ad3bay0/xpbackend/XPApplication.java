package com.ad3bay0.xpbackend;

import com.ad3bay0.xpbackend.util.AppConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class XPApplication {

	@PostConstruct
	void init(){
		TimeZone.setDefault(TimeZone.getTimeZone(AppConstants.UTC));
	}


	public static void main(String[] args) {
		SpringApplication.run(XPApplication.class, args);
	}

}
