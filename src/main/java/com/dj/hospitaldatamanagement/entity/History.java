package com.dj.hospitaldatamanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class History {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;

	@Column(name = "patient_name")
	private String name;

	@OneToOne
	@JoinColumn
	@Column(nullable = false)
	private PersonEntity entity;

	@OneToMany
	private List<Reviews> reviews;

}
