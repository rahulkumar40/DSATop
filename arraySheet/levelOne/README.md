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

## 🔹2 Problem: Find Sum of All Elements in an Array

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

---

## 🔹 Problem: Find Average of Array Elements

### 🔹 Problem Statement

Given an array of `n` integers, calculate the **average (mean)** of all elements.

---

### 🔹 Intuition

Average is just an extension of sum:

👉 **Average = Total Sum / Number of Elements**

So the flow is:

1. Traverse array → find sum
2. Divide by `n`

Real-world usage:

* Average marks of students
* Average sales per day
* Performance metrics

---

### 🔹 Example

**Input:**

```id="avg1"
arr = [10, 20, 30, 40]
```

**Output:**

```id="avg2"
25
```

**Explanation:**

* Sum = 10 + 20 + 30 + 40 = 100
* Number of elements = 4
* Average = 100 / 4 = **25**

---

### 🔹 Another Example

**Input:**

```id="avg3"
arr = [5, 7, 8]
```

**Output:**

```id="avg4"
6.67
```

**Explanation:**

* Sum = 20
* n = 3
* Average = 20 / 3 = **6.67**

---

### 🔹 Edge Cases

* Empty array (`n = 0`) → avoid division by zero (handle separately)
* Negative values → average still valid
* Integer division issue → in some languages, result may truncate (use float/double)

---

### 🔹 Developer Insight

* Always think about **data type** here (int vs float)
* Many bugs happen because of **integer division**

Example mistake:

```
avg = sum / n   // gives wrong result if both are integers
```

Better:

```
avg = (float) sum / n
```

---
Good — this is one of the most important foundational patterns in arrays.

---

## 🔹 Problem: Find Maximum Element in an Array

### 🔹 Problem Statement

Given an array of `n` integers, find and return the **maximum (largest) element** present in the array.

---

### 🔹 Intuition

This problem is about:

* **Traversal + comparison**
* Keeping track of the “best so far”

Core idea:
👉 Assume the first element is maximum, then compare it with every other element and update when needed.

Real-world usage:

* Highest salary in a company
* Maximum temperature recorded
* Peak traffic on a server

---

### 🔹 Example

**Input:**

```id="max1"
arr = [3, 7, 2, 9, 5]
```

**Output:**

```id="max2"
9
```

**Explanation:**

* Start with max = 3
* Compare with 7 → update max = 7
* Compare with 2 → ignore
* Compare with 9 → update max = 9
* Compare with 5 → ignore

Final answer = **9**

---

### 🔹 Another Example

**Input:**

```id="max3"
arr = [-10, -3, -50, -1]
```

**Output:**

```id="max4"
-1
```

**Explanation:**
Even though all values are negative, **-1 is the largest**.

---

### 🔹 Edge Cases

* Empty array → return error / null
* Single element → return that element
* All elements equal → return that value
* Negative numbers → must still work correctly

---

### 🔹 Developer Insight ⚡

Common mistake:

```id="bug1"
max = 0   // ❌ wrong
```

Why wrong?

* If all elements are negative → result becomes incorrect

Correct approach:

```id="fix1"
max = arr[0]
```

---

This pattern is used everywhere:

* Finding max profit
* Sliding window max
* Greedy algorithms

---
