package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 抑制（过滤掉）重复的数据项
 */
public class Distinct {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 4, 4, 5, 6).distinct();

        observable.subscribeOn(Schedulers.computation()).subscribe(System.out::println);

        Thread.sleep(500);
    }
}
