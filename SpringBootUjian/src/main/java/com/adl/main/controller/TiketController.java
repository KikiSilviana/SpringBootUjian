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

import com.adl.main.model.TiketModel;
import com.adl.main.repository.TiketRepository;

@RestController
public class TiketController {
	
	@Autowired
	TiketRepository tiketRepo;
	
	@GetMapping("/tiket")
	public List<TiketModel> geTiket(){
		List<TiketModel> lstTiket = tiketRepo.findAll();
		return lstTiket;
	}
	
	@PostMapping("/tiket/save")
	public TiketModel saveTiket (@RequestBody TiketModel data) {
		return tiketRepo.save(data);
	}
	
	@DeleteMapping("/delete")
	public String deleteTiket(@RequestParam("id") int id) {
		tiketRepo.deleteById(id);
		return "delete berhasil";
	}
	
	@PatchMapping("/update")
	public TiketModel updateTiketModel(@RequestBody TiketModel tiket) {		
		return tiketRepo.save(tiket);
	}
	

}
