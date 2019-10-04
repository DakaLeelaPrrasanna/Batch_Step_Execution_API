package com.wipro.Batch_Step_Execution_API.controller;


import com.wipro.Batch_Step_Execution_API.entity.Batch_Step_Execution;
import com.wipro.Batch_Step_Execution_API.repository.BatchStepExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/database")
public class BatchStepExecution {

    @Autowired
    BatchStepExecutionRepository batchStepExecutionRepository;

    @GetMapping("/getAllRecords")
    public List<Batch_Step_Execution> getAllRecords(){
      return batchStepExecutionRepository.findAll();
    }
}
