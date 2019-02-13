package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 创建一个发射特定数据重复多次的Observable
 */
public class Repeat {

    public static void main(String[] args) throws InterruptedException {
        Observable<String> repeat = Observable.just("repeat").repeat(5).subscribeOn(Schedulers.computation());

        repeat.subscribe(item -> System.out.println(item));

        Observable<String> repeatWhen = Observable.just("repeat when").repeatWhen(observable -> Observable.range(1, 10)).subscribeOn(Schedulers.computation());
        repeatWhen.subscribe(item -> System.out.println(item));
        Thread.sleep(1000);
    }
}
