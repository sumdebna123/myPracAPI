package com.test.springboot.first.myAPI.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private ServiceClass serviceClass;
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return serviceClass.getAllTopic();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return serviceClass.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic t) {
		serviceClass.addTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id) {
		serviceClass.updateTopic(id,t);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void updateTopic(@PathVariable String id) {
		serviceClass.deleteTopic(id);
	}

}
