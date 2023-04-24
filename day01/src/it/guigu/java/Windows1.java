package it.guigu.java;

import java.util.concurrent.locks.ReentrantLock;

public class Windows1 implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().
                        getName() + ": 卖票，票号为 : " + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }

}
class windowsTest1{
    public static void main(String[] args) {
       /* int h = 3;
        Windows1 w = new Windows1();
        Thread t1 = new Thread();
        t1.start();*/
        for (int i = 1; i <= 5; i++) {
            int temp = i;
            new Thread(()->{
                System.out.println(temp);
            },String.valueOf(i)).start();
        }
    }
}
