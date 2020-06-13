package com.example.level21.Message;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.level21.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.faceHolder> {
    private List<IncomingJoined> faceList;

    public RecycleAdapter(List<IncomingJoined> faceList) {
        this.faceList = faceList;
    }

    @Override
    public faceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_incoming, parent, false);
        return new faceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull faceHolder holder, int position) {
        IncomingJoined incoming = faceList.get(position);
        holder.tvName_Incoming.setText(incoming.getName());

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String strTime = dateFormat.format(new Date());
        holder.tvTime_Incoming.setText(strTime);

        holder.tvInbrand_Incoming.setText(incoming.getInbrand());
        holder.ccIncoming.setImageResource(incoming.getAvatar());
    }

    @Override
    public int getItemCount() {
        return faceList.size();
    }

    public class faceHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvName_Incoming)    TextView tvName_Incoming;
        @BindView(R.id.tvInbrand_Incoming) TextView tvInbrand_Incoming;
        @BindView(R.id.tvTime_Incoming)    TextView tvTime_Incoming;
        @BindView(R.id.ccIncoming)         ImageView ccIncoming;
        public faceHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
