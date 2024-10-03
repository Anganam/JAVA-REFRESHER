# Declare, instantiate, initialize and use a one-dimensional array

## Understanding simple array type,declaration and variable or array types

syntax
````
<typename> <variablename>;
<typename> <variablename> = <inialiaztion>;

int[] arrayOfIntl
````


## Instantiating an array, array length

````
int[] aI;

aI = new int[10];  //10 is the number of elements of the array


````

**NOTE:** value of the elements of the array will be set to a null like value:
numeric types = 0
boolean = false
objects = null


determine length of the array

````
int elementCount = aI.length;
````

## Initializing arrays by iteration array indexes

int [] aI = new int[10];

**NOTE** indexes [0] ...[9]

````
int [] aI = new int[10];
for(int i = 0; i < aI.lenth; i++){
    aI[i] = getValue(); //getValue() will be a method we created to collect value
}

````



````
StringBuilder [] sba = new StringBuilder[10];
for(int i = 0; i < sba.lenth; i++){
    sba[i] = new StringBuilder("Hello" + i); //getValue() will be a method we created to collect value
}

````

## Using a combined declaration and initialization of arrays

````
int[] aI = {1,2,3};

int[] aI = {1,2,3,}; // can have a trailing comma

````


Thing[] ta = {

newThing(),
newThing(654),
existingThing};


## Using immediate array creation not in a declarion

## Initializing arrays by copying

int[] aI = {1,2,3};

int[] aI2 = new int[1];



System.arraycopy(aI,0,aI2,0,aI.length);
