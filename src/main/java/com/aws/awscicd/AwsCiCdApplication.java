package com.aws.awscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class AwsCiCdApplication {
	@GetMapping("/getAll")
	public List<Student> getData(){
		List<Student> list=new ArrayList<>();
		Student s1=new Student(1L,"shalem","ECE");
		Student s2=new Student(2L,"Chintu","CSE");
		Student s3=new Student(3L,"Philip","EEE");
		Student s4=new Student(4L,"Fruity","B.Sc");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return list;
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsCiCdApplication.class, args);
	}

}
