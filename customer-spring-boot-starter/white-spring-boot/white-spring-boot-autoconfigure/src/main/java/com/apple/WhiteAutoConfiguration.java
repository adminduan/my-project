package com.apple;

import com.apple.core.UserFactory;
import com.apple.core.UserService;
import com.apple.core.impl.UserServiceImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * @author duanlsh
 * @description 自动配置
 * @date 2019/7/25
 */
@Configuration
@EnableConfigurationProperties(WhiteProperties.class)
@ConditionalOnBean(UserFactory.class)
@Getter
@Setter
public class WhiteAutoConfiguration {

    @Autowired
    private WhiteProperties whiteProperties;

    @Autowired
    private UserFactory userFactory;

//    public WhiteAutoConfiguration(UserFactory userFactory){
//        this.userFactory = userFactory;
//    }

    @Bean
    @ConfigurationProperties(prefix = "white")
    public Properties properties(){
        return new Properties();
    }

    @PostConstruct
    public void init(){
        Properties p = whiteProperties.getProperties();
        System.out.println(p);
        System.out.println(userFactory.show());
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}
