package com.fullana.calculadora;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import android.widget.TextView;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String i;
    @Test
    public void test1(){
        //2*3=6
        i ="2*3";
        assertEquals(6,Calculator.suma(i));
    }
    @Test
    public void test2(){
        //1*2*8=16
        i ="1*2*8";
        assertEquals(16,Calculator.suma(i));
    }
    @Test
    public void test3(){
        //2*2+3=7
        i ="2*2+3";
        assertEquals(7 ,Calculator.suma(i));
    }
    @Test
    public void test4(){
        //3+2*2=7
        i ="3+2*2";
        assertEquals(7,Calculator.suma(i));
    }
    @Test
    public void test5(){
        //3+2*2+4=11
        i ="3+2*2+4";
        assertEquals(11,Calculator.suma(i));
    }
}