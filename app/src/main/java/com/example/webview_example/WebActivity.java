package com.example.webview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.example.webview_example.databinding.ActivityMainBinding;
import com.example.webview_example.databinding.ActivityWebBinding;

public class WebActivity extends AppCompatActivity {

    private ActivityWebBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWebBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String url = getIntent().getStringExtra("url");
        binding.webView.getSettings().setJavaScriptEnabled(true);

        // To avoid WebView to launch the default browser when open initial page
        binding.webView.setWebViewClient(new WebViewClient());
        binding.webView.loadUrl(url);

        binding.btVolver.setOnClickListener(v -> onBackPressed());
    }
}