package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 抑制Observable发射的后N项数据
 */
public class SkipLast {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> skipLast = Observable.range(1, 10).skipLast(4);

        skipLast.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
