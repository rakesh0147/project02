package com.ashokit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dto.LoginDto;
import com.ashokit.dto.RegisterDto;
import com.ashokit.dto.ResetPwdDto;
import com.ashokit.dto.UserDto;
import com.ashokit.entity.CityEntity;
import com.ashokit.entity.CountryEntity;
import com.ashokit.entity.StateEntity;
import com.ashokit.entity.UserEntity;
import com.ashokit.repo.CityRepo;
import com.ashokit.repo.CountryRepo;
import com.ashokit.repo.StateRepo;
import com.ashokit.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CountryRepo countryRepo;
	@Autowired
	private StateRepo stateRepo;
	@Autowired
	private CityRepo cityRepo;

	@Override
	public Map<Integer, String> getCountries() {
		List<CountryEntity> list = countryRepo.findAll();
		Map<Integer,String> map=new HashMap<>();
		for(CountryEntity ce:list) {
			map.put(ce.getCountryId(),ce.getCountryName());
		}
		return map;
	}

	@Override
	public Map<Integer, String> getStates(Integer cid) {
		List<StateEntity> list = stateRepo.findAllById(cid);
		Map<Integer,String> map=new HashMap<>();
		for(StateEntity se:list) {
			map.put(se.getStateId(),se.getStateName());
		}
		return map;
	}

	@Override
	public Map<Integer, String> getCities(Integer sid) {
		List<CityEntity> list = cityRepo.findAllById(sid);
		Map<Integer,String> map=new HashMap<>();
		for(CityEntity ce:list) {
			map.put(ce.getCityId(),ce.getCityName());
		}
		return map;
	}

	@Override
	public UserDto getUser(String email) {
		UserEntity userByEmail = userRepo.getUserByEmail(email);
		UserDto userDto=new UserDto();
		userDto.setName(userByEmail.getName());
		userDto.setEmail(userByEmail.getEmail());
		userDto.setPhno(userByEmail.getPhno());
		userDto.setPwd(userByEmail.getPwd());
		userDto.setNewPwd("NO");
		return null;
	}

	@Override
	public boolean registerUser(RegisterDto regDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto getUser(LoginDto loginDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean resetPwd(ResetPwdDto pwdDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getQuote() {
		// TODO Auto-generated method stub
		return null;
	}

}
