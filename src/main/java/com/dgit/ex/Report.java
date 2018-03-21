package com.dgit.ex;

public class Report {
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;

	public int getGrade1() {
		return grade1;
	}



	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}



	public int getGrade2() {
		return grade2;
	}



	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}



	public int getGrade3() {
		return grade3;
	}



	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}



	public int getGrade4() {
		return grade4;
	}



	public void setGrade4(int grade4) {
		this.grade4 = grade4;
	}

	public void reportGrade(int math,int eng,int kor){
		int avg = (int)(math+eng+kor)/3;
		double avg2 = (math+eng+kor)/3;
		System.out.println("평균 : "+avg2);
		if(avg>grade1){
			System.out.println("내신등급 : 1등급");
		}else if(avg>grade2){
			System.out.println("내신등급 : 2등급");
		}else if(avg>grade3){
			System.out.println("내신등급 : 3등급");
		}else if(avg>grade4){
			System.out.println("내신등급 : 4등급");
		}
	}
}
