package com.example.grouvy.approval.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Approver")
public class Approver {
    private int no;
    private int approverId;
    private int approvalNo;
    private int step;
    private String status;
    private Date approvedDate;
    private String opinion;
    private Date assignedDate;
    private Integer delegateeNo;
}
