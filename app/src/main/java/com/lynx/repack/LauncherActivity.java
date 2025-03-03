package com.lynx.repack;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        File file = new File(getFilesDir(), "user_logged_in.txt");
        if (file.exists()) {
            // If the file exists, go to MainActivity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            // Otherwise, go to AuthActivity
            Intent intent = new Intent(this, AuthActivity.class);
            startActivity(intent);
        }

        finish(); // Close LauncherActivity
    }
}