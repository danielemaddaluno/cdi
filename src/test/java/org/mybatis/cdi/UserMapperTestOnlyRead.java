package org.mybatis.cdi;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(WeldJUnit4Runner.class)
public class UserMapperTestOnlyRead {

	@Inject
	@OtherQualifier
	@MySpecialManager
	UserMapper userMapper;

	@Test
	public void t1_count() {
		Integer number = userMapper.countUsers();
		assertEquals(Integer.valueOf(3), number);
	}
}
