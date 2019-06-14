package gk.tut.graphql.movie;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import gk.tut.graphql.studio.Studio;

@Component
public class MovieQuery implements GraphQLQueryResolver {

	public List<Movie> findAllMovies(){
		return Movie.movies;
	}
	
	public List<Movie> getMoviesOfStudio(Studio studio){
		return Movie.movies.stream()
				.filter(s -> s.getStudio().equals(studio))
				.collect(Collectors.toList());
	}
}
