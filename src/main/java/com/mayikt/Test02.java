package com.mayikt;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author mao
 * @Data 2021/7/14 16:34
 **/
public class Test02 {
    public static void main(String[] args) {
        //使用匿名内部类调用
//        OrderService orderService = new OrderService() {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        };
//
//        orderService.get();

//        new OrderService() {
//            @Override
//            public void get() {
//                System.out.println("get");
//            }
//        }.get();


        new Thread(() -> System.out.println(Thread.currentThread().getName()+",run")).start();
    }
}
