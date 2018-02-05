package com.example.demo.Repositories;

import com.example.demo.Classes.CleaningItems;
import org.hibernate.jpa.criteria.expression.function.AggregationFunction;
import org.springframework.data.repository.CrudRepository;

public interface CleaningRepository extends CrudRepository<CleaningItems,Long>{

}
