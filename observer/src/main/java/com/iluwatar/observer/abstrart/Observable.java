package com.iluwatar.observer.abstrart;

import com.iluwatar.observer.WeatherType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author xulongchao
 * @cdate 2019/4/23
 * @email master@xlchao.com
 */
public  class Observable implements IObservable<WeatherType> {


    protected List<Race> raceList;

    protected WeatherType weatherType;

    protected List<Consumer<WeatherType>> consumerList;

    public Observable() {
        this.raceList = new ArrayList<>();
        consumerList =new ArrayList<>();
        weatherType=WeatherType.SUNNY;
    }


    @Override
    public void addRace(Race race) {
        raceList.add(race);
        consumerList.add(b->race.update(this,b));
    }

    @Override
    public void addFunction(Consumer< WeatherType> function) {
        consumerList.add(function);
    }


    @Override
    public void removeRace(Race race) {
        raceList.remove(race);
    }

    @Override
    public void removeFunction(Consumer<WeatherType> biConsumer) {
        consumerList.remove(biConsumer);
    }


    @Override
    public void notifyAllRace(WeatherType weatherType) {
        raceList.stream().forEach(weatherType::reUpdate);
    }

    @Override
    public void funtionNotify(WeatherType weatherType) {
        consumerList.forEach(weatherTypeConsumer -> weatherTypeConsumer.accept(weatherType));
    }



}
