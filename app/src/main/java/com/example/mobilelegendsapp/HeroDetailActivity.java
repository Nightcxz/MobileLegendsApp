package com.example.mobilelegendsapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.mobilelegendsapp.Hero;

import androidx.appcompat.app.AppCompatActivity;

public class HeroDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        ImageView heroImage = findViewById(R.id.heroImage);
        TextView heroName = findViewById(R.id.heroName);
        TextView heroDescription = findViewById(R.id.heroDescription);

        Hero hero = (Hero) getIntent().getSerializableExtra("hero");

        if (hero != null) {
            heroImage.setImageResource(hero.getImageResId());
            heroName.setText(hero.getName());
            heroDescription.setText(hero.getDescription());
        }
    }
}


