package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 有观察者才创建Observable，每个观察者都创建一个自己的
 */
public class Defer {

    public static void main(String[] args) throws InterruptedException {


        Observable<AtomicLong> defer = Observable.defer(() -> {
            AtomicLong atomicLong = new AtomicLong(2);
            System.out.println("defer");
            return Observable.just(atomicLong);
        }).subscribeOn(Schedulers.io());

        defer.subscribe(atomicLong -> System.out.println(atomicLong.getAndIncrement()));
        defer.subscribe(atomicLong -> System.out.println(atomicLong.getAndIncrement()));

        Thread.sleep(500);
    }
}
