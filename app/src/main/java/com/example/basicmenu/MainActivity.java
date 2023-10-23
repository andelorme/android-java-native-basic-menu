package com.example.basicmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "inflated", Toast.LENGTH_SHORT);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mni_settings)
            Toast.makeText(this, getText(R.string.mni_settings) + " " + getText(R.string.txt_pressed), Toast.LENGTH_SHORT).show();
        if (item.getItemId() == R.id.mni_about)
            Toast.makeText(this, getText(R.string.mni_about) + " " + getText(R.string.txt_pressed), Toast.LENGTH_SHORT).show();
        if (item.getItemId() == R.id.mni_logout)
            Toast.makeText(this, getText(R.string.mni_logout) + " " + getText(R.string.txt_pressed), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}