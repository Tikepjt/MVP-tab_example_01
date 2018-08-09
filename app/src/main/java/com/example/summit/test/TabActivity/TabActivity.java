package com.example.summit.test.TabActivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.summit.test.R;
import com.example.summit.test.databinding.ActivityTabBinding;


public class TabActivity extends AppCompatActivity {

    ActivityTabBinding mBinding;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_tab);


        mBinding.tabRequestLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });

        mBinding.tabFriendsLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });
    }

}


//
//public class TabActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tab);
//
//
//    }
//}

