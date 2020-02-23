package com.owlexa;

import com.owlexa.provider.service.FileUploadService;
import com.owlexa.provider.service.FileUploadServiceImpl;
import com.owlexa.provider.service.ProviderService;
import com.owlexa.provider.service.ProviderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class OwlexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwlexaApplication.class, args);
	}

	@Bean
	ProviderService providerService() {
		return new ProviderServiceImpl();
	}
	@Bean
	FileUploadService fileUploadService(){
		return new FileUploadServiceImpl();
	}
}
