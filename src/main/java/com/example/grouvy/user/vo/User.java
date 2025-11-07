package com.example.grouvy.user.vo;

import com.example.grouvy.department.vo.Department;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Builder(toBuilder = true)
@AllArgsConstructor
@Alias("User")
public class User {
    private int userId;
    private Integer employeeNo;
    private String name;
    private String loginProvider;
    private String email;
    private String password;
    private String socialEmail;
    private String emailVerified;
    private String phoneNumber;
    private String address;
    private String profileImgPath;
    private Date createdDate;
    private Date updatedDate;
    private Date resignDate;

    private String employmentStatus;
    private String approvalStatus;

    private Long departmentId;
    private Department department;

    private Integer positionNo;

    private Position position;

    private List<String> roleNames;

}
