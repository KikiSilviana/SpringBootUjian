package com.adl.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="travel")
public class TravelModel {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id_travel;
		private String nama_supir;
		private String no_telp;
		private String alamat;
		private String no_polisi;
		
}

