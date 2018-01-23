FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/reptile-care.jar /reptile-care/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/reptile-care/app.jar"]
