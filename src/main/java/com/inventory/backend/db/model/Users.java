package com.inventory.backend.db.model;

import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.jdbc.Blob;

@Entity
@Table(name = "inventory_users")
public class Users {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String description;
	private String price;
	private byte[] image;

	public Users() {
		super();
	}
	
	public Users(String name, String description, String price, byte[] image) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		
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

	public String getPrice() {
		return price;
	}
 
	public void setPrice(String price) {
		this.price = price;
	}
	
	public byte[] getImage() {
		return image;
	}
	void setImage(byte[] image) {
		this.image = image;
	}
}
