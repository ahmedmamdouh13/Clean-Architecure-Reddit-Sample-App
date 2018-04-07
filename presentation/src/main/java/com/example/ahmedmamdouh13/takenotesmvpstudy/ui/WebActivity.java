package com.example.ahmedmamdouh13.takenotesmvpstudy.ui;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.ahmedmamdouh13.takenotesmvpstudy.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

//        WebView webView= (WebView) findViewById(R.id.webview);
//
//        webView.setEnabled(true);
//       // webView.loadUrl(getIntent().getStringExtra("siteURL"));

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(getIntent().getStringExtra("siteURL")));

    }
}
