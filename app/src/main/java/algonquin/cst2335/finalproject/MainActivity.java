package algonquin.cst2335.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import View.SearchMovie;
import algonquin.cst2335.finalproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.Movies:
                Log.d("test", "clicked");
                Intent moviePage = new Intent(this, SearchMovie.class);
                startActivity(moviePage);
                break;


            case R.id.Pexels:
                Log.d("test", "clicked");
                Intent pexelsPage = new Intent(this, PexelsActivity.class);
                startActivity(pexelsPage);
                break;

            case R.id.help:

                break;

        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.Movies.setOnClickListener(click -> {

        });

        binding.Pexels.setOnClickListener(click -> {
            Intent pexelsPage = new Intent(this, PexelsActivity.class);
            startActivity(pexelsPage);
        });
    }
}