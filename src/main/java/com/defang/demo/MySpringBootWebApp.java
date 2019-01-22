package com.defang.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.defang.demo.service.AssignService;

/**
 * @Description
 * @author 张国豪
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubboConfiguration
@EnableTransactionManagement
@ComponentScan({ "com.defang" })
@EnableScheduling
public class MySpringBootWebApp {
	private static Logger logger = LoggerFactory.getLogger(MySpringBootWebApp.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplication(MySpringBootWebApp.class).run(args);
		AssignService assignService = context.getBean(AssignService.class);
		assignService.findById("14070e0e3cfe403098fa9ca37e8e7e76");
	}

}
