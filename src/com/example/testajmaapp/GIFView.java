package com.example.testajmaapp;

import java.io.InputStream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;

import com.example.testajmaapp.R;
public class GIFView extends WebView {

	public GIFView(Context context, String path) {
		super(context);
		// TODO Auto-generated constructor stub
		loadUrl(path);
	}

}