package org.playground.blackpink;

import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GenerateSchema {
  @Autowired private GraphQLSchema schema;

  @Test
  void generateSchema() {
    SchemaPrinter printer = new SchemaPrinter();
    String content = printer.print(schema);
    log.error(content);
  }
}
