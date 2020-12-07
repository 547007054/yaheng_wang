package com.cn.yh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={DemoApplication.class})
public class DemoApplicationTests {

	@Test
	public void contextLoads() {

		System.out.println("测试成功");
	}

}
