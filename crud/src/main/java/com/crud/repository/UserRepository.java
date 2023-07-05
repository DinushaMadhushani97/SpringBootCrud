package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
