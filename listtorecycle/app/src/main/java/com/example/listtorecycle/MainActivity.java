package com.example.listtorecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_view);


        ArrayList<runner> maze = new ArrayList<runner>();
        maze.add(new runner("Deathstroke","Deadpool"));
        maze.add(new runner("Big Barda","Gamora"));
        maze.add(new runner("Red Hood","Winter Soldier"));
        maze.add(new runner("Swamp Thing","Man Thing"));
        maze.add(new runner("Green Arrow","hawkeye"));
        maze.add(new runner("Aquaman","Namor"));
        maze.add(new runner("Elongated Man","Mr. Fantastic"));
        maze.add(new runner("Atom","ant-Man"));
        maze.add(new runner("Red Tornado","Vision"));
        maze.add(new runner("Doom Patrol","X-Men"));
        maze.add(new runner("Catwoman","Black Cat"));
        maze.add(new runner("Green Lantern","Nova"));
        maze.add(new runner("Bat-Man","Moon knight"));
        maze.add(new runner("Wonder Woman","Power Princess"));
        maze.add(new runner("Superman","Hyperion"));


        layoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        NewAdapter adapter = new NewAdapter(maze,this);
        recyclerView.setAdapter(adapter);

    }
}
