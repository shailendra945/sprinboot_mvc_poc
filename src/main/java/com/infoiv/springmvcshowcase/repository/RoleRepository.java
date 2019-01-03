package com.infoiv.springmvcshowcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoiv.springmvcshowcase.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
