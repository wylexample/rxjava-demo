package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 定期发射Observable最近发射的数据项
 */
public class Sample {

    public static void main(String[] args) throws InterruptedException {
        Observable<Long> observable = Observable.interval(2, 50, TimeUnit.MILLISECONDS).sample(100, TimeUnit.MILLISECONDS);

        observable.subscribe(System.out::println);

        Thread.sleep(5000);
    }
}
