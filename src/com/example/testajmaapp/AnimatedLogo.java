package com.example.testajmaapp;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;



public class AnimatedLogo extends WebView{

	public AnimatedLogo(Context context, String path) {
		super(context);
		// TODO Auto-generated constructor stub
		loadUrl(path);
	}
	

	

}
