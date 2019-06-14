package com.annotations.movie;

public class Movie {

	private static int _id = 0;
	private int id;
	private String title;
	private String year;
	private String genre;

	public Movie() {
		this.id = _id;
		// System.out.println(this.id);
		_id++;
	}

	public Movie(String title, String year, String genre) {
		this();
		this.title = title;
		this.year = year;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + "]";
	}

	public void printMovie() {
		System.out.println(" - Title: " + this.getTitle());
		System.out.println(" - Year: " + this.getYear());
		System.out.println(" - Genre: " + this.getGenre());
	}
}
