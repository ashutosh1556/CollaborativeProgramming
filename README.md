# CollaborativeProgramming

## How to approach a programming question
1. Understand the problem 
2. Ask clarifying questions 
3. Discuss solution before attempting 
4. Design test cases 
5. Develop Solution

## Example:
Write a program to remove a character from String
- Input: String = abcd, Char = a
- Output: bcd

### Clarifying questions:
1. What could be the maximum length of input String?
2. Are we considering special characters as well?
3. What outcome do we expect if string/char is empty or null?
4. If String is  "java". Should we remove all the a's or just first occurrence?
5. Should we consider case sensitivity?
6. What arguments should be passed to method and what is expected return type? 

### Discuss approaches you could think of:

##### Approach 1
- Simply iterate through and print the string, skip the character to be removed.
##### Approach 2
- Use String.replace() method and replace the character with ' ' i.e. space
##### Approach 3
- Iterate through charArray and shift letters to the left side overriding matching character and put spaces at the end of charArray


### Test Cases

Build Method signature to design test cases
```
String removeCharacter(String str, char c){
        // logic
}
```
```
- removeCharFromString("google",'l') - Happy Path
- removeCharFromString("googLe", 'l') - Case Sensitive
- removeCharFromString("google", 'b') - Negative case
- removeCharFromString("", ' ') - Empty & Space
- removeCharFromString(null, ' ') - Null & Space
- removeCharFromString("g", 'g') - Corner Case
- removeCharFromString("google",'o') - Consecutive chars
- removeCharFromString(123, 'g') - Compile Time Error
- removeCharFromString(123.12, 'g') - Compile Time Error
- removeCharFromString(false, 'g') - Compile Time Error
```

### Solution 

- Implement solution
- Mention time and space complexity of the program
- That's all.