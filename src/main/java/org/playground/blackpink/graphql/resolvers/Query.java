package org.playground.blackpink.graphql.resolvers;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.playground.blackpink.graphql.types.Boy;
import org.playground.blackpink.graphql.types.Girl;
import org.playground.blackpink.graphql.types.Node;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Slf4j
@Component
public class Query {
  @GraphQLField
  @GraphQLInvokeDetached
  public Boy boy(Integer id, DataFetchingEnvironment env) {
    return new Boy(id);
  }

  @GraphQLField
  @GraphQLInvokeDetached
  public Girl girl(String name) {
    Girl g = new Girl();
    g.setName(name);
    return g;
  }
  @GraphQLField
  @GraphQLInvokeDetached
  public Node node(Integer id){
    return new Boy(id);
  };
}
