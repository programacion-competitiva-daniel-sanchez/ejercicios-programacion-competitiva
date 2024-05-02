# https://codeforces.com/problemset/problem/4/A

# Time complexity: O(1) Constant runtime
# Space complexity: O(1) Constant space
n = int(input())
if n % 2 == 0 and n != 2:
    print('YES')
else:
    print('NO')
