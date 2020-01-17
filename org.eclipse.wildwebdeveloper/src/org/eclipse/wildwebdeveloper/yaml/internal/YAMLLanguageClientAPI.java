package org.eclipse.wildwebdeveloper.yaml.internal;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;

public interface YAMLLanguageClientAPI {

	@JsonRequest("custom/schema/request")
	CompletableFuture<String> requestCustomSchema(String resource);

	@JsonRequest("custom/schema/content")
	CompletableFuture<String> requestCustomSchemaContent(String uri);
}
