package com.onlinebooking.app.service;

import java.util.List;

import com.onlinebooking.app.model.Subscriber;

public interface SubscriberService {
	
	public List<Subscriber> getAll();
	
	public Subscriber findOneById(int id);
	
	public Subscriber deleteSubscriber(int id);
	
	public Subscriber save(Subscriber subscriber);

}
