package com.annotations.model;

import java.util.List;

import com.annotations.movie.Movie;

public interface IMovieDao {
	public Movie findById(int id);
	public List<Movie> findAll();
	public void insert(Movie movie);
	public void edit(Movie oldMovie, Movie movie);
	public void delete(int id);
	public void init();
	public void printMovies();
}
