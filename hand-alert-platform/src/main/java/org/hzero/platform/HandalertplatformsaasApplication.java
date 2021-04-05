package org.hzero.platform;

import org.hzero.autoconfigure.platform.EnableHZeroPlatform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableHZeroPlatform
@EnableDiscoveryClient
@SpringBootApplication

public class HandalertplatformsaasApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(HandalertplatformsaasApplication.class, args);
        }

}