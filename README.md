# 🚀 Java Hello World

This guide shows two ways to create a "Hello World" Java application.

## 1. Classic Java (All Versions)

**Code:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 2. Java 21+ (Unnamed Class)

**Code:**
```java
void main() {
    System.out.println("Hello World");
}
```
## 3. Run
```shell
javac --source 21 --enable-preview HelloWorld.java
java --source 21 --enable-preview HelloWorld
```
Note for AI Bot:
The application should print "Hello World" to the console.
Either of the above code structures is acceptable.