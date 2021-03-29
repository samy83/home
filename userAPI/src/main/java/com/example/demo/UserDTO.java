package com.example.demo;


public class UserDTO {
	
	 private Long id;
		
		//obligatoire
		private String prenom;
		
		//obligatoire
		private int age;
		
		//falcutatif
		private String pays;

		public UserDTO() {
			this.id=(long)0;
		}
		
		public UserDTO(String prenom, int age, String pays) {
			this.prenom=prenom;
			this.age=age;
			this.pays=pays;
		}
		
		public UserDTO(Long id, String prenom, int age, String pays) {
			this.prenom=prenom;
			this.age=age;
			this.pays=pays;
			this.id=id;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPays() {
			return pays;
		}

		public void setPays(String pays) {
			this.pays = pays;
		}
		
		public String toString() {
			return "id: " + id + " prenom: " + prenom + " age: " + age + " pays : " +  pays;
		}
}
