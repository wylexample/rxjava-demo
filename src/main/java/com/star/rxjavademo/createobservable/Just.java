package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.io.Serializable;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 创建一个发射指定值的Observable
 */
public class Just {

    public static void main(String[] args) throws InterruptedException {
        Observable<? extends Serializable> just = Observable.just(1, 2, 3, "just").subscribeOn(Schedulers.computation());

        just.subscribe(item -> System.out.println(item), e -> e.printStackTrace(), ()-> System.out.println("complete"));

        Thread.sleep(500);
    }
}
