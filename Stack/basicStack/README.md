# Stack Programs in Java

This project contains basic **Stack operations** implemented using Java.
It demonstrates how a stack works and how to perform common operations like **push, pop, peek, reverse, copy, and display**.

---

## What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO principle**:

> **LIFO = Last In, First Out**

This means:

* The last element inserted into the stack is the first one to be removed.

### Real-Life Example

* Stack of plates
* Undo/Redo in editors
* Browser back button

---

## Basic Stack Operations

| Operation   | Description                       |
| ----------- | --------------------------------- |
| `push()`    | Add element to top of stack       |
| `pop()`     | Remove top element                |
| `peek()`    | View top element without removing |
| `isEmpty()` | Check if stack is empty           |
| `size()`    | Get number of elements            |

---

## Programs Included

### 1. CreateStack.java

**Purpose:**
Demonstrates basic stack creation and operations.

**Concepts Covered:**

* Creating a stack
* push()
* pop()
* peek()
* size()
* isEmpty()

**Flow:**

1. Create a stack
2. Add elements
3. Remove top element
4. Check top element
5. Print size
6. Remove elements until one remains

---

### 2. DisplayStack.java

**Purpose:**
Shows how to display stack elements.

**Two Methods:**

1. Direct printing using `System.out.println(stack)`
2. Using `pop()` in a loop

**Important Note:**

* When using `pop()` to print, the stack becomes empty.

---

### 3. ReverseStack.java

**Purpose:**
Reverse the order of elements in a stack.

**Logic:**

1. Pop elements from original stack
2. Push them into a new stack
3. The new stack becomes reversed

**Example:**

Original stack:

```
[1, 2, 3, 4, 5]
```

After reversing:

```
[5, 4, 3, 2, 1]
```

---

### 4. CopyStackInAnother.java

**Purpose:**
Copy elements from one stack to another while maintaining the same order.

**Logic:**

1. Move elements from original stack to temporary stack
2. Move elements from temporary stack to final stack
3. Order is preserved

**Example:**

Original:

```
[1, 2, 3, 4, 5, 6]
```

Final Copy:

```
[1, 2, 3, 4, 5, 6]
```

---

## Folder Structure

```
basicStack/
│
├── CreateStack.java
├── DisplayStack.java
├── ReverseStack.java
└── CopyStackInAnother.java
```

---

## Key Learning Points

* Stack follows **LIFO principle**
* `pop()` removes elements permanently
* Using a **temporary stack** helps in:

  * Reversing
  * Copying
* Stack operations are commonly used in:

  * Expression evaluation
  * Backtracking
  * Recursion
  * Undo systems

---

## How to Run

1. Compile the files:

```
javac basicStack/*.java
```

2. Run any class:

```
java basicStack.CreateStack
```

---

## Output Example

```
Original Stack ::  [1, 2, 3, 4, 5]
Reversed Stack ::  [5, 4, 3, 2, 1]
```

---

## Future Improvements

You can extend this project by adding:

* Stack using array
* Stack using linked list
* Stack using recursion
* Balanced parentheses checker
* Expression evaluator

---



