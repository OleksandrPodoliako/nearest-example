package io.github.oleksandrpodoliako;

import io.github.oleksandrpodoliako.nearest.apiwrappers.RequestWrapper;
import io.github.oleksandrpodoliako.nearest.apiwrappers.ResponseWrapper;

public class Main {

    private static final String URL = "https://jsonplaceholder.typicode.com/posts/1";

    public static void main(String[] args) {

        RequestWrapper<Post> requestWrapper = RequestWrapper.<Post>builder().build();

        ResponseWrapper<Post> responseWrapper = new PostClient().getEntity(URL, requestWrapper);

    }
}
