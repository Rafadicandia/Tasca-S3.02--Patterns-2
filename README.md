
This project contains solutions to programming exercises focused on implementing fundamental software design patterns in Java.

---

## 📄 Exercise Descriptions

### Level 1: Builder
Develop a pizza order management system using the **Builder design pattern** in Java. The system must allow for the creation of different types of pizzas with distinct size, dough, and ingredient configurations.

* Define a `Pizza` class with the following attributes: **size**, **dough** (mass type), and **toppings** (ingredients).
* Create a `PizzaBuilder` interface with the necessary methods to configure the size, dough, and ingredients of a pizza.
* Implement one or more classes that act as **Concrete Builders** for different types of pizzas (e.g., Hawaiian, Vegetarian).
* Develop a `MestrePizzer` (Director) class that receives a `PizzaBuilder` and allows pizzas to be constructed in a specific, guided manner.
* The main program (`Main`) must demonstrate the construction of pizzas with different configurations.

---

### Level 2: Observer
Design a system where a **Stock Broker (Observable)** notifies various **Stock Agencies (Observers)** about changes when the stock market rises or falls.

* The Observable object must maintain references to its Observers.
* The logic must be implemented for the Observable to **notify** all its Observers when its state changes.
* Each Observer must have an **update** method to process the notification.

---

### Level 3: Callback
Simulate a **Payment Gateway** that receives an object encapsulating the payment method to be executed: credit card, PayPal, or bank account debit.

* The Gateway will invoke the payment **without knowing the specific form** (polymorphism / interface).
* Control must be returned to the **originating class** (the class that invoked the gateway) once the payment is processed, simulating a **Callback** mechanism.
* The class invoking the payment gateway will be a `ShoeStore`.

***

## 💻 Technologies Used
| Technology | Version            | Description |
| :--- |:-------------------| :--- |
| **Java** | **(24.0.1)**       | Language and environment for development. |
| **Gradle** | **(Gradle 9.2.0)** | Build automation and project management tool. |

## 📋 Requirements
* Operating System: Windows/macOS/Linux.
* Java Development Kit (JDK): Recommended version **(openjdk-24)**.
* Gradle: Installed and configured in the system PATH.
* Integrated Development Environment (IDE): (e.g., IntelliJ IDEA, VS Code) with Gradle support.

## 🛠️ Installation
1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/Rafadicandia/Tasca-S3.02--Patterns-2.git
    ```
2.  **IDE Configuration:**
    Open the folder as a Gradle project in your IDE. The IDE should automatically synchronize the project and download dependencies.

3.  **Build the Project:**
    To ensure all dependencies are resolved and the project compiles correctly, run the following command in the terminal from the project root:
    ```bash
    ./gradlew build
    ```

## ▶️ Execution
Execute the main class (`Main`) for each level to see the design patterns demonstrated.

---

## 🤝 Contributions
Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.