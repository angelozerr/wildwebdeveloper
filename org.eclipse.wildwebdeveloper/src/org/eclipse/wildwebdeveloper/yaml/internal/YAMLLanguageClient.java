package org.eclipse.wildwebdeveloper.yaml.internal;

import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4e.LanguageClientImpl;
import org.eclipse.lsp4j.RegistrationParams;

public class YAMLLanguageClient extends LanguageClientImpl implements YAMLLanguageClientAPI {

	public YAMLLanguageClient() {
		new Thread(() -> {
			synchronized (YAMLLanguageClient.this) {
				try {
					YAMLLanguageClient.this.wait(2000);
					((YAMLLanguageServerAPI)getLanguageServer()).registerCustomSchemaRequest();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}).start();;
	}
	
	@Override
	public CompletableFuture<Void> registerCapability(RegistrationParams params) {

		return super.registerCapability(params);
	}

	@Override
	public CompletableFuture<String> requestCustomSchema(String resource) {
		// TODO Auto-generated method stub
		return CompletableFuture.completedFuture("microprofile://" + resource);
	}

	@Override
	public CompletableFuture<String> requestCustomSchemaContent(String uri) {
		// TODO Auto-generated method stub
		return CompletableFuture.completedFuture("{}");
	}
}
