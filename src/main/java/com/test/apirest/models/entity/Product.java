package com.test.apirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@NotEmpty(message = "Must not be blank")
	@Size(min=1000000, max=99999999)
	@Column(name="sku", nullable=false)
	private String sku;
	
	@NotEmpty(message = "Must not be blank")
	@Size(min=3, max=50)
	@Column(name="name", nullable=false)
	private String name;
	
	@NotEmpty(message = "Must not be blank")
	@Size(min=3, max=50)
	@Column(name="brand", nullable=false)
	private String brand;
	
	@NotEmpty(message = "Must not be blank")
	@Column(name="size")
	private String size;
	
	@Size(min=1, max=99999999)
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="other_image_url")
	private String principalImageUrl;
	
	@Column(name="others_image_url")
	private String othersImageUrl;

	public Product() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPrincipalImageUrl() {
		return principalImageUrl;
	}

	public void setPrincipalImageUrl(String principalImageUrl) {
		this.principalImageUrl = principalImageUrl;
	}

	public String getOthersImageUrl() {
		return othersImageUrl;
	}

	public void setOthersImageUrl(String othersImageUrl) {
		this.othersImageUrl = othersImageUrl;
	}

}
