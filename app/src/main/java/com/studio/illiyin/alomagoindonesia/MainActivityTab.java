package com.studio.illiyin.alomagoindonesia;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.studio.illiyin.alomagoindonesia.MenuTab.Kabar;
import com.studio.illiyin.alomagoindonesia.MenuTab.TransferPulsa;
import com.studio.illiyin.alomagoindonesia.fragment.About;
import com.studio.illiyin.alomagoindonesia.fragment.Disclaimer;
import com.studio.illiyin.alomagoindonesia.fragment.Feedback;
import com.studio.illiyin.alomagoindonesia.fragment.FragmentDua;
import com.studio.illiyin.alomagoindonesia.fragment.FragmentSatu;
import com.studio.illiyin.alomagoindonesia.fragment.History;
import com.studio.illiyin.alomagoindonesia.fragment.PrivacyPolicy;
import com.studio.illiyin.alomagoindonesia.fragment.Rate;
import com.studio.illiyin.alomagoindonesia.fragment.Registration;
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

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        FragmentDua first = new FragmentDua();
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
         if (id == R.id.sign_in){
            Registration tab1 = new Registration();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.history){
            History tab1 = new History();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.rate){
            Rate tab1 = new Rate();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.tell_friend){
            TellFriend tab1 = new TellFriend();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.feedback){
            Feedback tab1 = new Feedback();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.disclaimer){
            Disclaimer tab1 = new Disclaimer();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.privacy){
            PrivacyPolicy tab1 = new PrivacyPolicy();
            changeFragment(tab1);
            return true;
        }else if (id == R.id.about){
            About tab1 = new About();
            changeFragment(tab1);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */

    public void changeFragment(Fragment fragments){
        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.container, fragments);
        fragment.commit();
    }


}
