package com.star.rxjavademo.fiterobservable;

import io.reactivex.Completable;
import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 不发射任何数据，只发射Observable的终止通知
 */
public class IgnoreElements {

    public static void main(String[] args) throws InterruptedException {
        Completable just = Observable.just("just").ignoreElements();

        just.subscribe(() -> System.out.println("complete"));

        Thread.sleep(500);
    }
}
