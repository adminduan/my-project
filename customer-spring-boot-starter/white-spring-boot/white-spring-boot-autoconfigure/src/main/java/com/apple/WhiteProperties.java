package com.apple;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

/**
 * @author duanlsh
 * @description TODO
 * @date 2019/7/25
 */
@ConfigurationProperties(prefix = "white")
@Getter
@Setter
public class WhiteProperties {

    private Properties properties = new Properties();

    public Properties getProperties() {
        return this.properties;
    }

    private String userName;

    private Integer age;
}
