package com.example.grouvy.task.dto.request;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Alias("TaskForm")
public class TaskForm {
    private int writerId;
    private String title;
    private String content;
    private String type;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    private int receiveUserId;
    private List<Integer> ccUserIds;

    private List<MultipartFile> localFiles;
    private List<Integer> existingFileIds;
}
