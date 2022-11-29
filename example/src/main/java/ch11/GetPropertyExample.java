package ch11;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        System.out.println("OS 이름: " + System.getProperty("os.name"));
        System.out.println("사용자 이름: " + System.getProperty("user.name"));
        System.out.println("사용자 경로: " + System.getProperty("user.home"));
        System.out.println("Java 버전: " + System.getProperty("java.version"));
        System.out.println("Java 경로: " + System.getProperty("java.home"));

        System.out.println("----------------------");
        System.out.println("[key] value");
        System.out.println("----------------------");

        Properties props = System.getProperties();
        Set<Object> keys = props.keySet();
        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println("[ " + key + " ]  " + value);
        }
    }
}
