package com.example.recycleview_bai2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private List mBook;
    private Context mContext;

    public BookAdapter(List mBook, Context mContext) {
        this.mBook = mBook;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private View bookView;

        public TextView name;

        public ViewHolder(@NonNull View bookView)
        {
            super(bookView);
            bookView = bookView;
            name =bookView.findViewById(R.id.name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View bookItem =inflater.inflate(R.layout.row_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(bookItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = (Book) mBook.get(position);
        holder.name.setText(book.getmName());

    }

    @Override
    public int getItemCount() {
        return mBook.size();
    }
}
