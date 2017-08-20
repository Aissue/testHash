package com.hash.jisuan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public class myCal {
    public static void main(String args[]){
        int x=0;
        List<Integer> resultList=new ArrayList<>();
        List<Integer> delList=new ArrayList<>();
        for(int i=1;i<=99;i++){
            resultList.add(i);
            delList.add(i);
        }
        for(int j=0;j<resultList.size();j++){
            for(int k=0;k<delList.size();k++){
                int singleR=resultList.get(j);
                int singleC=delList.get(k);
                if(singleR==1||singleC==1){
                    continue;
                }
                int big=singleR*singleC;
                if(big<=99){
                    String str=big+" ÷ "+singleC+" = \n";
                    try{
                        File file =new File("C:/Users/Administrator/Desktop/result.txt");
                        if(!file.exists()){
                            file.createNewFile();
                        }
                        //true = append file
                        FileWriter fileWritter = new FileWriter(file.getName(),true);
                        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                        bufferWritter.write(str);
                        bufferWritter.flush();
                        bufferWritter.close();

                    }catch (Exception e){
                        e.printStackTrace();
                    }

//                    System.out.println(str);
                    x++;
                }else{
                    continue;
                }
            }
        }
        System.out.println("totle:" +x);
    }
}
