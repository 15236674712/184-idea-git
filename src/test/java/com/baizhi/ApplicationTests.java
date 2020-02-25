package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("这是第一次修改");
        System.out.println("这是第二次修改");
        int a = 10;
        int b = 20;
        System.out.println("这是第二次修改");

        System.out.println("开发者1");
        int a1 = 10;
        int b1 = 20;
        System.out.println("开发者1");
    }

}
