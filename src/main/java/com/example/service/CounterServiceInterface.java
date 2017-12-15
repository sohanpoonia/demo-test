package com.example.service;

import com.example.exception.ApplicationException;
import com.example.model.CounterModel;

public interface CounterServiceInterface extends GenericServiceInterface<CounterModel> {

public	CounterModel fetchCurrentTimeAndCount() throws ApplicationException;

}
