package org.playground.blackpink.graphql.resolvers;

import graphql.TypeResolutionEnvironment;
import graphql.schema.*;
import org.playground.blackpink.graphql.types.Boy;
import org.playground.blackpink.graphql.types.Girl;

import java.util.HashMap;
import java.util.Map;

public class NodeTypeResolver implements TypeResolver {
    private final Map<Class<?>, GraphQLType> types = new HashMap<>();

    @Override
    public GraphQLObjectType getType(TypeResolutionEnvironment env) {
        Object obj = env.getObject();
        if(obj instanceof Boy) {
            return (GraphQLObjectType) env.getSchema().getType("Boy");
        }
        else if(obj instanceof Girl){
            return (GraphQLObjectType) env.getSchema().getType("Girl");
        }
        throw new RuntimeException("Unknown type " + obj.getClass());
    }
}
