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
@Table(name="penumpang")
public class PenumpangModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_penumpang;
	private String nama;
	private String no_telp;
	private String alamat;


}
