package com.menu.wantyou.domain;

import com.menu.wantyou.dto.UserDTO;
import com.menu.wantyou.lib.enumeration.Role;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Domain Test")
class UserTest {
    private String username = "jack01";
    private String password = "passw0rd";
    private String email = "jack01@gmail.com";
    private String nickname = "jackson";

    @Test
    public void createUser() {
        User user = User.builder()
                        .username(username)
                        .password(password)
                        .email(email)
                        .nickname(nickname)
                        .build();

        assertNull(user.getId());
        assertEquals(Role.USER, user.getRole());
        assertTrue(user.isEnabled());
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
        assertEquals(email, user.getEmail());
        assertEquals(nickname, user.getNickname());
    }
    @Test
    public void updateUser() {
        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .nickname(nickname)
                .build();

        String update_password = "password";
        String update_email = "jack01@naver.com";

        UserDTO.Update updateUserDTO = UserDTO.Update.builder()
                                            .password(update_password)
                                            .email(update_email)
                                            .build();

        user.setPassword(updateUserDTO.getPassword());
        user.setEmail(updateUserDTO.getEmail());

        assertNull(user.getId());
        assertEquals(user.getUsername(), username);
        assertEquals(user.getPassword(), update_password);
        assertEquals(user.getEmail(), update_email);
        assertEquals(user.getNickname(), nickname);
    }
}