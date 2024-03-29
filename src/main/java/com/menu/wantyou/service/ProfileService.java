package com.menu.wantyou.service;

import com.menu.wantyou.domain.Profile;
import com.menu.wantyou.dto.profile.ProfileReqDTO;
import com.menu.wantyou.lib.exception.NotFoundException;

public interface ProfileService {
    Profile findByUsername(String username) throws NotFoundException;
    Profile update(String username, ProfileReqDTO updateProfileDTO) throws NotFoundException;
}
