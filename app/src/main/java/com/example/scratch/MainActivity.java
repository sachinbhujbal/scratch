package com.example.scratch;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnScratchListener {

    private final List<CardsList> cardsLists = new ArrayList<>();
    private TextView coins;
    private RecyclerView cardsRecyclerView;
    private CardsAdapter cardsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        coins=findViewById(R.id.coins);
        cardsRecyclerView = findViewById(R.id.cardsRecyclerView);
        cardsRecyclerView.setHasFixedSize(true);

        MyConstants.onScratchListener=this;

        cardsRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        CardsList card1 = new CardsList("1",10,false);
        cardsLists.add(card1);

        CardsList card2 = new CardsList("1",10,false);
        cardsLists.add(card2);

        CardsList card3 = new CardsList("1",10,false);
        cardsLists.add(card3);

        CardsList card4 = new CardsList("1",10,false);
        cardsLists.add(card4);

        CardsList card5 = new CardsList("1",10,false);
        cardsLists.add(card5);

        CardsList card6 = new CardsList("1",10,false);
        cardsLists.add(card6);

        cardsAdapter=new CardsAdapter(cardsLists,MainActivity.this);
        cardsRecyclerView.setAdapter(cardsAdapter);

    }

    @Override
    public void onScratched(int scratchCardListPosition) {
        cardsLists.get(scratchCardListPosition).setScratchStatus(true);

        cardsAdapter.updateData(cardsLists);

        MyConstants.userPoints=MyConstants.userPoints+cardsLists.get(scratchCardListPosition).getWinAmount();
        coins.setText(MyConstants.userPoints+"");
    }
}