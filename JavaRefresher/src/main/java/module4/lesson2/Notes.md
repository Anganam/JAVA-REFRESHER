# Test equality between String amd other objects using == and equal()

## Lesson 2.1

### **Understand the meaning of == and the intended meaning of equals()**


````
Date d1 = new Date();

Date d2 = new Date();

Date d3 = d2;

````



## Code example result 

````

cd C:\Users\Anganam\JAVA-REFRESHER\JavaRefresher; "JAVA_HOME=C:\\Program Files\\Java\\jdk-21" cmd /c "\"C:\\Program Files\\NetBeans-23\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" \"-Dexec.executable=C:\\Program Files\\Java\\jdk-21\\bin\\java.exe\" -Dexec.mainClass=module4.lesson2.P4L3 -Dexec.classpathScope=runtime -Dexec.appArgs= \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-23\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Scanning for projects...

---------------------< com.anganam:JavaRefresher >----------------------
Building JavaRefresher 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ JavaRefresher ---
skip non existing resourceDirectory C:\Users\Anganam\JAVA-REFRESHER\JavaRefresher\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ JavaRefresher ---
Nothing to compile - all classes are up to date.

--- exec:3.1.0:exec (default-cli) @ JavaRefresher ---
s1 == s2 is false
s1 == s2 is true
s1.equals(s2) is true
s1.equals(s3)2 is true
sb1 == sb2 is false
sb1 == sb2 is true
sb1.equals(sb2) is false
sb1.equals(sb3)2 is true
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  1.611 s
Finished at: 2024-10-02T17:54:26+02:00
````


## Lesson 2.2


````

cd C:\Users\Anganam\JAVA-REFRESHER\JavaRefresher; "JAVA_HOME=C:\\Program Files\\Java\\jdk-21" cmd /c "\"C:\\Program Files\\NetBeans-23\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" \"-Dexec.executable=C:\\Program Files\\Java\\jdk-21\\bin\\java.exe\" -Dexec.mainClass=module4.lesson2.Customer -Dexec.classpathScope=runtime -Dexec.appArgs= \"-Dmaven.ext.class.path=C:\\Program Files\\NetBeans-23\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.1.0:exec"
Scanning for projects...

---------------------< com.anganam:JavaRefresher >----------------------
Building JavaRefresher 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ JavaRefresher ---
skip non existing resourceDirectory C:\Users\Anganam\JAVA-REFRESHER\JavaRefresher\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ JavaRefresher ---
Recompiling the module because of changed source code.
Compiling 6 source files with javac [debug release 21] to target\classes

--- exec:3.1.0:exec (default-cli) @ JavaRefresher ---
c1 == c2 is false
c1 == c3 is false
c1 == c4 is false
c1.equals(c2) is false
c1.equals(c3) is true
c1.equals(c4) is true
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.864 s
Finished at: 2024-10-02T18:29:42+02:00
------------------------------------------------------------------------


````