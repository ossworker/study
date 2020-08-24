package com.workoss.study.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@DisplayName("测试常用断言")
public class AssertionTestCaseTest {

	private HelloServiceImpl helloServiceImpl;

	@BeforeEach
	public void setUp() {
		helloServiceImpl = new HelloServiceImpl();
	}

	@Test
	public void testObj() {
		Assertions.assertNotNull(helloServiceImpl.testRtnObject());
		Assertions.assertEquals(new Object(), helloServiceImpl.testRtnObject(), "2个object不能为空");
	}

	@Test
	public void testString() {
		Assertions.assertEquals("hello", helloServiceImpl.testRtnString());
	}

	@Test
	public void testThrow() {
		Assertions.assertThrows(RuntimeException.class, () -> helloServiceImpl.testThrowException());
	}

	@Test
	public void testTimeout() {
		Assertions.assertTimeout(Duration.ofSeconds(1), () -> TimeUnit.SECONDS.sleep(2));
	}

	@Test
	public void testArray() {
		int[] expectedArray = new int[] { 1, 2, 3 };
		Assertions.assertArrayEquals(expectedArray, helloServiceImpl.testRtnArray(), "array 不相同");
	}

}
