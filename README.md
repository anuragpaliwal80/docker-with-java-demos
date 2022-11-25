# docker-with-java-demos

These are example projects that correlate with my blog post [here](https://adotpalindrome.wordpress.com/2020/02/25/three-ways-to-create-docker-images-for-java/).

## docker-multi-stage-build-demo

To build the image: 

```shell
$ cd docker-multi-stage-build-demo
$ docker build -t anna/docker-multi-stage-build-demo:1.0-SNAPSHOT .
```

## docker-normal-build-demo

To build the image:

```shell
$ cd docker-normal-build-demo
$ docker build -t anna/docker-normal-build-demo:1.0-SNAPSHOT .
```

## docker-package-only-build-demo

First, package the source code:

```shell
$ cd docker-package-only-build-demo
$ mvn clean package
```

Then, build the image:
```shell
$ docker build -t anna/docker-normal-build-demo:1.0-SNAPSHOT .
```

# Local try outs
# Build
docker build --tag apaliwal80/java-chaos:third .
# If you are using springboat and want to start the server locally
docker run  -p 8080:8080 apaliwal80/java-chaos:third
# if you want to run it as simple app then
docker run apaliwal80/java-chaos:third

# You can push the image as
docker push apaliwal80/java-chaos:third
