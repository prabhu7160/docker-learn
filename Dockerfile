FROM openjdk:11
COPY . /user/src/myjavaapp
WORKDIR /user/src/myjavaapp
RUN javac Add.java
CMD ["java","Add"]
