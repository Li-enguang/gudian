package com.lieng.reiji;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan({"com.lieng.reiji.mapper"})
/* loaded from: reiji-1.0-SNAPSHOT.jar:BOOT-INF/classes/com/lieng/reiji/ReijiApplication.class */
public class ReijiApplication {
    private static final Logger log = LoggerFactory.getLogger(ReijiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReijiApplication.class, args);
        log.info("success");
    }
}