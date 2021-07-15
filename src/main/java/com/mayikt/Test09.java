package com.mayikt;

/**
 * @ClassName Test09
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 9:50
 **/
public class Test09 {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("获取线程名称" + Thread.currentThread().getName() + ",子线程");
//            }
//        }).start();
//
        new Thread(() -> System.out.println("获取线程名称" + Thread.currentThread().getName() + ",子线程")).start();
    }
}
