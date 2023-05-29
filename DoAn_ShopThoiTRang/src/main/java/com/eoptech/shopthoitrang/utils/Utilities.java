package com.eoptech.shopthoitrang.utils;

import com.github.slugify.Slugify;

public class Utilities {
	// SEO friendly URL 
	public static String seo(String text) {
		return new Slugify().slugify(text);
	}
}
