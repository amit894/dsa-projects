# Time and Space Complexity Analysis

This document provides a detailed summary of the time and space complexity for the algorithms implemented in the DSA Projects repository.

## 1. Arrays

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `BestBuyStocks` | $O(N)$ | $O(1)$ | Single pass tracking minimum price and maximum potential profit. |
| `BinarySearch` | $O(\log N)$ | $O(1)$ | Logarithmic time by repeatedly halving the sorted search interval. |
| `DuplicateHashMap` | $O(N)$ | $O(N)$ | Linear time using a HashMap to track previously seen elements. |
| `maxSubArray` | $O(N)$ | $O(1)$ | Implements Kadane's Algorithm to find the maximum contiguous subarray sum. |
| `MergedIntervals` | $O(N \log N)$ | $O(N)$ | Time dominated by sorting intervals; space for the resulting merged list. |
| `Self_Product` | $O(N)$ | $O(N)$ | Linear time using prefix and suffix product arrays. |
| `TwoSum (Brute Force)` | $O(N^2)$ | $O(1)$ | Quadratic time by checking all possible pairs of elements. |
| `TwoSum (Optimized)` | $O(N)$ | $O(N)$ | Linear time using a HashMap to store and look up the required complement. |

## 2. Linked Lists

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `CyclicLinkedList` | $O(N)$ | $O(1)$ | Uses Floyd's Cycle-Finding Algorithm (Tortoise and Hare). |
| `LinkedList (Traverse)` | $O(N)$ | $O(1)$ | Standard linear traversal from head to tail. |
| `LinkedList (Add)` | $O(N)$ | $O(1)$ | Linear time to traverse to the end of the list for appending. |
| `LinkedList (Remove)` | $O(N)$ | $O(1)$ | Linear search to locate the target node for removal. |
| `LinkedList (Reverse)` | $O(N)$ | $O(1)$ | In-place reversal by updating next pointers in a single pass. |
| `MergeSortedList` | $O(N + M)$ | $O(1)$ | Linear time relative to the sum of both list lengths. |
| `MiddleLinkedList` | $O(N)$ | $O(1)$ | Uses a fast and slow pointer approach to find the center node. |
| `ReverseLinkedList` | $O(N)$ | $O(1)$ | Efficient in-place reversal of the linked list structure. |

## 3. Trees

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `BinaryTree (Traversals)` | $O(N)$ | $O(N)$ | Linear time to visit all nodes; space for the implicit recursion stack. |
| `maxDepthBinaryTree` | $O(N)$ | $O(N)$ | Recursive depth-first traversal; space complexity depends on tree height. |

## 4. Strings

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `Anagram` | $O(K \log K)$ | $O(K)$ | Time dominated by sorting characters of strings of length $K$. |
| `GroupAnagrams` | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | $N$ strings of length $K$; sorting each string and storing in a map. |
| `LongestSubstring` | $O(N)$ | $O(\min(N, M))$ | Sliding window approach to find the longest substring without repeating characters. |
| `LongestPrefix` | $O(N \log N + N \cdot K)$ | $O(K)$ | Time dominated by sorting strings and prefix comparison; $N$ = number of strings, $K$ = length of shortest string. |

## 5. System Design

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `CircuitBreaker` | $O(1)$ | $O(1)$ | Constant time for state transitions and failure counter updates. |
| `DistributedLock` | $O(1)$ | $O(1)$ | Constant time for lock state lookups via resource mapping. |
| `FixedWindowRateLimiter` | $O(1)$ | $O(U)$ | Constant time for request checks; space grows linearly with unique users ($U$). |
| `SlidingWindowRateLimiter`| $O(K)$ | $O(K)$ | Time to purge expired timestamps; space grows with request limit ($K$). |
