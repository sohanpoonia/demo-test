package com.example.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.exception.ApplicationException;
import com.example.model.CounterModel;
import com.example.service.CounterServiceInterface;
import com.example.utility.DateUtility;

@Service
public class CounterServiceInterfaceImpl implements CounterServiceInterface {
	private AtomicInteger counter=new AtomicInteger();
	@Override
	public CounterModel fetchCurrentTimeAndCount() {
		CounterModel counterModel=new CounterModel();
		counterModel.setCalls(counter.incrementAndGet());
		counterModel.setTimestamp(DateUtility.formatCurrentDate());
		return null;
	}

	@Override
	public CounterModel create(CounterModel object) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CounterModel update(CounterModel object) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CounterModel delete(CounterModel object) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
