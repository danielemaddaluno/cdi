package org.mybatis.cdi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UserMapperTestOnlyRead.class, UserMapperTestReadWrite.class })
public class JunitTestSuiteWriteNotWorking {
}
