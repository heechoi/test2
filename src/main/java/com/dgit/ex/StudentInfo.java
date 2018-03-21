package com.dgit.ex;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentInfo {
	private String name;
	private int stdClass;
	private int math;
	private int eng;
	private int kor;
	//context 파일에 있는것이 자동주입된다.
	//<context:annotation-config/> applicationCtx.xml에 추가해준다 (namespace에 추가한후)
	@Autowired
	private Report report;
	
	@Autowired
	private Family family;
	
	public StudentInfo() {}
	
	
	public StudentInfo(Report report, Family family) {
		super();
		this.report = report;
		this.family = family;
	}


	public StudentInfo(Report report) {
		super();
		this.report = report;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdClass() {
		return stdClass;
	}
	public void setStdClass(int stdClass) {
		this.stdClass = stdClass;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	
	public void getInfo(){
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+stdClass);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("국어 : "+kor);
		report.reportGrade(math, eng, kor);
		if(family !=null){
			family.printFamilyInfo();
		}
		
	}
}
