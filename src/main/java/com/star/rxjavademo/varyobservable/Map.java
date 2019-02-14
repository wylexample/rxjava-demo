package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 对Observable发射的每一项数据应用一个函数，执行变换操作
 */
public class Map {

    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable = Observable.range(1, 10).map(i -> "i am " + i).subscribeOn(Schedulers.computation());

        observable.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
