package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 抑制Observable发射的前N项数据
 */
public class Skip {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> skip = Observable.range(1, 10).skip(4);

        skip.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
