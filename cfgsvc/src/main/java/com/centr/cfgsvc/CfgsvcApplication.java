package com.centr.cfgsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Refresh Strategies
 * https://soshace.com/spring-cloud-config-refresh-strategies/
 *
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
itt tartottam :
https://soshace.com/spring-cloud-config-refresh-strategies/
curl -X GET localhost:8888/actuator/bus-refresh -d {} -H "Content-Type: application/json"
{"name":"actuator","profiles":["bus-refresh"],"label":null,"version":"0b80b33ec75c0f6a419be7ef8c5ea66359c64730","state":null,"propertySources":[]}tamas:~/projektek/centrcfgsvr/(springcloudbus)>
szoval hiba nelkul ter vissza
kell egy teszt, hogy mukodik-e ?
esetleg szkript tamogatast kesziteni hozza