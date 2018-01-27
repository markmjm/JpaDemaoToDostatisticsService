package com.mjm.statisticsmicroservice.daos;

import com.mjm.statisticsmicroservice.entities.Statistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StatisticsDao extends CrudRepository<Statistics, Integer> {

    @Query(value = "select * from latest_statistics where email = :email order by date desc limit 10", nativeQuery = true)
    public List<Statistics> getLastStatistics(@Param("email") final String email);

}
