package org.eclipse.wildwebdeveloper.xml.internal.ui.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.preferences.AbstractPreferenceStoreProvider;
import org.eclipse.wildwebdeveloper.xml.internal.Activator;

public class XMLPreferenceStoreProvider extends AbstractPreferenceStoreProvider {

	@Override
	public IPreferenceStore[] providePreferenceStores() {
		return new IPreferenceStore[] { Activator.getDefault().getPreferenceStore() };
	}

}
