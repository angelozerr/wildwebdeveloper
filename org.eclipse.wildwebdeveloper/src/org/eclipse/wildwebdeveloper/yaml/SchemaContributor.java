package org.eclipse.wildwebdeveloper.yaml;

import java.util.concurrent.CompletableFuture;

public interface SchemaContributor {

	CompletableFuture<String> requestCustomSchema(String resource);

	CompletableFuture<String> requestCustomSchemaContent(String uri);
}
