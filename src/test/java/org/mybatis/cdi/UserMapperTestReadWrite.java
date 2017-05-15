package org.mybatis.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(WeldJUnit4Runner.class)
public class UserMapperTestReadWrite {

	@Inject
	@OtherQualifier
	@MySpecialManager
	UserMapper userMapper;

	@Test
	public void t2_count() {
		Integer number = userMapper.countUsers();
		assertEquals(Integer.valueOf(3), number);
	}

	
	@Test
	@Interceptors(JtaTransactionInterceptor.class)
	@Transactional(rollbackOnly = true)
	public void t1_insert() {
		int sizeBefore = userMapper.countUsers();
		
		User user = new User();
	    user.setId(99);
	    user.setName("User99");
		userMapper.insertUser(user);
		
		int sizeAfter = userMapper.countUsers();
		assertEquals(sizeBefore + 1, sizeAfter);
	}
}
