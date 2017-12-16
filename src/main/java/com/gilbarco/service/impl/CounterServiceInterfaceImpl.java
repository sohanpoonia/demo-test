package com.gilbarco.service.impl;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.gilbarco.exception.ApplicationException;
import com.gilbarco.model.CounterModel;
import com.gilbarco.service.CounterServiceInterface;
import com.gilbarco.utility.DateUtility;
/**
 * 
 * @author sohan.lal
 *
 */
@Service
public class CounterServiceInterfaceImpl implements CounterServiceInterface {
	//by default the service is singleton but Atomic Integer will
	//be helpful to keep the count in multithreaded environment correctly
	//thus using this type for variable: counter.
	private final AtomicInteger counter=new AtomicInteger();
	@Override
	public CounterModel fetchCurrentTimeAndCount() throws ApplicationException {
		CounterModel counterModel=new CounterModel();
		counterModel.setCalls(counter.incrementAndGet());
		counterModel.setTimestamp(DateUtility.formatCurrentDate());
		return counterModel;
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
