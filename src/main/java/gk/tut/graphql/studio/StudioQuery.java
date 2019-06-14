package gk.tut.graphql.studio;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class StudioQuery implements GraphQLQueryResolver {

	public List<Studio> findAllStudios(){
		return Studio.studios;
	}
}
