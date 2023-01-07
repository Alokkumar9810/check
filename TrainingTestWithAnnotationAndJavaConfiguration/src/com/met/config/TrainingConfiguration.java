package com.met.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.met.model.JavaTrainer;
import com.met.model.Trainer;

@Configuration
@ComponentScan(basePackages ="com.met.model")
@PropertySource("app.properties")
public class TrainingConfiguration {
		
		@Value("${jt1.name}")
		private String trainer1Name;
		
		@Value("#{${jt1.subjects}}")
		private List<String> trainer1Subjects;
		
		
		@Bean
		
		public Trainer javatrainer() {
			
			Trainer javaTrainer = new JavaTrainer(trainer1Name, trainer1Subjects);
			return javaTrainer;
		}
		
		@Value("${jt2.name}")
		private String trainer2Name;
		
		@Value("#{${jt2.subjects}}")
		private List<String> trainer2Subjects;
		
		
		@Bean//("trainer")
		
		public Trainer javatrainer1() {
			
			Trainer javaTrainer = new JavaTrainer(trainer2Name, trainer2Subjects);
			return javaTrainer;
		}
}
