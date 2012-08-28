package greed.code;

import greed.model.Language;

import java.util.HashMap;
import java.util.Map;

/**
 * Greed is good! Cheers!
 */
public class LanguageManager {
	private static LanguageManager instance = null;

	public static LanguageManager getInstance() {
		if (instance == null) instance = new LanguageManager();
		return instance;
	}

	private Map<Language, LanguageTrait> traitMap = new HashMap<Language, LanguageTrait>();
	private Map<Language, LanguageRenderer> rendererMap = new HashMap<Language, LanguageRenderer>();

	private LanguageManager() {
		traitMap.put(Language.CPP, CStyleLanguageTrait.getInstance());
		traitMap.put(Language.JAVA, CStyleLanguageTrait.getInstance());

		rendererMap.put(Language.CPP, CppRenderer.instance);
	}

	public LanguageTrait getTrait(Language language) {
		return traitMap.get(language);
	}

	public LanguageRenderer getRenderer(Language language) {
		return rendererMap.get(language);
	}
}
