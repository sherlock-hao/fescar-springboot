package com.defang.demo.config;

import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * fescar配置
 * 
 * @Description
 * @author 张国豪
 */
@Configuration
public class FescarConfiguration {

	@Value("${spring.application.name}")
	private String applicationId;

	/**
	 * 注册一个StatViewServlet
	 * 
	 * @return
	 */
	@Bean
	public GlobalTransactionScanner globalTransactionScanner() {
		GlobalTransactionScanner globalTransactionScanner = new GlobalTransactionScanner(applicationId, "receivables");
		return globalTransactionScanner;
	}
}
