package com.example.grouvy.user.vo;

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
@AllArgsConstructor
@Alias("UserRole")
@Builder
public class UserRole {
    String roleName;
    Integer userId;

}
