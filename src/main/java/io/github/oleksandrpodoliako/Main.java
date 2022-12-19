package io.github.oleksandrpodoliako;

import io.github.oleksandrpodoliako.nearest.apiwrappers.RequestWrapper;
import io.github.oleksandrpodoliako.nearest.apiwrappers.ResponseWrapper;
import io.github.oleksandrpodoliako.nearest.enums.APIMethod;

public class Main {

    private static final String URL = "https://jsonplaceholder.typicode.com/posts/";

    public static void main(String[] args) {

        RequestWrapper<Post> requestWrapper = RequestWrapper.<Post>builder()
                .url(URL)
                .apiMethod(APIMethod.GET_ARRAY)
                .build();

        ResponseWrapper<Post> responseWrapper = new PostClient().send(requestWrapper);
    }
}
