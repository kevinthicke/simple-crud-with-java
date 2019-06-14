package com.annotations.dao;

import java.util.ArrayList;
import java.util.List;

import com.annotations.model.IMovieDao;
import com.annotations.movie.Movie;

public class MovieDao implements IMovieDao {

	private List<Movie> movies = new ArrayList<Movie>();
	
	public Movie findById(int id) {
		Movie _movie = null;
		
		for (Movie movie : this.movies) {
			if (movie.getId() == id) {
				_movie = movie;
			} 
		}
		
		return _movie;
	}
	
	public List<Movie> findAll() {
		return this.movies;
	}

	public void insert(Movie movie) {
		this.movies.add(movie);
	}

	public void edit(Movie oldMovie, Movie movie) {
		this.movies.remove(oldMovie);
		this.movies.add(movie);
	}

	public void delete(int id) {
		this.movies.remove(this.findById(id));
		
	}

	public void init() {
		this.insert(new Movie("Titanic", "1998", "Drama"));
		this.insert(new Movie("Gladiator", "2000", "Bélico"));
		this.insert(new Movie("El grand Dictador", "1940", "Comedia"));
	}

	public void printMovies() {
		for (Movie movie : this.movies) {
			System.out.println(" - Title: " + movie.getTitle());
			System.out.println(" - Year: " + movie.getYear());
			System.out.println(" - Genre: " + movie.getGenre());
			System.out.println("\n");
		}
		
	}

}
