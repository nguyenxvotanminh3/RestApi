package com.nguyenminh.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	@Entity
	@Table(name = "detail123")
	public class Moisture{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id ;
		
		@Column(name = "moisture")
		private int moisture;
		
		@Column(name = "username")
		private String username;
		
		public Moisture() {
			
		}
		public Moisture(int moisture, String username) {
			
			this.moisture = moisture;
			this.username = username;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getMoisture() {
			return moisture;
		}

		public void setMoisture(int moisture) {
			this.moisture = moisture;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", moisture=" + moisture + ", username=" + username + "]";
		}
		
	}

