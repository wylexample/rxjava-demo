package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 将一个Observable分拆为一些Observables集合，它们中的每一个发射原始Observable的一个子序列
 */
public class GroupBy {

    public static void main(String[] args) throws InterruptedException {
        Observable<GroupedObservable<Integer, Integer>> observableObservable = Observable.range(1, 10).groupBy(i -> i).subscribeOn(Schedulers.computation());

        observableObservable.subscribe(item -> System.out.println(item.getKey()));

        Thread.sleep(500);
    }
}
