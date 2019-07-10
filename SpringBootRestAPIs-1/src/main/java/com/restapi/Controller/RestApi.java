package com.restapi.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.algo.KNN;
import com.restapi.bean.Data;
import com.restapi.bean.Result;
 
@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class RestApi {
 
  @PostMapping("/calculator")
  @ResponseBody
  public Result calculator(@RequestBody Data data) {
	  System.out.println("Data recived : "+data);
	  Result result = KNN.computeKNN(data);
    return result;
  }
}