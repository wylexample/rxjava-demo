package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Auther: Wuyulong
 * @Date: 2019/2/12 21:12
 * @Description: 使用一个函数从头开始创建一个Observable
 */
public class Create {


    public static void main(String[] args) throws InterruptedException {
        Observable<Object> objectObservable = Observable.create(emitter -> {
            AtomicLong atomicLong = new AtomicLong(2);
            System.out.println("emitter");
            emitter.onNext(atomicLong);
        }).subscribeOn(Schedulers.computation());
        objectObservable.subscribe(atomic -> {
            if (atomic instanceof AtomicLong){
                AtomicLong atomicLong = (AtomicLong) atomic;
                System.out.println(atomicLong.getAndIncrement());
            }
        });
        objectObservable.subscribe(atomic -> {
            if (atomic instanceof AtomicLong){
                AtomicLong atomicLong = (AtomicLong) atomic;
                System.out.println(atomicLong.getAndIncrement());
            }
        });

        Thread.sleep(1000);
    }
}
