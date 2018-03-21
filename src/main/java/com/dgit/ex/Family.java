package com.dgit.ex;

public class Family {
	private String father;
	private String mother;
	private String sister;
	
	public Family(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}

	public String getSister() {
		return sister;
	}

	public void setSister(String sister) {
		this.sister = sister;
	}
	
	public void printFamilyInfo(){
		System.out.println("아빠 : "+father);
		System.out.println("엄마 : "+mother);
		System.out.println("여동생 : "+sister);
	}
	
}
