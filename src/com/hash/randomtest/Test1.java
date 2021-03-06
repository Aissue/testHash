package com.hash.randomtest;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *test gen 6 random
 * Created by Administrator on 2017/8/20.
 */
public class Test1 {
    public static String hisDate;
    public static Random random = new Random();
    public static Set set = new HashSet();
    public static String generate(int length) {
        String format="%0"+length+"d";
        int result=random.nextInt((int)Math.pow(10,(double)length));
        if(set.contains(result)){
            return generate(length);
        }else{
            if(set.size()>100000){
                set.clear();
            }
            set.add(result);
            return String.format(format,result);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            System.out.println(generate(6));
        }
        System.out.println(set.size());
    }
}
