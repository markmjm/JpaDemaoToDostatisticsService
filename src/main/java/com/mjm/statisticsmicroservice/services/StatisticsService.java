package com.mjm.statisticsmicroservice.services;

import com.mjm.statisticsmicroservice.entities.Statistics;

import java.util.List;

public interface StatisticsService {
    List<Statistics> getStatistics(String jwt, String email);
}
