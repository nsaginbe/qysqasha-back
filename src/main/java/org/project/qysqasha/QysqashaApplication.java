package org.project.qysqasha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QysqashaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QysqashaApplication.class, args);
    }

}
