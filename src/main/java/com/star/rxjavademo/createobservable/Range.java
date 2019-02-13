package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 创建一个发射特定整数序列的Observable
 */
public class Range {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.range(1, 100).subscribeOn(Schedulers.newThread());

        observable.subscribe(item -> System.out.println(item), e -> e.printStackTrace(), () -> System.out.println("complete"));

        Thread.sleep(500);
    }
}
