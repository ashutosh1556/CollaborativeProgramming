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

### Discuss approaches you could think of:

##### Approach 1

- We could use replace() method from String class to replace the input char with ' ' i.e. empty
##### Approach 2
- We can iterate through the string and store all others characters in new string which are required and skip the ones which needs removal.

### Test Cases

Build Method signature to design test cases
```
String removeCharacter(String str, char c){
        // logic
}
```
```
- removeCharacter('a') 	        // Compile error
- removeCharacter("rjawa")	// Valid string
- removeCharacter(null)		// Null check
- removeCharacter("aaa") 	// repetetive 
- removeCharacter("")		// Empty
- removeCharacter("@#$%^&")	// Special Characters
- removeCharacter("1234")       // Valid String
- removeCharacter(123)		// Integer
- removeCharacter(true)		// Boolean
- removeCharacter(" ")		// Space
- removeCharacter("Aa")       	// Case sensitive
```

### Solution 

- Implement solution
- Write time and space complexity of the program
- That's all.