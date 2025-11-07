package com.example.grouvy.approval.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("MyRequestApproval")
public class MyRequestApproval {
    private int approvalNo;
    private String title;
    private String status;
    private Date createdDate;
    private Date approvedDate;

}
