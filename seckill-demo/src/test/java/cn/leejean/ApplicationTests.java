package cn.leejean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.leejean.util.RedisUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private RedisUtil redisUtil;

	@Test
	public void add() throws Exception {
		try {
			// 保存字符串
			boolean add = redisUtil.add("98734", "lijean");
			System.out.println(add);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
