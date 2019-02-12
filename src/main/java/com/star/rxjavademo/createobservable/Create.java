package com.star.rxjavademo.createobservable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @Auther: Wuyulong
 * @Date: 2019/2/12 21:12
 * @Description: 使用一个函数从头开始创建一个Observable
 */
public class Create {


    public static void main(String[] args) {
        Disposable subscribe = Observable.create(emitter -> {
            System.out.println("emitter");
            emitter.onNext("hello");
            emitter.onError(new RuntimeException("run time exception"));
        })
        .subscribeOn(Schedulers.computation())
        .subscribe(str -> {
            System.out.println(str + " world");
        }, e -> {
            System.out.println(e.getMessage());
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {


        }
    }
}
