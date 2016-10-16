package com.akazam.mdcoordinator.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akazam.mdcoordinator.R;

import java.util.ArrayList;

/**
 * Created by www22_000 on 2016/5/6 14:23.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context mContext;
    LayoutInflater mInflater;

    ArrayList<String> mList = new ArrayList<>();

    /**
     * @param context
     */
    public RecyclerAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);

        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                mList.add("The foundational elements of print based design typography");
            } else if (i % 3 == 0) {
                mList.add("Material is the metaphor");
            } else {
                mList.add("data:" + i);
            }
        }
    }

    /**
     * 创建viewholder
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    /**
     * 给viewholder绑定数据
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String txt = mList.get(position);
        holder.mTextView.setText(txt);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * viewholder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            CardView cardView = (CardView) itemView;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mTextView = (TextView) itemView.findViewById(R.id.textView_item);
        }

    }


}
