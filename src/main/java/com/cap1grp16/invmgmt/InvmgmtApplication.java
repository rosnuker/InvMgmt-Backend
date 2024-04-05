package com.cap1grp16.invmgmt;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvmgmtApplication {

	static Logger logger = Logger.getLogger(InvmgmtApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(InvmgmtApplication.class, args);

		logger.info("Backend is up and running!");
	}

}
