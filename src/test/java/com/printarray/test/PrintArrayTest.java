package com.printarray.test;

import com.printarray.demo.PrintArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintArrayTest {

    private PrintArray printArray;
    private  Integer[] arrInteger={10,20,30};
    private Double[] arrDouble={10.5,20.5,30.5};
    private Character[] arrCharacter={'x','y','z'};

    @Before
    public void initialize() {
        printArray=new PrintArray();
    }

    //UseCase-1
    //TC:1.1
    @Test
    public void  givenArray_ShouldPrintArray() {
        Assert.assertTrue(printArray.toPrint(arrInteger));
        Assert.assertTrue(printArray.toPrint(arrDouble));
        Assert.assertTrue(printArray.toPrint(arrCharacter));
    }

    //UseCase-2
    //TC:2.1
    @Test
    public void  givenArrayToConstructor_ShouldPrintArray(){
        Assert.assertTrue(new PrintArray<Integer>(arrInteger).toPrint());
        Assert.assertTrue(new PrintArray<Double>(arrDouble).toPrint());
        Assert.assertTrue(new PrintArray<Character>(arrCharacter).toPrint());
    }
}