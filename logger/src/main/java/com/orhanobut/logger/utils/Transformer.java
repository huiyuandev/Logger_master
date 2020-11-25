package com.orhanobut.logger.utils;

import ohos.javax.xml.transform.Result;

public abstract class Transformer {
    protected Transformer() {
        throw new RuntimeException("Stub!");
    }

    public abstract void transform(Source var1, Result var2) throws Exception;

    public abstract void setOutputProperty(String var1, String var2) throws IllegalArgumentException;
}