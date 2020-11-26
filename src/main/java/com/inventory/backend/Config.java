package com.inventory.backend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;
 

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class Config {
    @NotNull
    private String appUrl;
 
    public String getAppUrl() {
        return appUrl;
    }
}