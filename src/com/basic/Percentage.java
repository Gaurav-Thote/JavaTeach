package com.basic;

public class Percentage {

	int maths;
	int science;
	int english;
	
	Percentage(int mathss, int sciences, int englishs) {

		this.maths = mathss;
		this.science = sciences;
		this.english = englishs;

		int tMarks = maths + science + english;
		double percentage = tMarks / 3;

		System.out.println("Total Marks:- " + tMarks);
		System.out.println("Percentage:- " + percentage);
	}
}