package gk.tut.graphql.movie;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import gk.tut.graphql.studio.Studio;

@Component
public class MovieMutation implements GraphQLMutationResolver {

	public Movie addMovie(Long id, String title, Studio studio) {
		Movie movie = new Movie(id, title, studio);
		Movie.movies.add(movie);
		return movie;
	}
}
