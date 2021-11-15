package com.adl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="tiket")
public class TiketModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String jadwal;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="idtravel",
	referencedColumnName = "id_travel")
	private TravelModel idtravel;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="idpenumpang",
	referencedColumnName = "id_penumpang")
	private PenumpangModel idpenumpang;
}
	
	
