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

import com.adl.main.model.PenumpangModel;
import com.adl.main.repository.PenumpangRepository;

@RestController
public class PenumpangController {
	
	@Autowired
	PenumpangRepository penumpangRepo;
	
	@GetMapping("/penumpang")
	public List<PenumpangModel> gePenumpang(){
		List<PenumpangModel> lstPenumpang = penumpangRepo.findAll();
		return lstPenumpang;
	}
	
	@PostMapping("/penumpang/save")
	public PenumpangModel savePenumpang (@RequestBody PenumpangModel data) {
		return penumpangRepo.save(data);
	}
	
	@DeleteMapping("/delete")
	public String deletePenumpang(@RequestParam("id_penumpang") int id_penumpang) {
		penumpangRepo.deleteById(id_penumpang);
		return "delete berhasil";
	}
	
	@PatchMapping("/update")
	public PenumpangModel updatePenumpangModel(@RequestBody PenumpangModel penumpang) {		
		return penumpangRepo.save(penumpang);
	}
	

}
