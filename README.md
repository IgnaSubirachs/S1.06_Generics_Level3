# Java Generics - Level 3 Exercise 1

## 📄 Description - Exercise Statement

This exercise focuses on working with **Java interfaces, classes, and generics**.

**Task:**
- Create an **interface** `Phone` with a method `call()`.
- Create a **class** `Smartphone` that implements `Phone` and adds a `takePhoto()` method.
- Create a **class** `Generic` with two **generic methods**:
    - One method accepts types limited by the `Phone` interface and calls `call()`.
    - The second method accepts types limited by the `Smartphone` class and calls both `call()` and `takePhoto()`.
- Create a **Main** class that uses a **Smartphone** object and passes it to both generic methods.

---

## 💻 Technologies Used

- Java 17 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse) or any text editor
- Terminal/Command Line

---

## 📋 Requirements

- Java Development Kit (JDK) 17+
- No external libraries are needed

---

## 🛠️ Installation

1. Ensure JDK 17 or higher is installed on your machine.
2. Clone or download the project.
3. Save the following files under a `src/` folder:

```bash
JavaGenerics/
|-- src/
    |-- Phone.java
    |-- Smartphone.java
    |-- Generic.java
    |-- Main.java
```

### Phone.java
```java
public interface Phone {
    void call();
}
```

### Smartphone.java
```java
public class Smartphone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling from the smartphone...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone...");
    }
}
```

### Generic.java
```java
public class Generic {

    public <T extends Phone> void phoneMethod(T phone) {
        phone.call();
    }

    public <T extends Smartphone> void smartphoneMethod(T smartphone) {
        smartphone.call();
        smartphone.takePhoto();
    }
}
```

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generic generic = new Generic();

        generic.phoneMethod(smartphone);
        generic.smartphoneMethod(smartphone);
    }
}
```

---

## ▶️ Execution

1. Open a terminal and navigate to the `src/` directory.
2. Compile all Java files:

```bash
javac *.java
```

3. Execute the `Main` class:

```bash
java Main
```

### Expected Output
```text
Calling from the smartphone...
Calling from the smartphone...
Taking a photo with the smartphone...
```

---

> **Happy Coding!** 🚀

