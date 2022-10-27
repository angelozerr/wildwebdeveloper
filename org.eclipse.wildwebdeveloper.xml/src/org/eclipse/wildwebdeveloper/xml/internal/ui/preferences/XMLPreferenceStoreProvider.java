package org.eclipse.wildwebdeveloper.xml.internal.ui.preferences;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.proposed.IPreferenceStoreProvider;
import org.eclipse.core.resources.proposed.PreferenceStoreMapping;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.eclipse.wildwebdeveloper.xml.internal.Activator;

public class XMLPreferenceStoreProvider implements IPreferenceStoreProvider {

	public static final PreferenceStoreMapping PREFERENCE_STORE_MAPPING;

	static {
		PREFERENCE_STORE_MAPPING = new PreferenceStoreMapping(Activator.getDefault().getPreferenceStore());
		PREFERENCE_STORE_MAPPING.addMapping(XMLPreferenceClientConstants.EDITOR_SPACES_FOR_TABS,
				AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SPACES_FOR_TABS);
	}

	@Override
	public IPreferenceStore getPreferenceStore(IResource resource) {
		return PREFERENCE_STORE_MAPPING;
	}

}
