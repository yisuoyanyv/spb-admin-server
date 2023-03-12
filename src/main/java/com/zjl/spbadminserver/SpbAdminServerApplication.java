package com.zjl.spbadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpbAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbAdminServerApplication.class, args);
    }

}
