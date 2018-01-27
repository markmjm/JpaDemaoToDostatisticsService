package com.mjm.statisticsmicroservice.controllers;


import com.mjm.statisticsmicroservice.services.StatisticsService;
import com.mjm.statisticsmicroservice.utilities.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    StatisticsService statisticsService;

    @CrossOrigin
    @RequestMapping("/getStatistics")
    public ResponseEntity<JsonResponseBody> getStatistics(@RequestParam(value="jwt") String jwt,
                                                          @RequestParam(value="email") String email){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), statisticsService.getStatistics(jwt,email)));
    }

    @CrossOrigin
    @RequestMapping("/test")
    public String test(){
        return "StatisticsMicroservice works correctly";
    }
}
