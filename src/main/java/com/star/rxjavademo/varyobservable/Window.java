package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 定期将来自原始Observable的数据分解为一个Observable窗口，发射这些窗口，而不是每次发射一项数据
 */
public class Window {

    public static void main(String[] args) throws InterruptedException {
        Observable<Observable<Integer>> observable = Observable.range(1, 10).window(3).subscribeOn(Schedulers.computation());

        observable.subscribe(item -> {
            item.subscribe(System.out::println);
        });

        Thread.sleep(500);
    }
}
