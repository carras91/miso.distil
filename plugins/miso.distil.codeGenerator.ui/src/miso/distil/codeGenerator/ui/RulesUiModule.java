/*
 * generated by Xtext
 */
package miso.distil.codeGenerator.ui;

import miso.distil.codeGenerator.ui.navigation.RulesHyperlinkHelper;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class RulesUiModule extends miso.distil.codeGenerator.ui.AbstractRulesUiModule {
	public RulesUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return RulesHyperlinkHelper.class;
	}
}
