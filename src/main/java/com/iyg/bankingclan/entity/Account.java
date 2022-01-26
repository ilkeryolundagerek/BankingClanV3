package com.iyg.bankingclan.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id//Pk
	@NotNull
	Long id;
	
	@NotNull
	Long balance;
	
	@NotNull
	@Size(min=2, max=30)
	String name;

	public Account(Long id) {
		super();
		this.id = id;
	}
}
