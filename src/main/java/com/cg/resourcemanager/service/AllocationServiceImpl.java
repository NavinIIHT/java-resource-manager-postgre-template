package com.cg.resourcemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.resourcemanager.dto.AllocationDto;
import com.cg.resourcemanager.repo.AllocationRepository;


public class AllocationServiceImpl implements AllocationService {

	@Autowired
	private AllocationRepository allocationRepo;

	@Override
	public AllocationDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AllocationDto addAllocation(AllocationDto allocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AllocationDto deleteAllocation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AllocationDto> findAllAllocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
