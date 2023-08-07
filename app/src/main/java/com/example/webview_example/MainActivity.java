package com.example.webview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.webview_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btVer.setOnClickListener(v -> {

            if (!binding.inputUrl.getText().toString().isEmpty()) {
                binding.inputLayout.setError(null);
                Intent intent = new Intent(this, WebActivity.class);
                intent.putExtra("url", binding.inputUrl.getText().toString());
                startActivity(intent);
            } else {
                binding.inputLayout.setError("La URL no puede estar vacia");
            }
        });
    }
}