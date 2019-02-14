package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 连续地对数据序列的每一项应用一个函数，然后连续发射结果
 */
public class Scan {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.range(1, 5).scan((a, b) -> a + b).subscribeOn(Schedulers.computation());

        observable.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
