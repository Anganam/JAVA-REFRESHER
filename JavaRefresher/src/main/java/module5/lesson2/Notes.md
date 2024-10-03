#



## Declaring multi-dimensional arrays

type    variable:
````
int[][] iaa;
int[] iaa[x];

int iaa[][];


int iaa[][]'

````

## Using immediate initialization of multi-dimensional arrays
````
int[][] iaa = {
{1,2,3},
{2,4,6},
{9,8,7}
};


int[][] iaa = {
{1},
{2,3},
{4,5,6}
};
````


## Using iterative initialization of multi-dimensional arrays
````
int[] ia = new int[10];

int[][] iaa = new int[2][3];
for(int i = 0; i < iaa.length; i++){
    for(int j = 0; j < iaa[i].length; j++){
        iaa[i][j] = getValue();
    }
}
````

## Code examples
