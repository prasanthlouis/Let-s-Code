package com.psiuol21.prasanth.myapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by Prasanth on 8/24/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity ma;
    TextView tv;
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ma=this.getActivity();
        tv=(TextView)getActivity().findViewById(R.id.tv);

    }

    @SmallTest
    public void testnotnull()
    {
     assertNotNull(tv);
        assertEquals("Hello World",tv.getText());
    }



    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
