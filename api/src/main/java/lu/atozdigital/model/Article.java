package lu.atozdigital.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class Article implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,updatable=false)
	private Long id;
	@Column
	private String name;
	@Column
	private Double price;
	@Column
	private String picture;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Article(Long id, String name, Double price, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.picture = picture;
	}
	public Article(String name, Double price, String picture) {
		this.name = name;
		this.price = price;
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + price + ", picture=" + picture + "]";
	}
	public Article() {
		
	}
	
	
	
}
