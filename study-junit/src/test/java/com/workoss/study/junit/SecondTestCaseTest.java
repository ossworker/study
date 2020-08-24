package com.workoss.study.junit;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@DisplayName("测试常用注解")
public class SecondTestCaseTest {

	@Tag("testAnno")
	@DisplayName("测试@Test")
	@Test
	public void testMethod(){
		System.err.println("@Test -- testMethod");
	}

	@Tag("testAnno")
	@DisplayName("测试@Disabled")
	@Disabled("ignore")
	public void testIgnoreMethod(){
		System.err.println("@Disabled -- testIgnoreMethod");
	}

	@DisplayName("测试@Nested")
	@Nested
	class FirstNestTest {
		@Test
		void test(){
			System.err.println("@Nested -- test");
		}
	}


	@DisplayName("测试@RepeatedTest")
	@RepeatedTest(value = 3,name = "{displayName} 第{currentRepetition}次")
	public void testRepeatedMethod(){
		System.err.println("@RepeatedTest -- testRepeatedMethod");
	}


	@DisplayName("测试@Timeout")
	@Timeout(value = 1,unit = TimeUnit.SECONDS)
	@Test
	public void testTimeoutMethod() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}
}
