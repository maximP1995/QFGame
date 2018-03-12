package com.proschan.gameserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.proschan.gameserver.mapper")
public class GameserverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GameserverApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GameserverApplication.class);
    }

//	@RequestMapping("/")
//	String index() {
//		return "Welcome to game server!";
//	}
}
