package com.lynx.repack;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;

public class AuthActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

// Set a custom User-Agent string
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.contains("login_success") || url.equals("about:blank")) {
                    saveLoginFile(); // Save the login file
                    Intent intent = new Intent(AuthActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Close AuthActivity
                    return true;
                }
                return false; // Continue loading the URL
            }
        });

        // Load the login page
        webView.loadUrl("Lmao asif wewill leak this lmao");
    }

    private void saveLoginFile() {
        try {
            File file = new File(getFilesDir(), "user_logged_in.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("logged_in".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
