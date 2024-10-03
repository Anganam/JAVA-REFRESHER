# Use a switch statement


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


## Using general form of switch, case break, and deafult

## Code examples for general form of switch

## Understanding break

## Identifyinh switchable types

