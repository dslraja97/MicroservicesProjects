package com.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {

	@Id
	private Integer id;
	private String bookName;
	private String authorName;
	private Integer price;
}
