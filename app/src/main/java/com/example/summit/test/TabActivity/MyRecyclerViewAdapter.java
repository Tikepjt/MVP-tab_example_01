//package com.example.summit.test.TabActivity;
//
//import android.content.Context;
//import android.databinding.DataBindingUtil;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//
//import com.example.summit.test.R;
//import com.example.summit.test.databinding.RowRequestItemBinding;
//
//import java.util.ArrayList;
//
//
//class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{
//
//    Context mContext;
//    ArrayList<RequestItem> mArrFriendsRequestItem;
//
//
//    ///생성자
//    public MyRecyclerViewAdapter(Context context, ArrayList<RequestItem> arrFriendsRequestItem){
//        mContext = context;
//        mArrFriendsRequestItem = arrFriendsRequestItem;
//    }
//
//
//    /// 리스트뷰에 View객체 한칸이 새롭게 생성 될 떄 호출됨
//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
////        LayoutInflater inflater = LayoutInflater.from(mContext);
////        RowRequestItemBinding = DataBindingUtil.inflate(inflater, R.layout.row_request_item, parent, true);
//
////        MyViewHolder holder = new MyViewHolder();
//
////        return holder;
//
//        LayoutInflater inflater = LayoutInflater.from( mContext );
//        RowRequestItemBinding binding = DataBindingUtil.inflate( inflater, R.layout.row_request_item, parent, true );
//
//        MyViewHolder holder = new MyViewHolder( binding );
//
//        return holder;
//    }
//
//
//    /// 리스트뷰에 실제로 뷰를 출력하기 직전에 호출됨
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//        RequestItem item = mArrFriendsRequestItem.get(position);
//        RowRequestItemBinding binding = holder.mBinding;
//
////        binding.nopeBtn.setText(item.);
////        binding.sureBtn.setText(item.);
//
//
//    }
//
//
//    /// 리스트뷰가 출력 할 아이템의 갯수를 리턴함
//    @Override
//    public int getItemCount() {
//        return mArrFriendsRequestItem.size();
//    }
//
//
//    class MyViewHolder extends RecyclerView.ViewHolder {
//        RowRequestItemBinding mBinding;
//
//        public MyViewHolder(RowRequestItemBinding binding) {
//            super(binding.getRoot());
//            mBinding = binding;
//        }
//    }
//
//
//}
package com.example.summit.test.TabActivity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.summit.test.R;
import com.example.summit.test.databinding.RowRequestItemBinding;

import java.util.ArrayList;

public class RecyclerViewAapter extends RecyclerView.Adapter<RecyclerViewAapter.MyViewHolder> {

    Context mContext;
    ArrayList<RequestItem> mArrRequestItem;

    public RecyclerViewAapter(Context context, ArrayList<RequestItem> arrRequestItem) {
        mContext = context;
        mArrRequestItem = arrRequestItem;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        RowRequestItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.row_request_item, parent, true);

        MyViewHolder holder = new MyViewHolder(binding);
        return holder;
    }


    @Override
    public RecyclerViewAapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RequestItem item = mArrRequestItem.get(position);
        RowRequestItemBinding binding = holder.mBinding;

        binding.nopeBtn.setText(item.);
        binding.sureBtn.setText(item.);


    }

    @Override
    public int getItemCount() {
        return mArrRequestItem.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        RowRequestItemBinding mBinding;

        public MyViewHolder(RowRequestItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }


}
