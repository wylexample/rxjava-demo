package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 只发射最后一项（或者满足某个条件的最后一项）数据
 */
public class Last {

    public static void main(String[] args) throws InterruptedException {
        Single<Integer> first = Observable.range(1, 10).filter(i -> i < 4).last(0);

        first.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
