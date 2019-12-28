package org.playground.blackpink.graphql;

import graphql.annotations.annotationTypes.GraphQLField;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Girl {
  @GraphQLField private String name;
}
