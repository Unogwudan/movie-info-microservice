package com.unogwudan.microservices.movieinfoservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unogwudan.microservices.movieinfoservice.models.Movie;

@RestController
@RequestMapping("movies")
public class MovieResource {

	@GetMapping("{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Star wars", "Top rated movie");
	}
}
