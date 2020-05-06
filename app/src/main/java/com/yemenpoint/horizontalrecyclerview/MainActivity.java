package com.yemenpoint.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<mainrecycler_model> isnaf_array = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isnaf_array.add(new mainrecycler_model("id", "name1", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name2", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name3", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name4", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name5", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name5", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name6", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name7", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name8", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name9", R.drawable.app, null));
        isnaf_array.add(new mainrecycler_model("id", "name10", R.drawable.app, null));


        final LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.horizontalrecycler);

        recyclerView.setLayoutManager(layoutManager);
        final LikeRecyclerAdapter adapter = new LikeRecyclerAdapter(MainActivity.this, isnaf_array, new ClickCallback() {
            @Override
            public void onClick(int position, mainrecycler_model item) {
                Toast.makeText(getApplicationContext(), item.getName(), Toast.LENGTH_LONG).show();
            }
        });
        recyclerView.setAdapter(adapter);
        findViewById(R.id.leftArrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutManager.findFirstVisibleItemPosition() > 0) {
                    recyclerView.smoothScrollToPosition(layoutManager.findFirstVisibleItemPosition() - 1);
                } else {
                    recyclerView.smoothScrollToPosition(0);
                }
//                try {
//                    recyclerView.scrollToPosition(adapter.focpostion-1);
//
//                } catch (Exception e) {
//                    recyclerView.scrollToPosition(adapter.focpostion+1);
//
//                }
            }
        });
        findViewById(R.id.rightArrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(layoutManager.findLastVisibleItemPosition() + 1);

//                try {
//                    recyclerView.scrollToPosition(adapter.focpostion+1);
//                } catch (Exception e) {
//                    recyclerView.scrollToPosition(adapter.focpostion-1);
//
//                }
            }
        });
    }
}
