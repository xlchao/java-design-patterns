package com.iluwatar.observer.abstrart;

import com.iluwatar.observer.WeatherType;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author xulongchao
 * @cdate 2019/4/23
 * @email master@xlchao.com
 */
public interface IObservable<T> {

    void notifyAllRace(T t);

    void funtionNotify(T t);

    void addRace(Race race);

    void addFunction(Consumer<WeatherType> biConsumer);

    void removeRace(Race race);


    void removeFunction(Consumer<WeatherType> biConsumer);

}
