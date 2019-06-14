package gk.tut.graphql.studio;

import java.util.ArrayList;
import java.util.List;

import gk.tut.graphql.movie.Movie;

public class Studio {

	/** Set studios as static data */
	public static List<Studio> studios = new ArrayList<Studio>();
	
	private Long id;
	private String name;
	private List<Movie> movies;
	
	public Studio() {}

	public Studio(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Studio(Long id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
}
