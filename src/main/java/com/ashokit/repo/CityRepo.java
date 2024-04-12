package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.CityEntity;

public interface CityRepo extends JpaRepository<CityEntity,Integer>{
	
	@Query(name = "SELECT * FROM CITY_MASTER WHERE STATE_ID=:sid",nativeQuery = true)
	public List<CityEntity> findAllById(Integer sid);
	

}
