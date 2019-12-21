package com.ad3bay0.xpbackend.repository;

import com.ad3bay0.xpbackend.enums.RoleName;
import com.ad3bay0.xpbackend.model.Role;

import java.util.Optional;

public interface RoleRepository {

    Optional<Role> findByName(RoleName roleName);
}
