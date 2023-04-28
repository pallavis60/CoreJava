package com.xworkz.movie.dto;

public class MovieDto {

	private String movieName;
	private int budget;
	private float hours;
	private int actors;
	private String heroName;
	private String heroineName;

	public MovieDto() {
		System.out.println("Default Constructo");
	}

	public MovieDto(String movieName, int budget, float hours, int actors, String heroName, String heroineName) {
		super();
		this.movieName = movieName;
		this.budget = budget;
		this.hours = hours;
		this.actors = actors;
		this.heroName = heroName;
		this.heroineName = heroineName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public int getActors() {
		return actors;
	}

	public void setActors(int actors) {
		this.actors = actors;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroineName() {
		return heroineName;
	}

	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}

	@Override
	public String toString() {
		return "MovieDto [movieName=" + movieName + ", budget=" + budget + ", hours=" + hours + ", actors=" + actors
				+ ", heroName=" + heroName + ", heroineName=" + heroineName + "]";
	}

}
