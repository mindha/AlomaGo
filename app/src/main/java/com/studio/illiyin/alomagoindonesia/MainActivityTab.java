package com.studio.illiyin.alomagoindonesia;

import android.app.ActionBar;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.studio.illiyin.alomagoindonesia.fragment.About;
import com.studio.illiyin.alomagoindonesia.fragment.Disclaimer;
import com.studio.illiyin.alomagoindonesia.fragment.Feedback;
import com.studio.illiyin.alomagoindonesia.fragment.FragmentDua;
import com.studio.illiyin.alomagoindonesia.fragment.FragmentSatu;
import com.studio.illiyin.alomagoindonesia.fragment.History;
import com.studio.illiyin.alomagoindonesia.fragment.PrivacyPolicy;
import com.studio.illiyin.alomagoindonesia.fragment.Rate;
import com.studio.illiyin.alomagoindonesia.fragment.TellFriend;

public class MainActivityTab extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */

    /**
     * The {@link ViewPager} that will host the section contents.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        getActionBar().setDisplayHomeAsUpEnabled(fal);
//        getActionBar().setHomeButtonEnabled(true);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        Fragment first = new FragmentSatu();
        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.container, first);
        fragment.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_tab, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==android.R.id.home) {
            Fragment tab1 = new FragmentSatu();
            changeFragment(tab1);
            return true;
        }

        if (id == R.id.sign_in){
            Fragment tab1 = new FragmentDua();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.history){
             Fragment tab1 = new History();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.rate){
            Fragment tab1 = new Rate();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.tell_friend){
            Fragment tab1 = new TellFriend();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.feedback){
            Fragment tab1 = new Feedback();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.disclaimer){
            Fragment tab1 = new Disclaimer();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.privacy){
            Fragment tab1 = new PrivacyPolicy();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.about){
            Fragment tab1 = new About();
            changeFragment(tab1);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public void changeFragment(Fragment fragments){
        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.container, fragments);
        fragment.commitNow();
    }

}
