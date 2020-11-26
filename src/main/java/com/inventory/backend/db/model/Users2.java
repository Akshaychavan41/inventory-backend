package com.inventory.backend.db.model;

import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.jdbc.Blob;

public class Users2 {

	private Integer id;
	private String name;
	private String description;
	private Integer price;
	private MultipartFile image;

	public Users2() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}
 
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public MultipartFile getImage() {
		return image;
	}
	void setImage(MultipartFile image) {
		this.image = image;
	}
}
