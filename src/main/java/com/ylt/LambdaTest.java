package com.ylt;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {
    @Test
    public void Test01(){
        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("传统对象调用方法");
            }
        };
        r1.run();
        System.out.println("***********************");
        Runnable r2 =()->System.out.println("Lambda表达式对象调用方法");
        r2.run();
    }

    @Test
    public void test02(){
        Comparator<Integer> c1 = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println("传统判断大小："+c1.compare(12,23));

        System.out.println("***********************");

        Comparator<Integer> c2 = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println("Lambda表达式判断大小："+c2.compare(12,23));

        System.out.println("***********************");

        Comparator<Integer> c3 = Integer :: compare;

        System.out.println("方法引用判断大小："+c3.compare(35,23));

    }


}
