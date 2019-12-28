package org.playground.blackpink.graphql.types;

import graphql.annotations.annotationTypes.GraphQLField;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Girl implements Node {
    private int id;

    @GraphQLField
    private String name;

    @Override
    public int id() {
        return 0;
    }
}
