package com.example.level21.Message;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.level21.R;
import com.example.level21.Ticket.AllAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class JoinedFragment extends Fragment {
   private List<IncomingJoined> joinedList;
   private AllAdapter joinedAdapter;
   @BindView(R.id.rcjoined) RecyclerView rcjoined;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_joined, container, false);
        ButterKnife.bind(this,view);
        joinedList  = new ArrayList<>();
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Thái", "idocnet"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phong", "fpt"));
        joinedList.add(new IncomingJoined(R.drawable.sieunhan,"Hoàng Văn Phú", "VinGroup"));
        rcjoined.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        rcjoined.setLayoutManager(linearLayoutManager);
        joinedAdapter = new AllAdapter(joinedList);
        rcjoined.setAdapter(joinedAdapter);
        joinedAdapter.notifyDataSetChanged();
        return view;
    }

    @OnClick(R.id.rcjoined)
    public void rcjoinedClick(){

    }
}
