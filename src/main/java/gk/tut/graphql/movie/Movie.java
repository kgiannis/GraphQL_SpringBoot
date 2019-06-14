package gk.tut.graphql.movie;

import java.util.ArrayList;
import java.util.List;

import gk.tut.graphql.studio.Studio;

public class Movie {

	/** Set movies as static data */
	public static List<Movie> movies = new ArrayList<Movie>();
	
	private Long id;
	private String title;
	private Studio studio;
	
	public Movie() {}

	public Movie(Long id, String title, Studio studio) {
		this.id = id;
		this.title = title;
		this.studio = studio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Movie movie = (Movie) o;
        return id.equals(movie.id);
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", studio=" + studio + "]";
	}

	
}
