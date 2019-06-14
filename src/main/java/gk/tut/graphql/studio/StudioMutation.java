package gk.tut.graphql.studio;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class StudioMutation implements GraphQLMutationResolver {

	public Studio addStudio(Long id, String name) {
		Studio studio = new Studio(id, name);
		Studio.studios.add(studio);
		return studio;
	}
}
