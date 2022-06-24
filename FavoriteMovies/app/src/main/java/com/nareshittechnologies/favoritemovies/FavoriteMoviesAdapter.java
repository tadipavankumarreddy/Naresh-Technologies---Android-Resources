package com.nareshittechnologies.favoritemovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// FavoriteMoviesAdapter - is the RecyclerView Adapter class
// For your adapter class- you need to provide the ViewHolder class info
public class FavoriteMoviesAdapter extends RecyclerView.Adapter<FavoriteMoviesAdapter.FavoriteViewHolder> {

    // to get the data to the adapter class - let us use the constructor
    private Context context;
    private int[] images;
    private String[] names,actors;

    public FavoriteMoviesAdapter(Context context, int[] images, String[] names, String[] actors) {
        this.context = context;
        this.images = images;
        this.names = names;
        this.actors = actors;
    }

    // onCreateViewHolder is responsible to attach the layout to the recyclerview.
    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.one_item_design,parent,false);
        return new FavoriteViewHolder(v);
    }

    // onBindViewholder will populate the data on the layouts attached to the Recyclerview
    // based on the position of the layout
    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.mName.setText(names[position]);
        holder.mActor.setText(actors[position]);
    }

    // getItemCount() returns the total number of items on the Recyclerview
    @Override
    public int getItemCount() {
        return images.length;
    }

    // Records the view information
    public class FavoriteViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView mName, mActor;

        public FavoriteViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.poster);
            mName = itemView.findViewById(R.id.movie_name);
            mActor = itemView.findViewById(R.id.actor_name);
            // We can handle clicks as follows
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    Toast.makeText(context, names[pos], Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
