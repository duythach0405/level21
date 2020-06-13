package com.example.level21.Ticket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.level21.R;
import com.example.level21.Message.IncomingJoined;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.faceHolder> {
    private List<IncomingJoined> listTatca;

    public AllAdapter(List<IncomingJoined> listTatca) {
        this.listTatca = listTatca;
    }

    @Override
    public faceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tatca, parent, false);
        return new faceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull faceHolder holder, int position) {
    IncomingJoined tatca = listTatca.get(position);
    holder.tvName_Tatca.setText(tatca.getName());
    holder.tvInbrand_Tatca.setText(tatca.getInbrand());

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    String strTime = dateFormat.format(new Date());
    holder.tvTime_Tatca.setText(strTime);
    holder.ccTatca.setImageResource(R.drawable.sieunhan);
    }

    @Override
    public int getItemCount() {
        return listTatca.size();
    }

    public class faceHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvName_Tatca)    TextView tvName_Tatca;
        @BindView(R.id.tvInbrand_Tatca) TextView tvInbrand_Tatca;
        @BindView(R.id.tvTime_Tatca)    TextView tvTime_Tatca;
        @BindView(R.id.ccTatca)         ImageView ccTatca;
        public faceHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
