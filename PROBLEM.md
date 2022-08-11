## Problem Statement: Find the largest positive number ‘L’ less than a given positive number ‘N’ which should not contain a given digit ‘D’. ##

**Given a positive number ‘N’, find the largest positive number ‘L’ less than a given positive number ‘N’ which should not contain a given digit ‘D’ using Conditional statements and loops **

**This exercise contains a class named LargestNumber with the following methods:**

    +inputAcceptor() : void
        -Should accept inputs from the console in format N D as String
        -Should call inputValidator method with given input
------------------------------------------------------
    +inputValidator(String) : void
        -Should accept input as String and validates the input 
        -Should print error message "Give proper input not negative values" if number(N) or digit(D) is negative
        -Should print error message "Give proper input not digit greater than 9" if digit(D) is greater than 9
        -Should print error message "Give proper input not number(N) equals to zero" if number(N) is zero
        -Should call method findLargestNumber method
------------------------------------------------------
    +findLargestNumber(int,int) : int
        -Should get N D as input and return L as int
        -Should find the largest positive number ‘L’ less than a given positive number ‘N’ which should not contain a given digit ‘D’
        -Should return if L is found otherwise return -1
------------------------------------------------------
    +outputPrinter(Object) : void
        -Should accept any type as input and print it

## Example
    Sample Input:
    122 2
    
    Expected Output:   
    119
--------------------------------------------------------
    Sample Input:
    0 4
    
    Expected Output:
    Give proper input not number(N) equals to zero
--------------------------------------------------------
    Sample Input:
    -20 3
    
    Expected Output:
    Give proper input not negative values
--------------------------------------------------------
    Sample Input:
    1914 14
    
    Expected Output:
    Give proper input not digit greater than 9
--------------------------------------------------------
    Sample Input:
    100 2
    
    Expected Output:
    100
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
