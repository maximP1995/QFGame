package com.proschan.gameserver;


import com.proschan.gameserver.mapper.UserMapper;
import com.proschan.gameserver.model.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameserverApplicationTests {


//	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
//		userMapper.insert("winterchen", "123456", "12345678910");
		TUser u = userMapper.findUserByPhone("12345678910");
		System.out.println(u.toString() + "!");
//		Assert.assertEquals("winterchen", u.getName());
	}
}