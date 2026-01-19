# LeetCode Solutions

A collection of my LeetCode problem solutions with explanations and complexity analysis.

## Progress

| # | Problem | Difficulty | Solution | Topics |
|---|---------|------------|----------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [Java](./Java/Two%20Sum.java) | Array, Hash Map |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [Java](./Java/ValidParentheses.java) | String, Stack |
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | [Java](./Java/MaxProfit.java) | Array, Sliding Window |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | [Java](./Java/ValidPalindrome.java) | String, Two Pointers |
| 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | [Java](./Java/ContainsDuplicate.java) | Array, Hash Set |

## Solution Summaries

| # | Problem | Approach | Time | Space |
|---|---------|----------|------|-------|
| 1 | Two Sum | Hash Map for O(1) lookup of complement | O(n) | O(n) |
| 20 | Valid Parentheses | Stack for LIFO bracket matching | O(n) | O(n) |
| 121 | Best Time to Buy and Sell Stock | Track min price, calculate profit at each step | O(n) | O(1) |
| 125 | Valid Palindrome | Two pointers comparing from both ends | O(n) | O(n) |
| 217 | Contains Duplicate | HashSet for O(1) duplicate detection | O(n) | O(n) |

## Topics Index

| Topic | Problems |
|-------|----------|
| Array | 1, 121, 217 |
| Hash Map | 1 |
| Hash Set | 217 |
| Sliding Window | 121 |
| Stack | 20 |
| String | 20, 125 |
| Two Pointers | 125 |

## Repository Structure
```
leetcode-solutions/
├── README.md
└── Java/
    ├── Two Sum.java
    ├── ValidParentheses.java
    ├── MaxProfit.java
    ├── ValidPalindrome.java
    └── ContainsDuplicate.java
```