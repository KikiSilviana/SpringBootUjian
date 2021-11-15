package com.adl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adl.main.model.TravelModel;
import com.adl.main.repository.TravelRepository;

@RestController
public class TravelController {
	
	@Autowired
	TravelRepository travelRepo;
	
	@GetMapping("/travel")
	public List<TravelModel> getTravel(){
		List<TravelModel> lstTravel = travelRepo.findAll();
		return lstTravel;
	}
	
	@PostMapping("/travel/save")
	public TravelModel saveTravel (@RequestBody TravelModel data) {
		return travelRepo.save(data);
	}
	
	@DeleteMapping("/delete")
	public String deleteTravel(@RequestParam("id") int id) {
		travelRepo.deleteById(id);
		return "delete berhasil";
	}
	
	@PatchMapping("/update")
	public TravelModel updateTravelModel(@RequestBody TravelModel travel) {
		
		return travelRepo.save(travel);
	}
	

}
