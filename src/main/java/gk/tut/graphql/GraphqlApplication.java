package gk.tut.graphql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import gk.tut.graphql.movie.Movie;
import gk.tut.graphql.studio.Studio;

@SpringBootApplication
public class GraphqlApplication {
	
	/**
	 * Initialize Studios as static data
	 * @return
	 */
	@Bean
	public List<Studio> getStudios() {
		Studio universal = new Studio(1L, "Universal Studios");
		Studio warner = new Studio(2L, "Warner Studios");
		Studio disney = new Studio(3L, "Disney Studios");
		Collections.addAll(Studio.studios, universal, warner, disney);
		return Studio.studios;
	}
	
	/**
	 * Initialize Movies as static data and set movies on studios
	 * @return
	 */
	@Bean
	public List<Movie> getMovies() {
		Movie minions = new Movie(1L, "Minios", Studio.studios.get(0));
		Movie aquaman = new Movie(2L, "Aquaman", Studio.studios.get(1));
		Movie fantasia = new Movie(3L, "Fantasia", Studio.studios.get(2));
		Collections.addAll(Movie.movies, minions, aquaman, fantasia);
		
		/** Set movies on studios */
		Studio.studios.get(0).setMovies(Arrays.asList(minions));
		Studio.studios.get(1).setMovies(Arrays.asList(aquaman));
		Studio.studios.get(2).setMovies(Arrays.asList(fantasia));
		
		return Movie.movies;
	}

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
