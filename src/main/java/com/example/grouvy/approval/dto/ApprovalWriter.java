package com.example.grouvy.approval.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ApprovalWriter")
public class ApprovalWriter {
    private String writerName;
    private int writerId;
    private Date createdDate;
    private String positionName;
}
