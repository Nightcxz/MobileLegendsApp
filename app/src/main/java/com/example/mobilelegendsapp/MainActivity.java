package com.example.mobilelegendsapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView heroRecyclerView;
    private HeroAdapter heroAdapter;
    private List<Hero> heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroRecyclerView = findViewById(R.id.heroRecyclerView);
        heroRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create the hero list
        heroList = new ArrayList<>();
        heroList.add(new Hero("Alucard", "Fighter","Alucard is a demon hunter who is known for his powerful lifesteal and burst damage. He's a deadly fighter who excels in close-range combat, with skills that allow him to dash, deal damage, and slow enemies. His passive ability, Pursuit, enhances his mobility and damage after each skill cast.", R.drawable.alucard));
        heroList.add(new Hero("Layla", "Marksman","Layla is a marksman hero known for her high damage output at range and her ability to deal area-of-effect damage. She's described as a \"glass cannon,\" meaning she deals a lot of damage but is also very vulnerable. Layla's weapon is the Malefic Cannon, which was crafted by her father using magic stone.", R.drawable.layla));
        heroList.add(new Hero("Miya", "Marksman","Miya is a highly popular and effective Marksman hero, known as the Moonlight Archer. She is a classic pick, especially in the gold lane, due to her strong late-game potential and ability to deal massive damage with her basic attacks. Miya's kit revolves around attack speed and area of effect damage, making her a formidable opponent in team fights.", R.drawable.miya));
        heroList.add(new Hero("Tigreal", "Tank","Tigreal is the rising star of the Moniyan Empire. But in a battle, the Second Army that he was leading went deep into the enemy territory alone under the orders of high-level officials and suffered heavy losses, for which Tigreal was eventually forced to take responsibility", R.drawable.tigreal));
        heroList.add(new Hero("Gusion", "Assassin","Gusion was the first hero to deal both physical and magic damage on skills. (Physical: passive skill; Magic: all active skills) His revamp made his passive deal magic damage. Gusion is the first and only hero whose active skills have second phases.", R.drawable.gusion));
        heroList.add(new Hero("Nana", "Support/Mage","Nana is a versatile hero in Mobile Legends, excelling as a mage or support. With her powerful crowd control and damage skills, she shines in team fights and is a strong choice for roaming support roles.", R.drawable.nana));
        heroList.add(new Hero("Lesley", "Marksman","Lesley is a marksman hero who plays as a sniper-type hero. She uses Energy instead of Mana, has a passive ability called Lethal Shot that grants true damage and extra range, and specializes in dealing damage from a distance. Her ultimate, Fatal Blow, locks onto a target and fires four bullets, dealing damage that scales with the target's lost health. ", R.drawable.lesley));
        heroList.add(new Hero("Chou", "Fighter","Chou is a fighter hero known for his high damage and mobility. He is described as a skilled martial artist who learned the ancient oriental martial arts under a mysterious monk, making him agile and proficient with the nunchaku, according to the Mobile Legends: Bang Bang Wiki. ", R.drawable.chou));
        heroList.add(new Hero("Eudora", "Mage","Eudora is known as the \"Lightning Weaver\" and is a powerful midlane pick. She specializes in dealing high magic damage and crowd control, with her ultimate ability capable of one-shotting enemies. Eudora is a Light Elf who can be discriminated against due to her Elf status, but possesses a high level of magical talent, yet she often loses control of her emotions. ", R.drawable.eudora));
        heroList.add(new Hero("Balmond", "Fighter/Tank","Balmond is a tank and a fighter at the same time. He can deal damage while he is absorbing the attacks from the other team, like a hybrid", R.drawable.balmond));

        heroAdapter = new HeroAdapter(heroList);
        heroRecyclerView.setAdapter(heroAdapter);
    }
}

