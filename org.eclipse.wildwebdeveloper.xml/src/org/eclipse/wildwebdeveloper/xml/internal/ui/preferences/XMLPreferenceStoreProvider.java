package org.eclipse.wildwebdeveloper.xml.internal.ui.preferences;

import org.eclipse.core.proposed.resources.IPreferenceStoreProvider;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.wildwebdeveloper.xml.internal.Activator;

public class XMLPreferenceStoreProvider implements IPreferenceStoreProvider {

	@Override
	public IPreferenceStore getPreferenceStore(IResource resource) {
		return Activator.getDefault().getPreferenceStore();
	}

}
