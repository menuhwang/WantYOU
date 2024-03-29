package com.menu.wantyou.dto.profile;

import com.menu.wantyou.domain.Profile;
import com.menu.wantyou.lib.util.DateValidator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileReqDTO {
    private String name;

    @Size(min = 4, max = 4)
    private String birthYear;

    @Size(min = 4, max = 4)
    private String birthDay;

    private List<String> hobby;

    public Profile toEntity() {
        DateValidator.valid(birthYear, birthDay);
        return Profile.builder()
                .name(this.name)
                .birthYear(this.birthYear)
                .birthDay(this.birthDay)
                .hobby((hobby == null) ? null : String.join(";", this.hobby))
                .build();
    }
}
