package com.xworkz.movie.dao;

import com.xworkz.movie.dto.MovieDto;

public class MovieDao {

	MovieDto[] details = new MovieDto[10];

	// SaveMOvie Method

	public boolean saveMovie(MovieDto dto) {
		if (dto != null) {
			System.out.println("The dto name is valid");
			if (dto.getMovieName() != null && dto.getHeroName() != null) {
				System.out.println("The given MovieName and Her0Name is not null");

				if (dto.getMovieName().length() > 3 && dto.getHeroName().length() > 5) {
					System.out.println("The Given Movie Name is valid in Length");

					for (int i = 0; i <= details.length - 1; i++) {
						if (details[i] == null) {
							details[i] = dto;
							System.out.println("The Movie Name " + dto + "  is added");
							return true;
						}

						System.out.println("There is no space in the array index");
					}

					System.out.println("The movie Name " + dto + " is not added");
					return false;
				}

				System.out.println("The given movieName or Hero name is not valid");
				return false;
			}

			System.out.println("The given movieName or HeroName is null");
			return false;

		}
		System.out.println("The dto is null");
		return false;

	}

	// Read Method

	public MovieDto[] readAllMovies() {
		return details;
	}
}
