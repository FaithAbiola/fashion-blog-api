FROM openjdk:17

VOLUME /tmp

COPY target/fashionBlogApi-0.0.1-SNAPSHOT.jar fashion-blog-api.jar

EXPOSE 7785

ENTRYPOINT ["java", "-jar", "fashion-blog-api.jar"]