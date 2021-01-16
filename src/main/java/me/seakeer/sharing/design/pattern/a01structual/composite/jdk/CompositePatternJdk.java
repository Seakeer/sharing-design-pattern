package me.seakeer.sharing.design.pattern.a01structual.composite.jdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * CompositePatternJdk;
 *
 * @author Seakeer;
 * @date 2020/5/12;
 * @see java.util.Map                         --> IAComponent 1 抽象构件;
 * @see java.util.HashMap                     --> Composite   2 容器构件;
 * @see java.util.Collections.UnmodifiableMap --> Leaf        3 叶子构件;
 */
public class CompositePatternJdk {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", null);
        System.out.println(map.getOrDefault("Key", "Value"));
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println(unmodifiableMap.get("Key"));
        //unmodifiableMap.put("Key", "Value");
    }
}
