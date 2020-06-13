package com.example.level21.Notification;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.level21.Message.IncomingJoined;
import com.example.level21.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NotificationFragment extends Fragment {
    @BindView(R.id.rcNotification)
    RecyclerView rcNotification;
    List<IncomingJoined> list;
    NotifitionAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        ButterKnife.bind(this, view);
        list = new ArrayList<>();
        list.add(new IncomingJoined(R.drawable.sieunhan,"Bạn có 4 ticket","hôm nay"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Website Long Quang","đang nhắn tin cho bạn"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"CSKH đã thay đổi trạng thái","hôm nay"));
        list.add(new IncomingJoined(R.drawable.sieunhan,"Bạn bị nhỡ một cuộc gọi từ Website","hôm nay"));
        adapter = new NotifitionAdapter(list);
        rcNotification.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager  = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rcNotification.setLayoutManager(linearLayoutManager);
        rcNotification.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }
}
