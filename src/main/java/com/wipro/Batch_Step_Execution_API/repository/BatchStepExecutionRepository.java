package com.wipro.Batch_Step_Execution_API.repository;

import com.wipro.Batch_Step_Execution_API.entity.Batch_Step_Execution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BatchStepExecutionRepository extends JpaRepository<Batch_Step_Execution,Integer>, CrudRepository<Batch_Step_Execution,Integer> {
}
