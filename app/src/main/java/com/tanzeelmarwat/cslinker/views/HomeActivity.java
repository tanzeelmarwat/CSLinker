package com.tanzeelmarwat.cslinker.views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.tanzeelmarwat.cslinker.R;
import com.tanzeelmarwat.cslinker.utils.Constants;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        StudentsFragment studentsFragment = new StudentsFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_home, studentsFragment, Constants.FRAGMENT_STUDENTS);
        fragmentTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.alumni) {
            // Load Alumni Fragment
            AlumniFragment alumniFragment = new AlumniFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, alumniFragment, Constants.FRAGMENT_ALUMNI);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        } else if (id == R.id.students) {
            // Load Students Fragment
            StudentsFragment studentsFragment = new StudentsFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, studentsFragment, Constants.FRAGMENT_STUDENTS);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        } else if (id == R.id.campus) {
            // Load Campus Fragment
            CampusFragment campusFragment = new CampusFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, campusFragment, Constants.FRAGMENT_CAMPUS);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        } else if (id == R.id.faculty) {
            // Load Faculty Fragment
            FacultyFragment facultyFragment = new FacultyFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, facultyFragment, Constants.FRAGMENT_FACULTY);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        } else if (id == R.id.staff) {
            // Load Staff Fragment
            StaffFragment staffFragment = new StaffFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, staffFragment, Constants.FRAGMENT_STAFF);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        } else if (id == R.id.profile) {
            // Load Profile Fragment
            ProfileFragment profileFragment = new ProfileFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container_home, profileFragment, Constants.FRAGMENT_PROFILE);
            fragmentTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
