# Time and Space Complexity Analysis

This document provides a summary of the time and space complexity for the algorithms implemented in the DSA Projects repository.

## 1. Arrays

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `BestBuyStocks` | $O(N)$ | $O(1)$ | Single pass to find the min price and max profit. |
| `BinarySearch` | $O(\log N)$ | $O(1)$ | Divides the search space by half each iteration. |
| `DuplicateHashMap` | $O(N)$ | $O(N)$ | Uses a HashMap to store and check for duplicates. |
| `maxSubArray` | $O(N)$ | $O(1)$ | Implements Kadane's Algorithm. |
| `MergedIntervals` | $O(N \log N)$ | $O(N)$ | Requires sorting the intervals first. |
| `Self_Product` | $O(N)$ | $O(N)$ | Conceptual implementation of product arrays. |
| `TwoSum (Brute Force)` | $O(N^2)$ | $O(1)$ | Nested loop to check all pairs. |
| `TwoSum (Optimized)` | $O(N)$ | $O(N)$ | Uses a HashMap to store the complement. |

## 2. Linked Lists

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `CyclicLinkedList` | $O(N)$ | $O(1)$ | Uses Floyd's Cycle-Finding Algorithm (Tortoise and Hare). |
| `LinkedList (Traverse)` | $O(N)$ | $O(1)$ | Standard linear traversal. |
| `LinkedList (Add)` | $O(N)$ | $O(1)$ | Traverses to the end of the list to append. |
| `LinkedList (Remove)` | $O(N)$ | $O(1)$ | Linear search for the node to remove. |
| `LinkedList (Reverse)` | $O(N)$ | $O(1)$ | Reverses pointers in a single pass. |
| `MergeSortedList` | $O(N + M)$ | $O(1)$ | Merges two sorted lists into one. |
| `MiddleLinkedList` | $O(N)$ | $O(1)$ | Uses fast and slow pointers to find the center. |
| `ReverseLinkedList` | $O(N)$ | $O(1)$ | In-place reversal of the list. |

## 3. Trees

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `BinaryTree (Traversals)` | $O(N)$ | $O(N)$ | In-order, Pre-order, and Post-order; space for recursion stack. |
| `maxDepthBinaryTree` | $O(N)$ | $O(N)$ | Recursive depth traversal; space for recursion stack. |

## 4. Strings

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `Anagram` | $O(N \log N)$ | $O(N)$ | Sorting both strings and comparing character by character. |

## 5. System Design

| Algorithm | Time Complexity | Space Complexity | Notes |
| :--- | :--- | :--- | :--- |
| `CircuitBreaker` | $O(1)$ | $O(1)$ | Direct state transitions and counter updates. |
| `DistributedLock` | $O(1)$ | $O(1)$ | Based on map lookups for resource locks. |
| `FixedWindowRateLimiter` | $O(1)$ | $O(U)$ | $U$ = number of unique users tracked in the map. |
| `SlidingWindowRateLimiter`| $O(K)$ | $O(K)$ | $K$ = maximum requests allowed in the window (cleaning old timestamps). |
