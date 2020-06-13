package com.example.level21.Notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.level21.Message.IncomingJoined;
import com.example.level21.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotifitionAdapter extends RecyclerView.Adapter<NotifitionAdapter.FaceHolder> {
    private List<IncomingJoined> facelist;

    public NotifitionAdapter(List<IncomingJoined> list) {
        this.facelist = list;
    }

    @NonNull
    @Override
    public FaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification,parent,false);
        return new FaceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaceHolder holder, int position) {
        IncomingJoined incomingJoined = facelist.get(position);
        holder.ccNotification.setImageResource(incomingJoined.getAvatar());
        holder.tvNameNotification.setText(incomingJoined.getName());
        holder.tvInbrandNotification.setText(incomingJoined.getInbrand());

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String str = dateFormat.format(new Date());
        holder.tvTimeNotification.setText(str);
    }

    @Override
    public int getItemCount() {
        return facelist.size();
    }

    public class FaceHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvName_Notification) TextView tvNameNotification;
        @BindView(R.id.tvInbrand_Notification) TextView tvInbrandNotification;
        @BindView(R.id.tvTime_Notification) TextView tvTimeNotification;
        @BindView(R.id.ccNotification) ImageView ccNotification;
        public FaceHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
