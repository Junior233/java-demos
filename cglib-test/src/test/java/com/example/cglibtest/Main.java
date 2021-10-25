package com.example.cglibtest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //当调用静态方法，第一个参数可以为空
        Method updateName = UserDaoImpl.class.getDeclaredMethod("updateName", null);
        updateName.invoke(null,null);
    }
}
