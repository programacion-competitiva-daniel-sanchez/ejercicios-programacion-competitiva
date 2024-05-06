# https://codeforces.com/problemset/problem/1680/B

# Time complexity: O(N*M)
# Space complexity: O(1) Constant time complexity
def solve(n, m, matrix):
    min_point = None
    min_row = n
    min_column = m
    for i, row in enumerate(matrix):
        for j, cell in enumerate(row):
            if cell == 'R':
                if not min_point:
                    min_point = (i, j)
                min_row = min(min_row, i)
                min_column = min(min_column, j)
                if min_point != (min_row, min_column):
                    return 'NO'
    return 'YES'


t = int(input())
for _ in range(t):
    n, m = [int(e) for e in input().split()]
    matrix = []
    for _ in range(n):
        matrix.append(input())
    print(solve(n, m, matrix))
