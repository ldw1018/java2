package com.bdqn.oop;

import com.bdqn.oop.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OopApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test(){
        boolean userService = applicationContext.containsBean("userService");
        System.out.println(userService);
		 System.out.println(userService);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
