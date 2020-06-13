package com.example.level21;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.level21.Notification.NotificationFragment;
import com.example.level21.Ticket.AllFragment;
import com.example.level21.Message.MessageFragment;
import com.example.level21.Ticket.TicketFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.security.PublicKey;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    @BindView(R.id.ivdown)
    ImageView ivdown;
    @BindView(R.id.ivSound) ImageView ivSound;
    @BindView(R.id.ivWeb1) ImageView ivWeb1;
    @BindView(R.id.ivWeb2) ImageView ivWeb2;
    @BindView(R.id.lltrangthai) LinearLayout lltrangthai;
    @BindView(R.id.ivHomeline) ImageView ivHomelive;
    @BindView(R.id.btnavigation) BottomNavigationView btnavigation;
    @BindView(R.id.nav_view) NavigationView navigationView;
    @BindView(R.id.drawer_layout) DrawerLayout drawerLayout;
    @BindView(R.id.tvHomeline) TextView tvHomeline;
    @BindView(R.id.tvAll) TextView tvAll;

    @BindView(R.id.rlTatca) RelativeLayout rlTatca;
    @BindView(R.id.ivfilter) ImageView ivfilter;
    @BindView(R.id.ivMore) ImageView ivMore;
    @BindView(R.id.ivSearch) ImageView ivSearch;

    @BindView(R.id.tvNotifcation) TextView tvNotification;
    @BindView(R.id.ivMoreNotif) ImageView ivMoreNotif;
    @BindView(R.id.ivSearchNoti) ImageView ivSearchNoti;
    boolean checktrangthai = false;
    boolean checksound = false;
    boolean checkweb1 = false;
    boolean checkweb2 = false;
    boolean checkAll  = false;
    boolean checkFilter = false;
    boolean checkMore = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MessageFragment messageFragment = new MessageFragment();
        creatFragment(messageFragment);
        ButterKnife.bind(this);
        btnavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_tinnhan:
//                        BadgeDrawable
                        MessageFragment messageFragment= new MessageFragment();
                        creatFragment(messageFragment);
                        ivMore.setVisibility(View.GONE);
                        rlTatca.setVisibility(View.GONE);
                        ivfilter.setVisibility(View.GONE);
                        ivSearch.setVisibility(View.GONE);
                        tvHomeline.setVisibility(View.VISIBLE);
                        tvNotification.setVisibility(View.GONE);
                        ivMoreNotif.setVisibility(View.GONE);
                        ivSearchNoti.setVisibility(View.GONE);

                        break;
                    case R.id.menu_ticket:
                        TicketFragment ticketFragment = new TicketFragment();
                        creatFragment(ticketFragment);
                        ivMore.setVisibility(View.VISIBLE);
                        rlTatca.setVisibility(View.VISIBLE);
                        ivfilter.setVisibility(View.VISIBLE);
                        ivSearch.setVisibility(View.VISIBLE);
                        tvHomeline.setVisibility(View.GONE);
                        tvNotification.setVisibility(View.GONE);
                        ivMoreNotif.setVisibility(View.GONE);
                        ivSearchNoti.setVisibility(View.GONE);
                        break;
                    case R.id.menu_livechat:
                        break;
                    case R.id.menu_Notification:
                        NotificationFragment notificationFragment = new NotificationFragment();
                        creatFragment(notificationFragment);
                        ivMore.setVisibility(View.GONE);
                        rlTatca.setVisibility(View.GONE);
                        ivfilter.setVisibility(View.GONE);
                        ivSearch.setVisibility(View.GONE);
                        tvHomeline.setVisibility(View.GONE);
                        tvNotification.setVisibility(View.VISIBLE);
                        ivMoreNotif.setVisibility(View.VISIBLE);
                        ivSearchNoti.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }

        });
    }

    @OnClick(R.id.ivdown)
    public void ivdownOnclick(){
        if (!checktrangthai){
            lltrangthai.setVisibility(View.VISIBLE);
            ivdown.setImageResource(R.drawable.ic_up_arrow);
        }
        else{
            lltrangthai.setVisibility(View.GONE);
            ivdown.setImageResource(R.drawable.ic_menu);
        }
        checktrangthai = !checktrangthai;
    }

    @OnClick(R.id.ivSound)
    public void ivSoundclick(){
        if (!checksound){
            ivSound.setImageResource(R.drawable.ic_off);
        }
        else{
            ivSound.setImageResource(R.drawable.ic_on);
        }
        checksound = !checksound;}

    @OnClick(R.id.ivWeb1)
    public void ivWeb1click(){
        if (!checkweb1){
            ivWeb1.setImageResource(R.drawable.ic_on);
        }
        else{
            ivWeb1.setImageResource(R.drawable.ic_off);
        }
        checkweb1 = !checkweb1;}

    @OnClick(R.id.ivWeb2)
    public void setIvWeb2click(){
        if (!checkweb2){
            ivWeb2.setImageResource(R.drawable.ic_off);
        }
        else{
            ivWeb2.setImageResource(R.drawable.ic_on);
        }
        checkweb2 = !checkweb2;}

    // hàm tạo fragment
    public void creatFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction   = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flactivity, fragment);
        fragmentTransaction.commit();
    }

    // chuyển activity vào navigation drawer
    @OnClick(R.id.ivHomeline)
    public void ivHomeliveClick(){
        drawerLayout.openDrawer(navigationView);
    }
    @SuppressLint("ResourceAsColor")
    @OnClick(R.id.rlTatca)
    public void rlTatcaClick(){
        PopupMenu popupMenu  = new PopupMenu(this, rlTatca);
        popupMenu.getMenuInflater().inflate(R.menu.menu_tatca, popupMenu.getMenu());
        popupMenu.show();
    }
    @OnClick(R.id.ivfilter)
    public void ivfilterClick(){
        PopupMenu popupMenu  = new PopupMenu(this, ivfilter);
        popupMenu.getMenuInflater().inflate(R.menu.menu_ticket, popupMenu.getMenu());
        popupMenu.show();
    }
    @OnClick(R.id.ivMore)
    public void ivMoreClick(){
        PopupMenu popupMenu  = new PopupMenu(this, ivMore);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
        popupMenu.show();
    }
    @OnClick(R.id.ivMoreNotif)
    public void ivMoreNotifClick(){
        PopupMenu popupMenu = new PopupMenu(this, ivMoreNotif);
        popupMenu.getMenuInflater().inflate(R.menu.menu_more_notification, popupMenu.getMenu());
        popupMenu.show();
    }
}
