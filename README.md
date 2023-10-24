# SOLID Principles with Java

### SRP - Single Responsibility Principle

> A class should have only one reason to change

A class or module should be designed to have a clear and well-defined responsibility. Each class or module is responsible for only one specific aspect or functionality. This makes it easier to understand, modify, and extend your code because changes to one aspect will not affect unrelated parts of the system.

---

### OCP - Open Closed Principle

> Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

A code should allow for new functionality or features to be added (open for extension) without altering the existing code (closed for modification). It promotes code modularity and reusability.

---

### LSP - Liskov Substitution Principle

> Objects of a superclass should be able to be replaced with objects of a subclass without affecting the correctness of the program.

If a class is a subclass of another class (inheritance), It should be possible to use a subclass as a replacement for its superclass without causing any unforeseen issues or violating the predefined agreements of the superclass. This principle is essential for ensuring that inheritance hierarchies are designed in a way that maintains consistency and allows for proper polymorphic behavior.

---

### ISP - Interface Segregation Principle

> Clients should not be forced to depend upon interfaces that they do not use.

It suggests that classes or modules should not be required to implement methods they do not need. Instead, interfaces should be designed to match the specific needs of the classes that implement them.

---

### DIP - Dependency Inversion Principle

> High-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details. Details should depend on abstractions

- High-level modules (which often contain business logic or application-level code) should not rely directly on low-level modules (which typically involve specific implementations or details). Instead, both should depend on abstract interfaces or classes.

- Abstract interfaces or classes should not depend on the specific details or implementations, but the implementations should depend on the abstract interfaces or classes.
