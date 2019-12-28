package org.playground.blackpink.configuration;

import graphql.annotations.AnnotationsSchemaCreator;
import graphql.schema.GraphQLSchema;
import org.playground.blackpink.graphql.catagory.Query;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {

  @Bean
  public GraphQLSchema graphQLSchema() {
    return AnnotationsSchemaCreator.newAnnotationsSchema().query(Query.class).build();
  }
}
