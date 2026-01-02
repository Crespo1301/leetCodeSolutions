# LeetCode Solutions

A collection of my LeetCode problem solutions with explanations and complexity analysis.

## Progress

| # | Problem | Difficulty | Solution | Topics |
|---|---------|------------|----------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [Java](./Java/Two%20Sum.java) | Array, Hash Map |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | [Java](./Java/ValidPalindrome.java) | String, Two Pointers |

## Solutions

### 1. Two Sum

**Problem:** Given an array of integers `nums` and an integer `target`, return the indices of the two numbers that add up to `target`.

**Approach:** Hash Map (One-Pass)

Instead of using a brute-force O(n²) approach with nested loops, this solution uses a hash map to achieve O(n) time complexity.

The key insight is that for each number `nums[i]`, we need to find if `target - nums[i]` exists in the array. By storing previously seen numbers in a hash map, we can check this in O(1) time.

```java
import java.util.HashMap;

public class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {   
        int[] output = new int[2];
        HashMap<Integer, Integer> mainMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int leftOver = target - nums[i];
            if(mainMap.containsKey(leftOver))
            {
                output[0] = i;
                output[1] = mainMap.get(leftOver);
                return output;
            }
            mainMap.put(nums[i], i);
        }
        return output; 
    }
}
```

**Complexity Analysis:**
- **Time:** O(n) — Single pass through the array
- **Space:** O(n) — Hash map stores up to n elements

---

### 125. Valid Palindrome

**Problem:** Given a string `s`, return `true` if it is a palindrome, considering only alphanumeric characters and ignoring case.

**Approach:** Two Pointers

First, normalize the string by converting to lowercase and removing all non-alphanumeric characters. Then compare characters from both ends moving toward the center.

```java
import java.util.HashMap;

public class ValidPalindrome
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i = 0; i < s.length() / 2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}
```

**Complexity Analysis:**
- **Time:** O(n) — Linear pass to clean string, then half-pass to compare
- **Space:** O(n) — New string created after removing non-alphanumeric characters

---

## Repository Structure

```
leetcode-solutions/
├── README.md
├── Java/
│   ├── Two Sum.java
│   └── ValidPalindrome.java
└── ...
```

## Topics Index

| Topic | Problems |
|-------|----------|
| Array | [1](#1-two-sum) |
| Hash Map | [1](#1-two-sum) |
| String | [125](#125-valid-palindrome) |
| Two Pointers | [125](#125-valid-palindrome) |