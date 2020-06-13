package com.example.level21.Ticket;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.level21.R;
import com.example.level21.Message.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TicketFragment extends Fragment {
    @BindView(R.id.vpTicket) ViewPager vpTicket;
    @BindView(R.id.tlTicket) TabLayout tlTicket;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment__ticket, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addTab(vpTicket);
        tlTicket.setupWithViewPager(vpTicket);
    }
    private void addTab(ViewPager viewPager){
        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getChildFragmentManager());
        vpAdapter.add(new AllFragment(),"TẤT CẢ");
        vpAdapter.add(new MeFragment(), "ME");
        viewPager.setAdapter(vpAdapter);
    }
}
