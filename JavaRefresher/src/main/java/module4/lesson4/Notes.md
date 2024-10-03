# Use a switch statement

## Using general form of switch, case break, and deafult


example that will be transformed into switch statement
````

int x = <some value>

x = 10 -> <statement>

x = 20 -> <statement>

x = 30 -> <statement>

x = anything else -> <statement>

````

now turning this into switc

````

int x = <some value>
switch(x){
    case 10 : <statement>
                break;
    case 20 : <statement>
                break;
    case 30 : <statement>
                break;
    case anything else : <statement>
}
````

using **default** incase x does not match

````

int x = <some value>
switch(x){
    case 10 : <statement>
                break;
    case 20 : <statement>
                break;
    case 30 : <statement>
                break;
    case anything else : <statement>
    default: statement
            break;
}
````
````

int x = <some value>
switch(x){
    case 10 : <statement>
                break;
    case 20 : <statement>
                break;
    case 30 : <statement>
                break;
    case anything else : <statement>
}
````

**break** can be sean as the closing statement for an if condition
**patterns that switch specifies must be constants**
## Code examples for general form of switch
````
package module4.lesson4;

/**
 *
 * @author Anganam
 */
public class CaseExample {
    public static void main(String[] args){
        int day =99;
        System.out.println("The day is "  + day);
        
        switch (day){
            case 0:
                System.out.println("An exciting new week begins!");
                break;
            case 1:
                System.out.println("boring!");
                break;
            case 2:
                System.out.println("Okay, let's try again!");
                break;
            case 3:
                System.out.println("Whoo hoo, half the way there!");
                break;
            case 4:
                System.out.println("Still dragging on!");
                break;
            case 5:
                System.out.println("Yay, weekend!");
                break;   
            default:
                System.out.println("Weekends rock, but are never long enough!");
                break;                
        }
    
    }
    
}

```
## Understanding break

## Identifyinh switchable types

