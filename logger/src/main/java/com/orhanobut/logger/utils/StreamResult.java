package com.orhanobut.logger.utils;

import ohos.javax.xml.transform.Result;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;

public class StreamResult implements Result {
    public static final String FEATURE = "http://javax.xml.transform.stream.StreamResult/feature";

    public StreamResult(Writer writer) {
        throw new RuntimeException("Stub!");
    }

    public Writer getWriter() {
        throw new RuntimeException("Stub!");
    }

    public void setSystemId(String systemId) {
        throw new RuntimeException("Stub!");
    }

    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
}
