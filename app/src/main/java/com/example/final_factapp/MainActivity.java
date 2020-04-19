package com.example.final_factapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.postlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getData();
    }

    private void getData(){
        Call<PostList> postlist=BloggerApi.getService().getpostList();
        postlist.enqueue(new Callback<PostList>() {
            @Override
            public void onResponse(Call<PostList> call, Response<PostList> response) {
                PostList list=response.body();
                recyclerView.setAdapter(new PostAdapter(MainActivity.this,list.getPosts()));
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<PostList> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Error Occured", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

