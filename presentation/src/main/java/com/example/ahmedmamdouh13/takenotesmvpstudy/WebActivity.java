package com.example.ahmedmamdouh13.takenotesmvpstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView= (WebView) findViewById(R.id.webview);

        webView.loadUrl(getIntent().getStringExtra("siteURL"));

    }
}
