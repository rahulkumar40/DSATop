# Array Level 1 

## 1 Problem: Input and Print Array Elements

### 🔹 Problem Statement

Given an integer `n`, take `n` integers as input, store them in an array, and print all the elements.

---

### 🔹 Intuition

This problem tests the most basic but important skill:

* **Taking dynamic input**
* **Using arrays for storage**
* **Traversing data**

In real-world terms, this is like:

* Storing user form data
* Capturing logs
* Handling API input lists

---

### 🔹 Example

**Input:**

```
n = 5
arr = [10, 20, 30, 40, 50]
```

**Output:**

```
10 20 30 40 50
```

**Explanation:**

* First, we read `n = 5`
* Then take 5 inputs and store in array
* Traverse array from index `0 → n-1`
* Print each element

---

### 🔹 Another Example

**Input:**

```
n = 3
arr = [7, -2, 15]
```

**Output:**

```
7 -2 15
```

---

### 🔹 Edge Cases

* `n = 0` → Output should be empty (no elements)
* Negative numbers → Should still store and print correctly
* Large `n` → Make sure loop handles it efficiently

---

Send next problem 👍

Nice — now we move from storage → **processing data**, which is where real logic starts.

---

## 🔹 Problem: Find Sum of All Elements in an Array

### 🔹 Problem Statement

Given an array of `n` integers, calculate and return the **sum of all elements**.

---

### 🔹 Intuition

This problem is about:

* **Traversal + accumulation**
* Maintaining a running total

In real-world:

* Total expenses calculation
* Sum of marks
* Aggregating API data

Core idea:
👉 Keep adding elements one by one into a variable (`sum`)

---

### 🔹 Example

**Input:**

```id="1abcde"
arr = [2, 4, 6, 8]
```

**Output:**

```id="2bcdef"
20
```

**Explanation:**

* Start with sum = 0
* Add 2 → sum = 2
* Add 4 → sum = 6
* Add 6 → sum = 12
* Add 8 → sum = 20

Final answer = **20**

---

### 🔹 Another Example

**Input:**

```id="3cdefg"
arr = [5, -2, 3]
```

**Output:**

```id="4defgh"
6
```

**Explanation:**
5 + (-2) + 3 = **6**

---

### 🔹 Edge Cases

* Empty array → sum = 0
* All negative numbers → sum should still work
* Large values → watch for integer overflow (in some languages)

---

### 🔹 Developer Insight

This is the base for:

* Prefix sum problems
* Sliding window
* Dynamic programming

