package com.nowcoder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;

//这行代码解决了无法使用dao
@MapperScan(annotationClass = Repository.class, basePackages = "com.nowcoder.dao")
@SpringBootApplication
@ImportResource({"classpath:velocity.xml"})
public class WendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WendaApplication.class, args);
	}
}
