package com.onlinebooking.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class SubscriberController {
	
	@GetMapping(value="show-subscribers")
	public String showSubscribers() {
		return "showsubscribers";
	}
	
	@PostMapping(value="add-subscriber")
	public String addSubscriber() {
		return "addsubscriber";
	}
	
	@PutMapping(value="edit-subscriber")
	public String editSubscriber() {
		return "editsubscriber";
	}
	
	@DeleteMapping(value="delete-subscriber")
	public String deleteSubscriber() {
		return "deletesubscriber";
	}

}
