
## Approach

The solution uses a stack to store the indices of parentheses.

- Initialize the stack with `-1` to track the starting position.
- Push the index of every opening bracket `(`.
- For every closing bracket `)`, remove the last opening bracket index.
- If the stack becomes empty, update the starting position.
- Otherwise, calculate the length of the current valid substring and update the maximum length.

## Algorithm

1. Create a stack and push `-1`.
2. Traverse the string from left to right.
3. If the current character is `(`, push its index.
4. If the current character is `)`:
   - Pop the stack.
   - If the stack is empty, push the current index.
   - Otherwise, calculate the valid substring length.
5. Return the maximum length.

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n)

## Language Used

Java
