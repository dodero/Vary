/*
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import vary.pseudocodigo.dsl.c.ui.internal.VaryGrammarActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VaryGrammarExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return VaryGrammarActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return VaryGrammarActivator.getInstance().getInjector(VaryGrammarActivator.VARY_PSEUDOCODIGO_DSL_C_VARYGRAMMAR);
	}
	
}
