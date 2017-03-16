package com.example.cisc.muenchaua3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class mesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa);

        WebView mesaWebView = (WebView) findViewById(R.id.webViewMesa);
        mesaWebView.loadUrl("http://www.sdmesa.edu");
    }
}