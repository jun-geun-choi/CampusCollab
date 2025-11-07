package com.example.grouvy.approval.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ApprovalFile")
public class ApprovalFile {
    private int fileNo;
    private String fileName;
    private String filePath;
    private int fileSize;
    private String fileType;
    private Date uploadedDate;
    private int approvalNo;
}
