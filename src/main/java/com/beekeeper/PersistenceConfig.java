package com.beekeeper;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.net.URL;

@Configuration
@EnableTransactionManagement
@PropertySource({"classpath:jdbc.properties"})
public class PersistenceConfig {
    @Autowired
    private Environment environment;


    @Bean(name = "dataSource")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getProperty("db.Class"));
        dataSource.setUrl(environment.getProperty("db.url"));
        dataSource.setUsername(environment.getProperty("db.login"));
        dataSource.setPassword(environment.getProperty("db.password"));

        return dataSource;
    }
//    private String getURLToBd() {
//        String path = environment.getProperty("db.url");
//        String absolutePath;
//
//        URL url = this.getClass().getClassLoader().getResource("shapoval.mv.db");
//        absolutePath = url.getPath();
//
//        path += absolutePath.substring(0, absolutePath.length() - 6);
//
//        return path;
//    }
}
