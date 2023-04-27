package com.project.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.addressapp.projectresponse.ProjectResponse;
import com.project.addressapp.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/project/{employeeId}")
	public ResponseEntity<ProjectResponse> getProjectDetailsByEmployeeId(@PathVariable("employeeId") int id){
		
		ProjectResponse projectResponse = projectService.findProjectDetailsByEmployeeId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(projectResponse);
	}
	
	
	
	
}
