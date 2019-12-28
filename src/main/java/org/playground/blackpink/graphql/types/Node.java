package org.playground.blackpink.graphql.types;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLTypeResolver;
import org.playground.blackpink.graphql.resolvers.NodeTypeResolver;

@GraphQLTypeResolver(NodeTypeResolver.class)
public interface Node {
    @GraphQLField
    int id();
}
