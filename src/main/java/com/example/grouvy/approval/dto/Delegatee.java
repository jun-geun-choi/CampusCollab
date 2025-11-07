package com.example.grouvy.approval.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Delegatee")
public class Delegatee {
    private String name;
    private Date startDate;
    private Date endDate;
    private String reason;
    private int delegationNo;
}
