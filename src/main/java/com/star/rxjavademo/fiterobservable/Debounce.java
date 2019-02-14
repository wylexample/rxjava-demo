package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 仅在过了一段指定的时间还没发射数据时才发射一个数据(本人还没整明白。。。)
 */
public class Debounce {

    public static void main(String[] args) throws InterruptedException {

        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {

            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) {
                for (int i = 0; i <= 100; i++) {
                    emitter.onNext(i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                emitter.onComplete();
            }
        }).debounce(100, TimeUnit.MILLISECONDS, Schedulers.computation());

        observable.subscribe(System.out::println);

        Thread.sleep(100000);
    }
}
