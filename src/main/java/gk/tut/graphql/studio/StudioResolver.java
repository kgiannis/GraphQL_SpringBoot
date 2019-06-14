package gk.tut.graphql.studio;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import gk.tut.graphql.movie.Movie;

@Component
public class StudioResolver implements GraphQLResolver<Studio> {

	public List<Movie> getMovies(Studio studio){
		Studio studioFromStatic = Studio.studios.get(studio.getId().intValue()-1);
		return studioFromStatic.getMovies();
	}
}
