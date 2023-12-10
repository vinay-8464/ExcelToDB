package com.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.repo.ProductRepo;

@SpringBootTest
class LibapiApplicationTests {

	@Autowired
	private ProductRepo productRepo;
    @Test
    void contextLoads() {
    }
    
    @Test
    public void testProductRepo() {
    	System.out.println("test started");
    }

}
