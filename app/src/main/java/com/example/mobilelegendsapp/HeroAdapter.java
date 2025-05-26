package com.example.mobilelegendsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {

    private List<Hero> heroList;

    public HeroAdapter(List<Hero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        Hero hero = heroList.get(position);
        holder.name.setText(hero.getName());
        holder.role.setText(hero.getRole());
        holder.image.setImageResource(hero.getImageResId());

        // 👇 Set click listener here
        holder.itemView.setOnClickListener(v -> {
            Context context = v.getContext();
            Intent intent = new Intent(context, HeroDetailActivity.class);
            intent.putExtra("hero", hero);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public static class HeroViewHolder extends RecyclerView.ViewHolder {
        TextView name, role;
        ImageView image;

        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.heroName);
            role = itemView.findViewById(R.id.heroRole);
            image = itemView.findViewById(R.id.heroImage);
        }
    }
}
