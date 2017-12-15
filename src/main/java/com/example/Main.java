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

package com.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.CounterModel;
import com.example.service.CounterServiceInterface;

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

  @RequestMapping(method=RequestMethod.GET,value="/fetchCurrentTimeAndCount",produces=MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  CounterModel fetchCurrentTimeAndCount() {
	  CounterModel counterModel =new CounterModel();
	  try  {
		  counterModel= counterServiceInterface.fetchCurrentTimeAndCount();
		  return counterModel;
	  } catch (Exception e) {

	  }
	  return counterModel;
  }

 

}
