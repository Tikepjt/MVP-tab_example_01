//package com.example.summit.test.TabActivity;
//
//import android.app.Fragment;
//import android.app.FragmentManager;
//import android.databinding.DataBindingUtil;
////import android.hardware.Sensor;
////import android.hardware.SensorEvent;
////import android.hardware.SensorEventListener;
////import android.hardware.SensorManager;
//import android.os.Bundle;
////import android.support.annotation.Nullable;
//import android.support.v13.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.view.KeyEvent;
//import android.view.View;
//
//import com.example.summit.test.R;
//import com.example.summit.test.databinding.ActivityTabBinding;
//
//import java.util.ArrayList;
//
////public class TabActivity extends AppCompatActivity implements TabContractor.View, SensorEventListener {
//public class TabActivity extends AppCompatActivity {
//
//    //    TabPresenter mPresenter;
//    ActivityTabBinding mBinding;
//    MyRecyclerViewAdapter mAdapter;
//    ArrayList<RequestItem> mArrFriendsRequestItem;
//
//    MyAdapter adapter;
//    ViewPager viewPager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_tab);
//
//        /// 리사이클러 아답터에 전달해서 화면에 뿌릴 아이템 리스트 메모리에 생성
//        mArrFriendsRequestItem = new ArrayList<>();
//
//        /// 아이템과 컨텍스트를 전달하여 아답터 생성
//        mAdapter = new MyRecyclerViewAdapter(this, mArrFriendsRequestItem);
//
//        /// 리사이클러뷰에 아답터를 설정해줌
//        mBinding.tabRequestLayout.setAdapter(mAdapter);
//
//        /// 리사이클러뷰가 뿌려질 형태에 관해 명시해줌
//        mBinding.tabRequestLayout.setLayoutManager(new LinearLayoutManager(this));
//
//
//        mBinding.tabRequestLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                mBinding.effectRequestView.setBackgroundColor(0xffffffff);
////                mBinding.effectFriendsView.setBackgroundColor(0x00000000);
//                viewPager.setCurrentItem(0);
//            }
//        });
//
//        mBinding.tabFriendsLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                mBinding.effectRequestView.setBackgroundColor(0x00000000);
////                mBinding.effectFriendsView.setBackgroundColor(0xffffffff);
//                viewPager.setCurrentItem(1);
//            }
//        });
//
//        viewPager = findViewById(R.id.friends_view_pager);
//        adapter = new MyAdapter(getFragmentManager());
//        viewPager.setAdapter(new MyAdapter(getFragmentManager()));
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                switch (position) {
//                    case 0:
//                        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
//                        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
//                        break;
//                    case 1:
//                        mBinding.effectRequestView.setBackgroundColor(0x00000000);
//                        mBinding.effectFriendsView.setBackgroundColor(0xffffffff);
//                        break;
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//        setDefaultTab();
//    }
//
//    private void setDefaultTab() {
//        viewPager.setCurrentItem(0);
//        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
//        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
//    }
//
//    @Override
//    public void addRequestItem(RequestItem item) {
//        mArrFriendsRequestItem.add(item);
//        mAdapter.notifyDataSetChanged();
//    }
//
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
//
//        }
//        return true;
//    }
//
//    class MyAdapter extends FragmentPagerAdapter {
//
//
//        public MyAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            Fragment fragment = null;
//            switch (position) {
//                case 0:
//                    fragment = new RequestFragment();
//                    break;
//                case 1:
//                    fragment = new FriendsFragment();
//                    break;
//            }
//            return fragment;
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//    }
//}

package com.example.summit.test.TabActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.summit.test.R;
import com.example.summit.test.databinding.ActivityTabBinding;

public class TabActivity extends AppCompatActivity {

    ActivityTabBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_tab);


        mBinding.tabRequestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mBinding.effectRequestView.setBackgroundColor(0xffffffff);
//                mBinding.effectFriendsView.setBackgroundColor(0x00000000);
                viewPager.setCurrentItem(0);
            }
        });

        mBinding.tabFriendsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mBinding.effectRequestView.setBackgroundColor(0x00000000);
//                mBinding.effectFriendsView.setBackgroundColor(0xffffffff);
                viewPager.setCurrentItem(1);
            }
        });

        viewPager = findViewById(R.id.friends_view_pager);
        adapter = new MyAdapter(getFragmentManager());
        viewPager.setAdapter(new MyAdapter(getFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position) {
                    case 0:
                        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
                        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
                        break;
                    case 1:
                        mBinding.effectRequestView.setBackgroundColor(0x00000000);
                        mBinding.effectFriendsView.setBackgroundColor(0xffffffff);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setDefaultTab();
    }

    MyAdapter adapter;
    ViewPager viewPager;

    private void setDefaultTab() {
        viewPager.setCurrentItem(0);
        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
    }

    class MyAdapter extends FragmentPagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new RequestFragment();
                    break;
                case 1:
                    fragment = new FriendsFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


}
