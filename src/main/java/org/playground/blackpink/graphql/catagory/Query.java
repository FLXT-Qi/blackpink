package org.playground.blackpink.graphql.catagory;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.playground.blackpink.graphql.Boy;
import org.playground.blackpink.graphql.Girl;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
@Slf4j
@Component
public class Query {
  @GraphQLField
  @GraphQLInvokeDetached
  public Boy boy(Integer id, DataFetchingEnvironment env) {
    Boy b = new Boy(id);
    b.setName("jisoo");
    return b;
  }

  @GraphQLField
  @GraphQLInvokeDetached
  public Girl girl(String name) {
    return null;
  }
}
