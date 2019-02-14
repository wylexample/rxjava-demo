package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 只发射前面的N项数据
 */
public class Take {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> take = Observable.range(1, 10).take(4);

        take.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
