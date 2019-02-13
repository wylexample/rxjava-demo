package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 创建一个按固定时间间隔发射整数序列的Observable
 */
public class Interval {

    public static void main(String[] args) throws InterruptedException {
        Observable<Long> observable = Observable.interval(2, 500, TimeUnit.MILLISECONDS, Schedulers.computation());

        observable.subscribe(i -> System.out.println(i));

        Thread.sleep(50000);
    }
}
