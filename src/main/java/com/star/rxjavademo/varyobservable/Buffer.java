package com.star.rxjavademo.varyobservable;

import io.reactivex.Observable;

import java.util.List;

/**
 * @author wuyulong
 * @date 2019/2/13
 * @desc 定期收集Observable的数据放进一个数据包裹，然后发射这些数据包裹，而不是一次发射一个值。
 */
public class Buffer {

    public static void main(String[] args) throws InterruptedException {
        Observable<List<Integer>> buffer = Observable.range(1, 10).buffer(3);

        buffer.subscribe(item -> System.out.println(item));
        
        Thread.sleep(500);

    }
}
