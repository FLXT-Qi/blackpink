package org.playground.blackpink.graphql;

import graphql.annotations.annotationTypes.GraphQLField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class Boy {
  private int id;

  public Boy(int id) {
    this.id = id;
  }

  @GraphQLField private String name;
  @GraphQLField private Integer age;

  @GraphQLField
  public Long money() {
    log.error("this is the new shit.");
    return id * 1000L;
  }
}
