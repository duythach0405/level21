package com.example.level21.Ticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.level21.R;
import com.example.level21.Message.IncomingJoined;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class AllFragment extends Fragment {
    private List<IncomingJoined> list;
    private AllAdapter tatcaAdapter;
    @BindView(R.id.rctatca) RecyclerView rctatca;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__tatca, container, false);
        ButterKnife.bind(this,view);
        list = new ArrayList<>();
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        rctatca.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        rctatca.setLayoutManager(linearLayoutManager);
        tatcaAdapter = new AllAdapter(list);
        rctatca.setAdapter(tatcaAdapter);
        tatcaAdapter.notifyDataSetChanged();
        return view;
    }
}
