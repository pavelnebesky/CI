package com.greenfoxacademy.TribesBackend;

import static org.assertj.core.api.Assertions.assertThat;

import com.greenfoxacademy.TribesBackend.controllers.HomeController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TribesBackendApplicationTests {


	@Autowired
	private HomeController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
