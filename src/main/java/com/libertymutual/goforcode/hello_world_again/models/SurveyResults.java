package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {

	private int russetCount;
	private int goldenCount;
	private int sweetCount;

	public void registerRussetVote() { // void methods cannot return a value
		russetCount = russetCount + 1;
	}

	public void registerGoldenVote() {
		goldenCount = goldenCount + 1;
	}

	public void registerSweetVote() {
		sweetCount = sweetCount + 1;
	}

	public int sweetTotal() {
		return sweetCount;
	}

	public int goldenTotal() {
		return goldenCount;
	}

	public int russetTotal() {
		return russetCount;
	}

}
