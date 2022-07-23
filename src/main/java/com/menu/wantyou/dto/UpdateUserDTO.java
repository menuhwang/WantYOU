package com.menu.wantyou.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDTO {
    @Size(min = 8, max = 16)
    private String password;
    @Email
    private String email;
    @Size(min = 2, max = 10)
    private String nickname;
}
