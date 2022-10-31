package com.tnsif.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mall {
		@Id
		private Integer id;
		private String mallName;
		private String location;
		private String categories;
		private MallAdmin mallAdmin;
		private Shop shopId;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(referencedColumnName = "id")
		private MallAdmin mall;
		
	
		public Shop getShopId() {
			return shopId;
		}
		public void setShopId(Shop shopId) {
			this.shopId = shopId;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMallName() {
			return mallName;
		}
		public void setMallName(String mallName) {
			this.mallName = mallName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getCategories() {
			return categories;
		}
		public void setCategories(String categories) {
			this.categories = categories;
		}
		public MallAdmin getMallAdmin() {
			return mallAdmin;
		}
		public void setMallAdmin(MallAdmin mallAdmin) {
			this.mallAdmin = mallAdmin;
		}
		public Mall(Integer id, String mallName, String location, String categories, MallAdmin mallAdmin, Shop shopId) {
			super();
			this.id = id;
			this.mallName = mallName;
			this.location = location;
			this.categories = categories;
			this.mallAdmin = mallAdmin;
			this.shopId = shopId;
		}
		@Override
		public String toString() {
			return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", categories=" + categories
					+ ", mallAdmin=" + mallAdmin + ", shopId=" + shopId + "]";
		}
		
		
		
		
		
}

