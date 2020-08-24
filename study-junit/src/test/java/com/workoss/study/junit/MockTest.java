package com.workoss.study.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("测试简单Mock")
@ExtendWith(MockitoExtension.class)
public class MockTest {

	@Mock
	private List<String> list;

	@Mock
	private HelloService helloService;

	@Test
	public void test01() {
		list.addAll(Mockito.anyList());
		when(helloService.testRtnString()).thenReturn("hello");

		Assertions.assertEquals("hello", helloService.testRtnString());
	}

	@Test
	public void testInterface() {
		System.out.println(helloService.testRtnString());
	}

}
