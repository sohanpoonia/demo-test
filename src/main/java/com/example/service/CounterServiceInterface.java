package com.example.service;

import com.example.model.CounterModel;

public interface CounterServiceInterface extends GenericServiceInterface<CounterModel> {

public	CounterModel fetchCurrentTimeAndCount() ;

}
