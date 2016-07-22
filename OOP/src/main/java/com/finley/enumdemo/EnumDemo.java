package com.finley.enumdemo;

/**
 * Created by finley on 16/7/22.
 */
import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Created by finley on 16/7/22.
 */

/**
 * 所有的枚举类型都继承Enum,所以Color不能继承类,但是可以实现接口
 */
enum Color {
    RED("红色"), YELLOW("黄色"), BLACK("黑色");
    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


enum Light {
    RED("红色"), YELLOW("黄色"), BLACK("黑色");

    private String color;

    Light(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Light{" + "color='" + color + '\'' + '}';
    }
}


public class EnumDemo {

    public static void main(String[] args) {

        //Ordinary Traverse
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println("ordinal:" + color.ordinal() + " name :" + color.name());
        }

        // Traverse EnumSet
        EnumSet<Light> lightEnumSet = EnumSet.allOf(Light.class);
        for (Light light : lightEnumSet) {
            System.out.println(light);
        }

        // Traverse EnumMap
        EnumMap<Light, String> enumMap = new EnumMap<Light, String>(Light.class);
        enumMap.put(Light.RED, "RED");
        enumMap.put(Light.YELLOW, "YELLOW");
        enumMap.put(Light.BLACK, "BLACK");
        for (Light light : enumMap.keySet()) {
            System.out.println("key: " + light + " value: " + enumMap.get(light));
        }
    }
}

