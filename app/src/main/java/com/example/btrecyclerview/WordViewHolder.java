package com.example.btrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final WordListAdapter mAdapter;
    //public int pos;
    ImageView imPic;
    TextView txTit, txWord;
    public WordViewHolder (View itemView, WordListAdapter adapter){
        super(itemView);
            //get the layout
        this.imPic = itemView.findViewById(R.id.pic);
        this.txTit = itemView.findViewById(R.id.title);
        this.txWord = itemView.findViewById(R.id.word);
            //Associate with this adaptor
        this.mAdapter = adapter;
            //add click listener; if desired
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String[] item = this.mAdapter.getItemByPos(this.getAbsoluteAdapterPosition());
        Intent intent = new Intent(view.getContext(), detail.class);
        intent.putExtra("item",item);
        view.getContext().startActivity(intent);
    }
}
