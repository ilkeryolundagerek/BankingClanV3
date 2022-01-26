package com.iyg.bankingclan.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages={"com.iyg.bankingclan.repository", "com.iyg.bankingclan.service","com.iyg.bankingclan.web.controller"})
@EntityScan("com.iyg.bankingclan.entity.*")
@Import({InfrastructureConfig.class})
@EnableJpaRepositories("com.iyg.bankingclan.repository")
public class AppConfig {
	
}
