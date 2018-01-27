package com.mjm.statisticsmicroservice.utilities;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class JsonResponseBody {

    private  int server;
    private Object response;
}

