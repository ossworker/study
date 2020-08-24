package com.workoss.study.junit;

import org.junit.jupiter.api.*;

@DisplayName("第一个Junit5测试用例 常用注解顺序")
public class FirstTestCaseTest {

	@Tag("testOrder")
	@BeforeAll
	static void runOnceBeforeClass() {
		System.out.println("@BeforeAll -- runOnceBeforeClass");
	}

	@Tag("testOrder")
	@AfterAll
	static void runOnceAfterClass() {
		System.out.println("@AfterAll -- runOnceAfterClass");
	}

	@Tag("testOrder")
	@BeforeEach
	public void runBeforeTestMethod() {
		System.out.println("@BeforeEach -- runBeforeTestMethod");
	}

	@Tag("testOrder")
	@AfterEach
	public void runAfterTestMethod() {
		System.out.println("@AfterEach -- runAfterTestMethod");
	}

	@Tag("testOrder")
	@DisplayName("测试testMethod1")
	@Test
	public void testMethod1() {
		System.err.println("@Test -- testMethod1");
	}

	@Tag("testOrder")
	@DisplayName("测试testMethod2")
	@Test
	public void testMethod2() {
		System.err.println("@Test -- testMethod2");
	}

}
