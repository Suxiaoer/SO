package cn.com.sixone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"})
public class TestAOP {
   @Autowired
   ApplicationContext ctx;
   
   @Test
   public void testAOP(){
	   User user = new User();
	   user.setName("suzhihan");
	   user.setId(6);
	   UserService userService = (UserService)ctx.getBean("userServiceImpl");
	   userService.insertUser(user);
   }
}
