package com.chand.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chand.topic.Topic;

@Service
public class TopicService {
	
	
	private List<Topic> list = new ArrayList<>(Arrays.asList(
			new Topic("1", "spring-framework", "Spring framework"),
			new Topic("2", "spring-boot", "Spring Boot"),
			new Topic("3", "spring-app", "Spring Application")
			));
	
	public List<Topic> getAllTopics(){
		return list;
		//List<Topic> topics = new ArrayList<>();
		//return topics;
	}
	
	public Topic getTopic(String id){
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		
	}
	
	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<list.size();i++) {
			Topic t = list.get(i);
			if(t.getId().equals(id)) {
				list.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		list.removeIf(i->i.getId().equals(id));
	}
	
}
