package com.dj.hospitaldatamanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "patient_info")
public class PersonEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private Integer age;
	@Column
	private String address;
	@ManyToMany
	@JoinColumn
	private List<DoctorEntity> doctors;

	@OneToOne(mappedBy = "persons")
	private List<History> histories;

}
