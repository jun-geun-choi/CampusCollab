package com.example.grouvy.task.dto.response;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ModalFile")
public class ModalFile {
    private int fileId;
    private String ownerType;
    private String originalName;
    private int size;
    private String categoryName;
    private Date createdDate;
}
