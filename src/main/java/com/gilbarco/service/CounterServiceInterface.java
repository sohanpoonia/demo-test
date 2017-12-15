package com.gilbarco.service;

import com.gilbarco.exception.ApplicationException;
import com.gilbarco.model.CounterModel;

public interface CounterServiceInterface extends GenericServiceInterface<CounterModel> {

public	CounterModel fetchCurrentTimeAndCount() throws ApplicationException ;

}
