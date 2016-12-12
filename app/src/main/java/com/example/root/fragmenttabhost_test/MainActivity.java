package com.example.root.fragmenttabhost_test;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TabHost;

import java.util.HashMap;

public class MainActivity extends FragmentActivity {
    FragmentTabHost fragmentTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = new Button(getBaseContext());
        Button button2 = new Button(getBaseContext());
        Button button3 = new Button(getBaseContext());
        Button button4 = new Button(getBaseContext());
        Button button5 = new Button(getBaseContext());
        button1.setText("Main");
        button2.setText("News");
        button3.setText("Friends");
        button4.setText("Me");
        button5.setText("comment");

        fragmentTabHost = (FragmentTabHost) findViewById(R.id.fragmentTabHost);
        fragmentTabHost.setup(this, getSupportFragmentManager(), R.id.fragment_main);
        fragmentTabHost.getTabWidget().setDividerDrawable(null);

        TabHost.TabSpec tabSpec1 = fragmentTabHost.newTabSpec("main").setIndicator(button1);
        TabHost.TabSpec tabSpec2 = fragmentTabHost.newTabSpec("news").setIndicator(button2);
        TabHost.TabSpec tabSpec3 = fragmentTabHost.newTabSpec("friends").setIndicator(button3);
        TabHost.TabSpec tabSpec4 = fragmentTabHost.newTabSpec("me").setIndicator(button4);
        TabHost.TabSpec tabSpec5 = fragmentTabHost.newTabSpec("comment").setIndicator(button5);
        fragmentTabHost.addTab(tabSpec1, MainFragment.class, null);
        fragmentTabHost.addTab(tabSpec2, NewsFragment.class, null);
        fragmentTabHost.addTab(tabSpec3, MeFragment.class, null);
        fragmentTabHost.addTab(tabSpec4, FriendsFragment.class, null);
        fragmentTabHost.addTab(tabSpec5,CommentOperatingFragment.class,null);
        fragmentTabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.color.colorPrimary);
        fragmentTabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.color.colorPrimary);
        fragmentTabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.color.colorPrimary);
        fragmentTabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.color.colorPrimary);

    }

}
