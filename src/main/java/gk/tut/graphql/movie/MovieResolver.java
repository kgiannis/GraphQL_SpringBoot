package gk.tut.graphql.movie;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import gk.tut.graphql.studio.Studio;

@Component
public class MovieResolver implements GraphQLResolver<Movie> {

	public Studio getStudio(Movie movie) {
		return movie.getStudio();
	}
}
