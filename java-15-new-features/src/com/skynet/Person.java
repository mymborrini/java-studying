package com.skynet;

// the goal of sealed classes is to allow individual classes to declare which types may be used as sub-type
public abstract sealed class Person permits Employee, Manager{
}
