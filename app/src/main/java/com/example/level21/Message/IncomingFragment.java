package com.example.level21.Message;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.level21.R;

import java.util.ArrayList;
import java.util.List;

public class IncomingFragment extends Fragment {
    private List<IncomingJoined> list;
    private RecycleAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          View view = inflater.inflate(R.layout.fragment_incomming, container, false);
        RecyclerView rcIncoming = view.findViewById(R.id.rcIncoming);
        list = new ArrayList<>();
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "vingroup"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "fpt"));
        rcIncoming.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false);
        rcIncoming.setLayoutManager(linearLayoutManager);
        adapter = new RecycleAdapter(list);
        rcIncoming.setAdapter(adapter);
        rcIncoming.setItemAnimator(new DefaultItemAnimator());
        adapter.notifyDataSetChanged();
            return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
