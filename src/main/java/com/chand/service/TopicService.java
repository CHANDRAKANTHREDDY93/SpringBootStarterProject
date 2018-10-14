package com.chand.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chand.topic.Topic;

@Service
public class TopicService {
	
	private List<Topic> list =Arrays.asList(
			new Topic("1", "spring-framework", "Spring framework"),
			new Topic("2", "spring-boot", "Spring Boot"),
			new Topic("3", "spring-app", "Spring Application")
			);
	
	public List<Topic> getAllTopics(){
		return list;
	}
}
