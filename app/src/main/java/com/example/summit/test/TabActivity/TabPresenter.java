package com.example.summit.test.TabActivity;

//import android.content.Context;
//import android.view.KeyEvent;
//import android.hardware.Sensor;
//import android.hardware.SensorEvent;
//import android.hardware.SensorEventListener;
//import android.hardware.SensorManager;
//
//import static android.content.Context.SENSOR_SERVICE;

//public class TabPresenter implements TabContractor.Presenter, SensorEventListener {
//public class TabPresenter implements TabContractor.Presenter {
//    private SensorManager mSensorManager;
//    private Sensor mAccelerometer;

//    private Context mContext;
//    private TabContractor.View mView;

//    private long mShakeTime;
//    private static final int SHAKE_SKIP_TIME = 500;
//    private static final float SHAKE_THRESHOLD_GRAVITY = 2.7F;


//    TabPresenter(Context ct, TabContractor.View view) {
//        mContext = ct;
//        mView = view;
//    }

//    public boolean onKeyDown(int keyCode, KeyEvent event)
//    {
//        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP){
//            return true;
//        }
//    }


//    @Override
//    public void onSensorChanged(SensorEvent event ) {
//        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
//            float axisX = event.values[0];
//            float axisY = event.values[1];
//            float axisZ = event.values[2];
//
//            float gravityX = axisX / SensorManager.GRAVITY_EARTH;
//            float gravityY = axisY / SensorManager.GRAVITY_EARTH;
//            float gravityZ = axisZ / SensorManager.GRAVITY_EARTH;
//
//            Float f = gravityX * gravityX + gravityY * gravityY + gravityZ * gravityZ;
//            double squaredD = Math.sqrt(f.doubleValue());
//            float gForce = (float) squaredD;
//            if (gForce > SHAKE_THRESHOLD_GRAVITY) {
//                long currentTime = System.currentTimeMillis();
//                if (mShakeTime + SHAKE_SKIP_TIME > currentTime) {
//                    RequestItem item = new RequestItem();
//                    mView.addRequestItem(item);
//                }
//
//            }
//
//        }
//
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//    }
//}