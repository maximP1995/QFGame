package com.proschan.gameserver;

import org.junit.Test;

import java.util.Arrays;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/3/12
 * Description:
 */
public class StrTest1 {
    @Test
    public void strTest(){

        String str = "123,456,789";

        String[] strArr = str.split(",");

        System.out.println(Arrays.toString(strArr));//[java, cpp, php, c#, objective-c]

    }

    @Test
    public void strTest2(){
        Integer[] intArr = {1,23,345};
        String str = Arrays.toString(intArr);
        str = str.substring(1,str.length()-1);
        System.out.println(str);
    }
}
