package com.lieng.reiji;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j
@SpringBootApplication
@MapperScan("com.lieng.reiji.mapper")
@ServletComponentScan
public class ReijiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReijiApplication.class, args);
        log.info("success");
    }

}
