package com.psiuol21.prasanth.myapplication;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

/**
 * Created by Prasanth on 8/24/2015.
 */
public class NumberAdderTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testAdder()
    {
        int result=NumberAdder.Adder(2,3);
        assertEquals(result,5);
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
