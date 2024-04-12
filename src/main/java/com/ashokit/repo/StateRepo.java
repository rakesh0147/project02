package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.StateEntity;

public interface StateRepo extends JpaRepository<StateEntity,Integer>{
	
	@Query(name = "SELECT * FROM STATE_MASTER WHERE COUNTRY_ID=:cid",nativeQuery = true)
	public List<StateEntity> findAllById(Integer cid);

}
