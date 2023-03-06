package com.example.btrecyclerview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter
        extends RecyclerView.Adapter<WordViewHolder>{
    private final LayoutInflater mInflater;
    Context context;
    private String [][] mWordList = new String[10][3];

    public String[] getItemByPos (int pos){
        return mWordList[pos];
    }
    public WordListAdapter(Context context, String [][] wordList){
        this.context = context;
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_view_recycler, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String [] mCurrent = mWordList[position];
        //add data to the view
            //convert string data to id
        //int idImg = this.context.getResources().getIdentifier(mCurrent[0],"drawable", "xml");
        int idImg = this.context.getResources().getIdentifier(mCurrent[0],"drawable", context.getPackageName());
        holder.imPic.setImageResource(idImg);
        holder.txTit.setText(mCurrent[1]);
        holder.txWord.setText(mCurrent[2].toCharArray(),0,30);
    }


    @Override
    public int getItemCount() {
        return mWordList.length;
    }
}
