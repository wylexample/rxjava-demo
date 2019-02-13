package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 操作符创建一个在给定的时间段之后返回一个特殊值的Observable
 */
public class Timer {

    public static void main(String[] args) throws InterruptedException {
        Observable<Long> timer = Observable.timer(1, TimeUnit.SECONDS, Schedulers.computation());
        timer.subscribe(itme -> System.out.println(itme), e -> e.printStackTrace(), () -> System.out.println("complete"));

        Thread.sleep(1500);
    }
}
