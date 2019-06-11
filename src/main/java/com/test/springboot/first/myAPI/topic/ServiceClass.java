package com.test.springboot.first.myAPI.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("test1", "test2", "test3"),
			new Topic("test2", "test3", "test1"),
			new Topic("test3", "test1", "test2")
			));
	public List<Topic> getAllTopic() {
		return topics;
		
	}

	public Topic getTopic(String id) {
		return  topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic t) {
		topics.add(t);
	}

	public void updateTopic(String id, Topic t) {
		for (Topic t1 : topics) {
			if (id.equals(t1.getId())) {
				t1.setDescription(t.getDescription());
				t1.setName(t.getName());
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}

	

}
