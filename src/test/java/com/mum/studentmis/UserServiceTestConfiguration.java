package com.mum.studentmis;

import com.mum.studentmis.service.UserService;
import com.mum.studentmis.service.UserServiceImpl;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class UserServiceTestConfiguration {

    @Bean
    @Primary
    public UserService userService(){
        return Mockito.mock(UserService.class);
    }
}
