package com.centr.cfgsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * http://localhost:8888/cli/default
 */
@EnableConfigServer
@SpringBootApplication
public class CfgsvcApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(CfgsvcApplication.class, args);
	}

}
