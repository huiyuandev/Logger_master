package com.orhanobut.logger.utils;

public abstract class TransformerFactory {
    protected TransformerFactory() {
        throw new RuntimeException("Stub!");
    }

    public static TransformerFactory newInstance() throws TransformerFactoryConfigurationError {
        throw new RuntimeException("Stub!");
    }
    public abstract Transformer newTransformer() throws Exception;

}