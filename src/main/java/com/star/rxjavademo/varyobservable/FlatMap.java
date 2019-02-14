package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;

import java.util.List;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc FlatMap 将一个发射数据的Observable变换为多个Observables，然后将它们发射的数据合并后放进一个单独的Observable
 */
public class FlatMap {

    public static void main(String[] args) throws InterruptedException {
        Observable<List<String>> observable = Observable.range(1, 10).flatMap(i -> Observable.just("i am " + i).buffer(3)).subscribeOn(Schedulers.computation());

        observable.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
