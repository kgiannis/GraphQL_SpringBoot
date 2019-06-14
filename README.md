# GraphQL with SpringBoot
In this project you can see how to use GraphQL with Spring Boot and create a GraphQL server. This is a use case of an One-To-Many relation mapping. We will not use any database for this project, information is saved and retrieved from static lists. The scenario is a movies / studios relation where each studio has a list of movies.

# Types and Resolvers
We are using two types here:
- Movie
- Studio

You can see each type along its queries and mutations on its corresponding file:
- movie.graphqls
- studio.graphqls

There is also another file: **common.graphqls**
Inside there we have only the Query and Mutation declarations. movie and studio query and mutation type both extends from this common file.

For each type we are using its own resolver in order to correctly map the two types together.


# Static data initialization
As we are not using any DB for storing and retrieving data, any CRUD will be holding on static lists. We are initializing the lists inside _GraphqlApplication_ class

```java
@Bean
public List<Studio> getStudios(){
  ...
}

@Bean
public List<Movie> getMovies(){
  ...
}
```

# Build
Run the project using the following commands:
```sh
mvn clean package
java -jar graphql-1.0.0.jar
```

# Schema
GraphQL uses a single endpoint only. You see the schema on your browser:
```sh
http://localhost:8080/graphql/schema.json
```

# Using GraphiQL
You can use your web browser to test the project and play with graphql. **GraphiQL** is the tool for this job.
On your browser:
```sh
http://localhost:8080/graphiql
```

e.g.:
```graphql
query {
  findAllMovies {
    title
  }
  getMoviesOfStudio(studio: {id:2, name:"Warner Studios"}) {
    id
  }
	findAllStudios {
	  name
    movies {
      title
    }
	}
  
}
```

produces:
```json
{
  "data": {
    "findAllMovies": [
      {
        "title": "Minios"
      },
      {
        "title": "Aquaman"
      },
      {
        "title": "Fantasia"
      }
    ],
    "getMoviesOfStudio": [],
    "findAllStudios": [
      {
        "name": "Universal Studios",
        "movies": [
          {
            "title": "Minios"
          }
        ]
      },
      {
        "name": "Warner Studios",
        "movies": [
          {
            "title": "Aquaman"
          }
        ]
      },
      {
        "name": "Disney Studios",
        "movies": [
          {
            "title": "Fantasia"
          }
        ]
      }
    ]
  }
}
```




