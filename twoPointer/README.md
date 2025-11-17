
What is the Two Pointers Pattern?
The Two Pointers technique involves using two indices (pointers) to iterate over a data structure
(usually an array or a string) to solve problems efficiently by avoiding nested loops.
When to Use Two Pointers?
When you need to find pairs, triplets, or subarrays meeting certain conditions.
When the data is sorted or can be sorted.
When you want to optimize brute force solutions that use nested loops (O(n2)) to linear or
near-linear time (O(n)).
How It Works?
You maintain two pointers that move through the data structure according to certain rules:
One pointer starts at the beginning, the other at the end (common in problems like
finding pairs with a sum).
Or, both pointers start at the beginning, with one moving faster than the other (useful for
sliding window problems).
Move pointers towards each other or forward depending on the problem condition.
Typical Approach:
Initialize two pointers, left and right.
Check condition based on the current pointers.
Move pointers accordingly:
If condition not met, move left or right pointer to try to satisfy the condition.
If condition met, record the answer or move pointers to find more solutions.
Repeat until pointers cross or reach the end.


✅ Palindrome Check for String (Java)
A palindrome is a word, phrase, number, or sequence of characters that reads the same backward as forward. Examples include the words "level" and "madam," the phrase "A man, a plan, a canal – Panama," and the number \(121\). 
Palindromes can be exact character-by-character or can ignore spaces and punctuation, as seen in phrases like "Never odd or even". Types of palindromes Words: Single words that are spelled the same forwards and backward, such as rotor, civic, and racecar.Phrases: Sentences that read the same backward, with punctuation and spacing often ignored. Examples include "Madam, in Eden, I'm Adam" and "Step on no pets".Numbers: Numbers that are the same when their digits are reversed, such as \(11\), \(121\), and \(2002\).Other sequences
📌 Example

Input: "madam"
Output: Palindrome

Input: "hello"
Output: Not Palindrome

Input: 121
Output: Palindrome