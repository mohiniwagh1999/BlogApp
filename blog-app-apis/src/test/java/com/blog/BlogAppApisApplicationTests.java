package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repository.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private UserRepo userRepo;
	
   @Test
   public void repoTest()
   {
	   String classname=this.userRepo.getClass().getName();
	   System.out.println(classname);
   }
}
