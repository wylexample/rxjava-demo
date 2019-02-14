package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 发射Observable发射的最后N项数据
 */
public class TakeLast {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> takeLast = Observable.range(1, 10).takeLast(4);

        takeLast.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
