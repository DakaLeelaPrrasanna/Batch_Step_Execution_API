package com.wipro.Batch_Step_Execution_API.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Batch_Step_Execution {

    @Id
    private Integer STEP_EXECUTION_ID;

    private Integer VERSION;
    private String STEP_NAME;
    private Integer JOB_EXECUTION_ID;
    private Timestamp START_TIME;
    private Timestamp END_TIME;
    private String STATUS;
    private Integer COMMIT_COUNT;
    private Integer READ_COUNT;
    private Integer FILTER_COUNT;
    private Integer WRITE_COUNT;
    private Integer READ_SKIP_COUNT;
    private Integer WRITE_SKIP_COUNT;
    private Integer PROCESS_SKIP_COUNT;
    private Integer ROLLBACK_COUNT;
    private String EXIT_CODE;
    private String EXIT_MESSAGE;
    private Timestamp LAST_UPDATED;

}
