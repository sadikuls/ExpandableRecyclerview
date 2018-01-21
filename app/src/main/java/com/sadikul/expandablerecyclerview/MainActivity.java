package com.sadikul.expandablerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sadikul.expandablerecyclerview.Adapter.RecyclerAdapter;
import com.sadikul.expandablerecyclerview.model.Artist;
import com.sadikul.expandablerecyclerview.model.Genre;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Genre> genres = getGenres();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //instantiate your adapter with the list of genres
        RecyclerAdapter adapter = new RecyclerAdapter(this,genres);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    public List<Genre> getGenres() {
        List<Genre> outterlist = new ArrayList<>() ;

        for(int i = 0 ; i < outter_title.length ; i++){

            List<Artist> innerlist = new ArrayList<>() ;

            for(int j = 0 ; j <inner_string.length ; j++){

                Artist innerModel = new Artist(inner_string[j]) ;
                innerlist.add(innerModel) ;
            }

            Genre outerModel = new Genre(outter_title[i], innerlist) ;
            outterlist.add(outerModel) ;
        }

        return outterlist ;
    }

    String[] outter_title = {"Doctor one", "Doctor two", "Dcotor three"} ;
    String[] inner_string = {"apollo hospital", "United hospital"};
}
