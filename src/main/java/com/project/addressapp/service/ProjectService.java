package com.project.addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.addressapp.entity.Project;
import com.project.addressapp.projectresponse.ProjectResponse;
import com.project.addressapp.repo.ProjectRepo;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepo projectRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ProjectResponse findProjectDetailsByEmployeeId(int id) {
		Project project = projectRepo.findProjectDetailsByEmployeeId(id);
		ProjectResponse projectResponse = modelMapper.map(project, ProjectResponse.class);
		
		
		return projectResponse;
	}

}
