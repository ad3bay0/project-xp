package com.ad3bay0.xpbackend.repository;

import com.ad3bay0.xpbackend.enums.RoleName;
import com.ad3bay0.xpbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(RoleName roleName);
}
