# Reverse-Integer
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Note:
This problem can also be solved without converting the number to string. It can be calculated by using modulus and division operators.
Ex:-
while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
However, I wanted to do it with string manipulation. 

//If you think the text is not in format, kindly click on Raw button at the top.
