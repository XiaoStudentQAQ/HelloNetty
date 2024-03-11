package com.jiakoukou.helloNetty;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HelloNettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloNettyApplication.class, args);
        log.info("原神，启动！");
    }

}
