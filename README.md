# PyramidPath
Input is a triangle (which is a binary tree) input below where you need to find the *maximum sum of
the numbers per the given rules* below:
1. You will start from the top and move downwards to an adjacent number as in below.
2. You are only allowed to walk downwards and diagonally.
3. You should walk over the numbers as evens and odds subsequently. Suppose that you are on an even
number the next number you walk must be odd, or if you are stepping over an odd number the next
number must be even. In other words, the final path would be like
Odd -> even -> odd -> even …
4. You must reach to the bottom of the pyramid.
Your goal is to find the maximum sum if you walk the path. Assume that there is at least 1 valid path to
the bottom. If there are multiple paths giving the same sum, you can choose any of them.

Sample Input:
1
8 9
1 5 9
4 5 2 3

Output:
Max sum: 16
Path: 1, 8, 5, 2
