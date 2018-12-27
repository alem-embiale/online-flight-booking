package com.onlinebooking.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlinebooking.app.model.Subscriber;
import com.onlinebooking.app.repository.SubscriberRepository;
import com.onlinebooking.app.service.SubscriberService;

@Service
@Transactional
public class SubscriberServiceImpl implements SubscriberService {

	@Autowired
	SubscriberRepository subscriberRepository;
	
	Subscriber subscriber;
	@Override
	public List<Subscriber> getAll() {
		
		return (List<Subscriber>)subscriberRepository.findAll();
	}

	@Override
	public Subscriber findOneById(int id) {
		
		return subscriberRepository.findOne(id);
	}

	@Override
	public Subscriber deleteSubscriber(int id) {
		
		subscriber = subscriberRepository.findOne(id);
		 subscriberRepository.delete(subscriber);
		 return subscriber;
	}

	@Override
	public Subscriber save(Subscriber subscriber) {
		
		return subscriberRepository.save(subscriber);
	}

}
