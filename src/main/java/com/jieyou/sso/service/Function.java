package com.jieyou.sso.service;

public interface Function<T,E>{

    public T callback(E e);
}
