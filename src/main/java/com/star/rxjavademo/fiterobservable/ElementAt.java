package com.star.rxjavademo.fiterobservable;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 只发射第N项数据(下标从0开始)
 */
public class ElementAt {

    public static void main(String[] args) throws InterruptedException {
        Maybe<Integer> maybe = Observable.just(1, 2, 3, 4, 5, 6).elementAt(3);
        Single<Integer> defaultSingle = Observable.just(1, 2, 3, 4, 5, 6).elementAt(7, 0);
        Single<Integer> errorSingle = Observable.just(1, 2, 3, 4, 5, 6).elementAtOrError(8);

        maybe.subscribe(item -> System.out.println("maybe = " + item));
        defaultSingle.subscribe(item -> System.out.println("defaultSingle = " + item));
        errorSingle.subscribe(item -> System.out.println("errorSingle = " + item), e -> e.printStackTrace());
        Thread.sleep(500);
    }
}
