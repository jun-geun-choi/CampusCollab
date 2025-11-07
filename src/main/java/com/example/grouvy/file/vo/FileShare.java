package com.example.grouvy.file.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileShare {
    private int shareId;
    private Date createdDate;
    private Date updatedDate;

    // 나중에 객체로 바꿀수도
    private int fileOwnerId;
    private int targetUserId;
    private int fileId;
}
