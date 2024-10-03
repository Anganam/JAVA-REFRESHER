
# Create if and if/else and ternary construct


## 3.1 Understand the basic form of if and if/else
**EXAMPLES**
- If one an expression is true perform the first statement, else perform the second statemen
````
if(<boolean-expression>)
    <execute statement>
else
    <<execute statement>>
````



## 3.2 Using braces with if/else. Effect of "else if"

-[faulty example] If  an expression is true it will print "Hello" and "How are you?". If the statement is false it won't print "Hello" which is expected however it will still print "How are you?" which would not be what was intended 
````
if(<boolean-expression>)
    System.out.println("Hello");
    System.out.println("How are you?");    
````

***the if condition above will only applies to the first statement that follows it***

- [faulty example] if an expression is true it will print "Hello" and "How are you?". If it is false we intend the output to say "goodbye", however,it will cause a compilation error 
because the compiler ends if condition after the first statment and won't know what to do with the else statement

````
if(<boolean-expression>)
    System.out.println("Hello");
    System.out.println("How are you?");    
else
     System.out.println("goodbye");
````
***Dangling else example above***

- [fixed] to resolve this we had curly braces

````
if(<boolean-expression>){
    System.out.println("Hello");
    System.out.println("How are you?"); 
} 
else{
     System.out.println("goodbye");
     System.out.println("goodbye");
}
````

## 3.3 Understanding the if / else if / else structure


## 3.4 Using the ternary operator 