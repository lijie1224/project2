package com.unicom;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 生成20个1-100之间的随机整数，存放到一个ArrayList中
    List <Integer>list=new ArrayList<>();
    public void addRandomNumber(){
        System.out.println("生成的随机整数是：");
    for (int i=0;i<20;i++){
        int j=(int)((Math.random())*100);
        list.add(j);

        System.out.print(list.get(i)+" ");

    }
    }
    //找到生成的随机整数中的偶数
    public void evenNumber(){
        System.out.println(" ");
        System.out.println("偶数是：");
        for (int i=0;i<list.size();i++){
            if(list.get(i)%2!=0){
                continue;

            }else{

                System.out.print(list.get(i)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Main a=new Main();
        a.addRandomNumber();
        a.evenNumber();

    }
}
