package org.eclipse.wildwebdeveloper.yaml.internal;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.jsonrpc.services.JsonNotification;
import org.eclipse.lsp4j.services.LanguageServer;

public interface YAMLLanguageServerAPI extends LanguageServer{

	@JsonNotification("yaml/registerCustomSchemaRequest")
	CompletableFuture<Void> registerCustomSchemaRequest();

}
