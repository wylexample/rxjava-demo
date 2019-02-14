package com.star.rxjavademo.fiterobservable;

import io.reactivex.Observable;

/**
 * @author wuyulong
 * @date 2019/2/14
 * @desc 只发射通过了谓词测试的数据项
 */
public class Filter {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> filter = Observable.range(1, 10).filter(i -> i > 4);

        filter.subscribe(System.out::println);

        Thread.sleep(500);
    }
}
