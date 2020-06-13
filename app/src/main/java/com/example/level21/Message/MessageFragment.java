package com.example.level21.Message;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.level21.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MessageFragment extends Fragment {
    @BindView(R.id.vpTinnhan) ViewPager vpTinnhan;
    @BindView(R.id.llMessage) LinearLayout llMessage;
    @BindView(R.id.tbMessage) TabLayout tbMessage;
    @BindView(R.id.tvIncoming) TextView tvIncoming;
    @BindView(R.id.tvIncomingNumber) TextView tvIncomingNumber;
    @BindView(R.id.tvJoined) TextView tvJoined;
    @BindView(R.id.tvJoinedNumber) TextView tvJoinedNumber;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tinnhan, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPagerAdapter vpTinnhanAdapter = new ViewPagerAdapter(getChildFragmentManager());
        vpTinnhanAdapter.add(new IncomingFragment(), "INCOMING");
        vpTinnhanAdapter.add(new JoinedFragment(),"JOINED");
        vpTinnhan.setAdapter(vpTinnhanAdapter);
        tbMessage.setupWithViewPager(vpTinnhan);
    }

//   @OnClick(R.id.tvIncoming)
//    public void tvIncoming(){
//       ViewPagerAdapter vpTinnhanAdapter = new ViewPagerAdapter(getChildFragmentManager());
//       vpTinnhanAdapter.add(new IncomingFragment(),"INCOMING");
//       vpTinnhan.setAdapter(vpTinnhanAdapter);
//       vpTinnhanAdapter.notifyDataSetChanged();
//   }
//    @OnClick(R.id.tvJoined)
//    public void tvJoinedClick(){
//        ViewPagerAdapter vpTinnhanAdapter = new ViewPagerAdapter(getChildFragmentManager());
//        vpTinnhanAdapter.add(new JoinedFragment(), "JOINED");
//        vpTinnhan.setAdapter(vpTinnhanAdapter);
//        vpTinnhanAdapter.notifyDataSetChanged();
//    }


}
