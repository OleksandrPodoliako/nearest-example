package io.github.oleksandrpodoliako;

import io.github.oleksandrpodoliako.nearest.apiclient.IRestClient;

import java.lang.reflect.Type;

public class PostClient implements IRestClient {
    @Override
    public <T> Type getClassType() {
        return Post.class;
    }

    @Override
    public <T> Type getClassArrayType() {
        return Post[].class;
    }
}
