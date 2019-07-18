package com.mum.studentmis;

import com.mum.studentmis.domain.User;
import com.mum.studentmis.repository.UserRepository;
import com.mum.studentmis.service.RoleServiceImpl;
import com.mum.studentmis.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class MockitoUserApplicationTests {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private RoleServiceImpl roleService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect(){
        User u = new User();
        u.setId(1l);

        List<User> users = userRepository.findAll();
        //assertThat(users.size(), is(greaterThanOrEqualTo(0)));

    }
}
