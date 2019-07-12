package com.xztqd.tjb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xztqd.tjb.mapper")
@SpringBootApplication
public class TjbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TjbApplication.class, args);
    }

}
