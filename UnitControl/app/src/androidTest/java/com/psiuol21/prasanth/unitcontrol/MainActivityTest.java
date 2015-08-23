package com.psiuol21.prasanth.unitcontrol;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by Prasanth on 8/23/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity=this.getActivity();

    }

    @SmallTest
    public void testChecker()
    {

        TextView tv=(TextView)getActivity().findViewById(R.id.Textview);
        assertEquals("",tv.getText());

    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
