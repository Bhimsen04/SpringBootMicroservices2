package io.bhim.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bhim.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieIds}")
	public Movie getMovieInfo(@PathVariable("movieIds") String movieId) {
		return new Movie(movieId, "Test name");
	}
}
