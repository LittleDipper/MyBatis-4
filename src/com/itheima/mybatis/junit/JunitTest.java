package com.itheima.mybatis.junit;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;
import com.itheima.mybatis.pojo.UserExample;

public class JunitTest {
	@Test
	public void testMapper() throws Exception {
		
		//创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//从容器中获取Mapper层实例对象
		UserMapper userMapper = ac.getBean(UserMapper.class);
		
		//创建查询条件
		UserExample userExample = new UserExample();
		
		//查询出表中的总数据行数(不设置条件进行查询，就是查询总行数)
		int countTotalUser = userMapper.countByExample(userExample);
		System.out.println(countTotalUser);
		
		//查询满足条件的行数
		userExample.createCriteria().andSexEqualTo("男").andUsernameLike("%"+"明"+"%");
		int countSelectiveUser = userMapper.countByExample(userExample);
		System.out.println(countSelectiveUser);
		
		//插入一个用户
//		User user = new User();
//		user.setUsername("张三丰");
//		user.setSex("男");
//		user.setBirthday(new Date(System.currentTimeMillis()));
//		user.setAddress("广东深圳");
//		int insert = userMapper.insert(user);
//		System.out.println(insert);
//		//根据对象有选择的进行插入
//		userMapper.insertSelective(user);
		
		//删除用户
//		userMapper.deleteByPrimaryKey(40);
//		
//		UserExample userExample2 = new UserExample();
//		userExample2.createCriteria().andUsernameEqualTo("何炅");
//		userMapper.deleteByExample(userExample2);
		
		//查询用户
//		UserExample userExample3 = new UserExample();
//		userExample3.createCriteria().andSexEqualTo("男").andIdEqualTo(25);
//		userExample3.setOrderByClause("id desc");
//		userExample3.setDistinct(true);
//		List<User> selectByExample = userMapper.selectByExample(userExample3);
//		for (User user : selectByExample) {
//			System.out.println(user);
//		}
		
//		//查询单个用户
//		User selectByPrimaryKey = userMapper.selectByPrimaryKey(25);
//		//对查询出来的用户进行更新，通过Id更新
//		selectByPrimaryKey.setAddress("北京天安门");
//		selectByPrimaryKey.setSex("女");
//		//更新用户
//		userMapper.updateByPrimaryKey(selectByPrimaryKey);
//		//更新完之后再查
//		//查询单个用户
//		User selectByPrimaryKey1 = userMapper.selectByPrimaryKey(25);
//		System.out.println(selectByPrimaryKey1);
		
		
		//查询单个用户
		User selectByPrimaryKey_1 = userMapper.selectByPrimaryKey(25);
		UserExample userExample4 = new UserExample();
		userExample4.createCriteria().andSexEqualTo("1");
		//对查询出来的用户进行更新，通过Id更新
		selectByPrimaryKey_1.setAddress("澳大利亚");
		//更新用户
//		userMapper.updateByPrimaryKey(selectByPrimaryKey_1);
		userMapper.updateByExample(selectByPrimaryKey_1, userExample4);
		//更新完之后再查
		//查询单个用户
		User selectByPrimaryKey2 = userMapper.selectByPrimaryKey(25);
		System.out.println(selectByPrimaryKey2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		UserExample userExample3 = new UserExample();
//		List<User> selectByExample = userMapper.selectByExample(userExample3);
//		for (User user : selectByExample) {
//			System.out.println(user);
//		}
		
		
		
//		//增加(插入)
//		//根据对象进行插入
//		userMapper.insert(record);
//		//根据对象有选择的进行插入
//		userMapper.insertSelective(record);
//		
//		//删除
//		//根据主键进行删除
//		userMapper.deleteByPrimaryKey(id);
//		//根据条件进行删除
//		userMapper.deleteByExample(example);
//		
//		//改（更新）
//		//根据主键更新
//		userMapper.updateByPrimaryKey(record);
//		//根据主键有选择性的更新
//		userMapper.updateByPrimaryKeySelective(record);
//		//根据条件进行更新
//		userMapper.updateByExample(record, example);
//		//根据条件进行有选择性的更新
//		userMapper.updateByExampleSelective(record, example);
//		
//		//查
//		//根据主键进行查询
//		userMapper.selectByPrimaryKey(id);
//		//根据条件进行查询
//		userMapper.selectByExample(example);
		
	}
}
