package com.dj.hospitaldatamanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class Reviews {
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	private String encounter;
	@OneToMany
	private List<DoctorEntity> doctors;
	
	@ManyToOne
	@Column(nullable = false)
	private Reviews reviews;
	

}
