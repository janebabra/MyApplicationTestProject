package com.greendog.example.androidstudio.myapplicationtest.test;

import android.annotation.TargetApi;
import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import static android.test.ViewAsserts.assertOnScreen;

import com.greendog.example.androidstudio.myapplicationtest.MainActivity;
import com.greendog.example.androidstudio.myapplicationtest.R;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;
    private TextView mHelloTestWorldTextView;

    @TargetApi(Build.VERSION_CODES.FROYO)
    public MainActivityTest() {
        super (MainActivity.class);

    }

    protected void setUp() throws Exception {
        super.setUp();

        mMainActivity = getActivity();
        mHelloTestWorldTextView = (TextView) mMainActivity.findViewById(R.id.textView2);

    }

    public void testTextView() {
        assertOnScreen(mMainActivity.getWindow().getDecorView(), mHelloTestWorldTextView);
    }
}
