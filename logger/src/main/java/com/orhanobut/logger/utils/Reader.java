package com.orhanobut.logger.utils;

import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;

public abstract class Reader implements Readable, Closeable {

    public int read(CharBuffer target) throws IOException {
        throw new RuntimeException("Stub!");
    }
    public abstract void close() throws IOException;
}