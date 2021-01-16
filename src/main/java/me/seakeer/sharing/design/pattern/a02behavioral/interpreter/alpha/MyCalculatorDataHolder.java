package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MyCalculatorDataHolder;
 *
 * @author Seakeer;
 * @date 2020-12-23;
 */
public class MyCalculatorDataHolder {

    private MyCalculatorDataHolder() {
    }

    private static final MyCalculatorDataHolder INSTANCE = new MyCalculatorDataHolder();

    public static MyCalculatorDataHolder getInstance() {
        return INSTANCE;
    }

    private final Map<String, Integer> dataMap = new HashMap<>();

    private final List<String> dataList = new ArrayList<>();

    public Integer getData(String key) {
        return dataMap.get(key);
    }

    public MyCalculatorDataHolder put(String key, Integer data) {
        dataMap.put(key, data);
        return this;
    }

    public MyCalculatorDataHolder put(int index, String data) {
        dataList.add(index, data);
        return this;
    }

    public MyCalculatorDataHolder put(String data) {
        dataList.add(data);
        return this;
    }

    public String getData(int index) {
        return dataList.get(index);
    }

    public int dataSize() {
        return dataList.size();
    }

    public void clear() {
        dataList.clear();
    }
}
