package com.example.menuapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_home) {
            tvStatus.setText("Home selected");
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_profile) {
            tvStatus.setText("Profile selected");
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_settings) {
            tvStatus.setText("Settings selected");
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_about) {
            tvStatus.setText("About selected");
            Toast.makeText(this, "About this App", Toast.LENGTH_SHORT).show();
            return true;

        } else if (id == R.id.menu_exit) {
            Toast.makeText(this, "Exiting...", Toast.LENGTH_SHORT).show();
            finish();
            return true;

        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
