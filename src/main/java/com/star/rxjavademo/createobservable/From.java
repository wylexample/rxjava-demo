package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 将其它种类的对象和数据类型转换为Observable
 */
public class From {

    public static void main(String[] args) throws InterruptedException {
        Integer[] items = {1,2,3,4,5};
        Observable<Integer> observable = Observable.fromArray(items).subscribeOn(Schedulers.computation());

        observable.subscribe(item -> System.out.println(item), e -> e.printStackTrace(), () -> System.out.println("sequence complete"));

        Thread.sleep(500);
    }
}
