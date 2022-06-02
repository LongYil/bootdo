package com.bootdo.testDemo;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author liyinlong
 * @since 2022/4/26 4:50 下午
 */
public class Demo {

    public static void main(String[] args) {
        //连接字符串,zkServer的ip、port，如果是集群逗号分隔
        String connectStr = "10.10.101.38:31218";

//zookeeper对象就是一个zkCli
        ZooKeeper zooKeeper = null;

        try {
//初始次数为1。后面要在内部类中使用，三种写法：1、写成外部类成员变量，不用加final；2、作为函数局部变量，放在try外面，写成final；3、写在try中，不加final
            CountDownLatch countDownLatch = new CountDownLatch(1);
            //超时时间ms，监听器
            zooKeeper = new ZooKeeper(connectStr, 5000, new Watcher() {
                public void process(WatchedEvent watchedEvent) {
                    //如果状态变成已连接
                    if (watchedEvent.getState().equals(Event.KeeperState.SyncConnected)) {
                        System.out.println("连接成功");
                        //次数-1
                        countDownLatch.countDown();
                    }
                }
            });
            //等待，次数为0时才会继续往下执行。等待监听器监听到连接成功，才能操作zk
            countDownLatch.await();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


//...操作zk。后面的demo都是写在此处的


//关闭连接
        try {
            zooKeeper.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
