# Build Stage
FROM 218894879100.dkr.ecr.us-east-1.amazonaws.com/openjdk-11-jdk-slim:latest
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY build/native/nativeCompile .
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["exec ./micronaut-viafoura-demo"]
