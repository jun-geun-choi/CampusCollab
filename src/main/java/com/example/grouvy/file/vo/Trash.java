package com.example.grouvy.file.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("Trash")
public class Trash {
    private int trashId;
    private FileVo file;
    private Date deletedDate;
    private Date restoredDate;
}
