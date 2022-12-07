package algonquin.cst2335.finalproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import View.SearchMovie;
import algonquin.cst2335.finalproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.Movies.setOnClickListener(click -> {
            Intent moviePage = new Intent(this, SearchMovie.class);
            startActivity(moviePage);
        });

        binding.Pexels.setOnClickListener(click -> {
            Intent pexelsPage = new Intent(this, PexelsActivity.class);
            startActivity(pexelsPage);
        });
    }
}