package com.annotations.app;

import com.annotations.dao.MovieDao;
import com.annotations.movie.Movie;
import static java.lang.System.*;


public class App {

	public static void main(String[] args) {
		
		MovieDao dao = new MovieDao();
		
		dao.init();
		dao.printMovies();
		
		out.println("----------------");
		
		dao.findById(1).printMovie();
		
		out.println("----------------");
		
		dao.insert(new Movie("Cars", "2005", "Comedy"));
		dao.printMovies();

		out.println("----------------");
		
		dao.delete(3);
		dao.printMovies();
	}

}
