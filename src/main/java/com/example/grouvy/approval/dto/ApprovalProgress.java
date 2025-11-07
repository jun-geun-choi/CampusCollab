package com.example.grouvy.approval.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ApprovalProgress")
public class ApprovalProgress {
    private int approvalNo;
    private String title;
    private String writerName;
    private String requestDepartmentName;
    private Date createdDate;
    private Date completedDate;
}
