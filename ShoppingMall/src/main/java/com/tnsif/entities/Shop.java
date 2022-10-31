package com.tnsif.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopId;
	private String shopCategory;
	private String shopName;
	private String shopStatus;
	private String leaseStatus;
	public Integer getShopId() {
		return shopId;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	private ShopOwner shopOwner;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "shopId")
	private List<Employee> shopEmployees;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "shopId")
	private List<Item> items;
	
	public Shop(Integer shopId, String shopCategory, String shopName, String shopStatus, String leaseStatus,
			ShopOwner shopOwner, List<Employee> shopEmployees, List<Item> items) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
		this.shopOwner = shopOwner;
		this.shopEmployees = shopEmployees;
		this.items = items;
	}
	
	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	public List<Employee> getShopEmployees() {
		return shopEmployees;
	}

	public void setShopEmployees(List<Employee> shopEmployees) {
		this.shopEmployees = shopEmployees;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", shopStatus="
				+ shopStatus + ", leaseStatus=" + leaseStatus + "]";
	}
	
}
