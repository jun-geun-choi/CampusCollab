package com.example.grouvy.file.dto.response;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditFileForm {
    private int fileId;
    private String originalName;
    private String ownerType;
    private int uploaderId;
    private int uploaderDepartmentId;
    private int fileCategoryId;
    private String shareStatus;

    // 개인이고 공유설정이 되었다면
    private List<TargetUser> targetUsers = new ArrayList<>();
    private List<Integer> targetUserIds;
}
