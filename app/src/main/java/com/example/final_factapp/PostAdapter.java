package com.example.final_factapp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private Context context;
    private List<Post> items;

    public PostAdapter(Context context, List<Post> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.post_item,parent,false);
        return  new PostViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post item= items.get(position);
        holder.postTitle.setText(item.getTitle());
        holder.postSummary.setText(item.getSummary());

       /* Pattern p =Pattern.compile("<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>");

        Matcher matcher = p.matcher(item.getContent());
        List<String>tokens = new ArrayList<>();
        while(matcher.find())
        {
            String token = matcher.group(1);
            tokens.add(token);
        }
        Glide.with(context).load(tokens.get(1)).into(holder.postImage);
*/
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        ImageView postImage;
        TextView postTitle;
        TextView postSummary;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImage=itemView.findViewById(R.id.image);
            postTitle=itemView.findViewById(R.id.title);
            postSummary=itemView.findViewById(R.id.summary);
        }
    }
}
