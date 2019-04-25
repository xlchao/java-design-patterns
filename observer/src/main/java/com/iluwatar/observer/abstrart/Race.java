package com.iluwatar.observer.abstrart;

/**
 * @author xulongchao
 * @cdate 2019/4/23
 * @email master@xlchao.com
 */
@FunctionalInterface
public interface Race<T,O> {

    void update(T t,O o);
}
