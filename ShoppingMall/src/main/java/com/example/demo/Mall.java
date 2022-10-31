package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Mall {
		@Id
		private Integer id;
		private String mallname;
		private String location;
		private String categories;
		private MallAdmin malladmin;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getMallname() {
			return mallname;
		}
		public void setMallname(String mallname) {
			this.mallname = mallname;
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
		public MallAdmin getMalladmin() {
			return malladmin;
		}
		public void setMalladmin(MallAdmin malladmin) {
			this.malladmin = malladmin;
		}
		public Mall(Integer id, String mallname, String location, String categories, MallAdmin malladmin) {
			super();
			this.id = id;
			this.mallname = mallname;
			this.location = location;
			this.categories = categories;
			this.malladmin = malladmin;
		}
		
		@Override
		public String toString() {
			return "Mall [id=" + id + ", mallname=" + mallname + ", location=" + location + ", categories=" + categories
					+ ", malladmin=" + malladmin + "]";
		}
		
		
		
}

