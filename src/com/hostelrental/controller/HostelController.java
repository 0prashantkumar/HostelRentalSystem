package com.hostelrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hostelrental.dao.HostelDao;
import com.hostelrental.pojos.Hostels;

@RestController
@CrossOrigin
@RequestMapping("/hostel")
public class HostelController {

	@Autowired
	private HostelDao dao;
	
	@GetMapping
	public ResponseEntity<?> getAllHostelList(){
		try {
			return new ResponseEntity<Hostels>(dao.getAllHostel(1),HttpStatus.OK);
		}catch(RuntimeException exp){
			return new ResponseEntity<String>("No hostel Found" + exp.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
