package com.boss.kevin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webView);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("http://185.247.118.85:3000/livechat");

    }

        public void imageButtonOnClick(View v) {
            Intent browserIntent = new Intent(MainActivity.this, for_us.class);
            startActivity(browserIntent);
    }

        public void imageButtonOnClick2(View v) {
            Intent browserIntent = new Intent(MainActivity.this, Portfolio.class);
            startActivity(browserIntent);
    }

        public void imageButtonOnClick3(View v) {
            Intent browserIntent = new Intent(MainActivity.this, Mentors.class);
            startActivity(browserIntent);

    }
        public void ButtonOnClick(View v) {
            Intent browserIntent = new Intent(MainActivity.this, for_us.class);
            startActivity(browserIntent);
    }

}
