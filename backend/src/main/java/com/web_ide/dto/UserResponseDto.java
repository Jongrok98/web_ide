package com.web_ide.dto;

import com.web_ide.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private Long id;
    private String loginId;
    private String password;
    private String nickname;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.loginId = user.getLoginId();
        this.nickname = user.getNickname();
    }

    public static UserResponseDto fromEntity(User user) {
        return new UserResponseDto(user);
    }
}
