package com.polymorphism;

public class OverLoadingRun {

	public static void main(String[] args) {

		OverLoading ol = new OverLoading();

		System.out.println(ol.add());
		System.out.println(ol.add(20, 40));
		System.out.println(ol.add(10, 20, 30.10));
		System.out.println(ol.add(10, 30.60, 20));
		System.out.println(ol.add(32.10, 10, 20));

	}

}
