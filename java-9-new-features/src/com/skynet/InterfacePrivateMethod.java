package com.skynet;

// private method can be used to split default moethod
public interface InterfacePrivateMethod {

    private static String staticPrivate(){
        return "static private";
    }

    private String instancePrivate(){
        return "instance private";
    }

    default void check(){
        String result = staticPrivate();
        InterfacePrivateMethod pvt = new InterfacePrivateMethod() {
            @Override
            public void check() {

            }
        };

        result = pvt.instancePrivate();
        System.out.println(result);
    }

}
