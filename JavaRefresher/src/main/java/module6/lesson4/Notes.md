
# Lesson 4: Compare loop constructs


## 4.1 Comparing while and do while loops

Compare while and simple forloop

````
for(<init>;<test>;<prepapre for next>)
````

````
while(<test>)

````




## 4.2 Comparing while and simple for loops

````
for(<init>;<test>;<increment>){
    doStuff();
}
````

````
init;
while(<test>){

    doStuff();
    <increment>;
}

````
## 4.3 Comparing while and enhanced for loops working on Iterables

````
List<Thing> lt = ...
for(Thing t : lt){...}
```

----
````
Iterator it = lt.iterator();

while (it.hasNext()){

    Thing t = it.next();
}

````

## 4.4 Comparing while and enhanced for loops working on arrays
````
Thing[] ta = ...
for(Thing t : ta){...}
```


----

int idx = x;

while()````
List<Thing> lt = ...
for(Thing t : lt){...}
```
on
