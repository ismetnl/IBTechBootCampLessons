package com.ibtech.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MyDataReflect {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> clazz = Class.forName("com.ibtech.source.MyData");
		Constructor<?> constructor = clazz.getConstructor();
		Object object = constructor.newInstance();
		
		
	}
}
