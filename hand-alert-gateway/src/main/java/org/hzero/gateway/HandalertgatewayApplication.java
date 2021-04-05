package org.hzero.gateway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroGateway
@EnableDiscoveryClient

public class HandalertgatewayApplication {
    
        public static void main(String[] args) {
            try {
                new SpringApplicationBuilder(HandalertgatewayApplication.class)
                    .web(WebApplicationType.REACTIVE)
                    .run(args);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

}