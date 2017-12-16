/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gilbarco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gilbarco.exception.ApplicationException;
import com.gilbarco.model.CounterModel;
import com.gilbarco.service.CounterServiceInterface;
/**
 * 
 * @author sohan.lal
 *
 */

@Controller
@SpringBootApplication
public class Main {
  @Autowired CounterServiceInterface counterServiceInterface;

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/")
  String index() {
    return "index";
  }
 /**
   * URL-https://young-plateau-50994.herokuapp.com/fetchCurrentTimeAndCount
   * @return
   */
  @RequestMapping(method=RequestMethod.GET,value="/fetchCurrentTimeAndCount",produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  CounterModel fetchCurrentTimeAndCount() {
	  // ApplicationLogger.info(Main.class, "Method fetchCurrentTimeAndCount start");
	  //We can enable looger by configure the path in YML or properties file
	  //logging:  file:  D:\logs\coutner.log
	  CounterModel counterModel =null;
	  try  {
		  counterModel= counterServiceInterface.fetchCurrentTimeAndCount();
	  } catch (ApplicationException e) {
            //here we can handle the user defined exception and send the response code 
            // ApplicationLogger.error(Main.class, e);
	  }
	   // ApplicationLogger.info(Main.class, "Method fetchCurrentTimeAndCount end");
	  return counterModel;
  }

 

}
