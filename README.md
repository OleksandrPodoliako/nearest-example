# NeaRest example

## What is NeaRest example?
NeaRest example is a project-illustration how to use NeaRest
## How to use?
* Add NeaRest to the project
```
<dependency>
    <groupId>io.github.oleksandrpodoliako</groupId>
    <artifactId>nearest</artifactId>
    <version>1.0.1</version>
</dependency>
```
* Create POJO model

```
@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    public int userId;
    public int id;
    public String title;
    public String body;

    public Post() {
    }
}
```

* Create Client class and add interface IRestClient
* Implement two methods from interface IRestClient to return POJO model and POJO models array


```
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
```
* Now you can instantiate Client class, which has all CRUD operations implemented

```
public class Main {
    private static final String URL = "https://jsonplaceholder.typicode.com/posts/1";

    public static void main(String[] args) {

        RequestWrapper<Post> requestWrapper = RequestWrapper.<Post>builder().build();

        ResponseWrapper<Post> responseWrapper = new PostClient().getEntity(URL, requestWrapper);
        
    }
}
```