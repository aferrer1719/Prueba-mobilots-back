package com.mesaj.app.confg;


import com.mesaj.app.confg.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import util.driver.DriverFactory;

import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "com.mesaj.app")
@PropertySource("classpath:/application-dev.properties")
//@PropertySource("classpath:/application-${enviroment}.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webdriverWaitTimeOut;

    @Bean
    public WebDriver webDriver() {
        return DriverFactory.get(driverType);
    }
       @Bean
       public WebDriverWait waitFor() {
        return new WebDriverWait(webDriver(),Duration.ofSeconds(webdriverWaitTimeOut));

       }

    }

