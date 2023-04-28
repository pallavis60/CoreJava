package com.xworkz.movie;

import com.xworkz.movie.dao.MovieDao;
import com.xworkz.movie.dto.MovieDto;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDao daoDetails = new MovieDao();
		MovieDto dtoDetails = new MovieDto("Diaaaaaaa", 100000, 2.15f, 30, "Pruthvi", "Kushee");
		MovieDto dtoDetails1 = new MovieDto("KGF", 6000000, 3.30f, 600, null, "ShreenidiShetty");

		// Calling SaveMethod
		boolean movie = daoDetails.saveMovie(dtoDetails);
		System.out.println(movie);
		daoDetails.saveMovie(dtoDetails1);
		daoDetails.saveMovie(null);

		// Calling ReadMethod
		MovieDto[] movies = daoDetails.readAllMovies();
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] != null) {
				System.out.println(movies[i]);
			}

		}

	}
}