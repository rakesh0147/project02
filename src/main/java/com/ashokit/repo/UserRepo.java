package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Integer>{
	
	@Query(name="SELECT * FROM USER_DTLS WHERE EMAIL=:email",nativeQuery=true)
	public UserEntity getUserByEmail(String email);

}
