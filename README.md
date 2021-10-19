# JAVA Batch  AEM  2021 October 

  
- Rishabh - Btech electrical, bikaner, playing cricket, - watching movies - 6 /10 
- Aakash - Btech IT, playing TT, 4 / 10 
- Amit - Btech CS Bhopal MP, Wating movies, web series, 5/10 
- Ashutosh - Patna, Bihar, Btech kolkatta, CS, play cricket, 6.5/10
- Arjun - Btech CS, VIT, exploring foods, 4/10
- Bhavya - Btech, CS, AP, watingh movies, listening music 5.5/10
- Hemanth - Btech E&C, 6.5/10, travelling 
- Lokesh - IT, Bareli, play cricket, swim ,  4/10
- Manav - Btech, CS, play foot ball, mutualfunds, cryptocurrency, 4/10 
- Mayuresh - Pune, BE CS, Dance, cricket, volley ball, 6.5/10
- Pankhuri - E&C, PSIT Kanpur, painting, listening music 4.5/10
- Ronak - CS, Ahmedabad, 8/10, stock markets, documentaries
- Sajid - CS,  delhi, python, C++, football 
- Srishti - CS, Kolkatta, writing quora, 6/10
- Shivanand- B tech, EC, learning technologies 6/10
- Utkarsh - Lukhnow, Btech CS, reading books, travelling 6/10 
- Vishav -  BE, E&C , travel, 3/10 
- Arti - Btech, CS, play badminton, cooking, 7/10 
- Yogesh - CS, Mumbai university, play chess, walking in evening, reading books, 5/10


## List of OOPS Concepts in Java 
- Inheritence 
- Encapulation
- Abstraction
- Polymorphism 

### JVM 
- - What is JVM 
- Change src to byte code 
- Platform independent 
- JDK VS JRE 
- in JRE you have JVM 
- JDK - Helps in compiling 

<hr/>


### Hello World Program 
```
public class Hello {
    public static void main(String [] args) {
        int x=10; 
        boolean flag; 
        System.out.println("Hello");
        System.out.println(x);
        System.out.println(flag);
        hi();
    }

    void hi() {}
}
```


- C / C++ 
```
#DEFINE main hello
    int hello() {}


    void main() {}
```


### Platform Independence 
- Windows - Java -> .java -> .class -> jvm 
- Mac - Java -> .java -> .class -> jvm 
- Sun Solaris  - Java -> .java -> .class -> jvm 
- Linux - Java -> .java -> .class -> jvm 
- 






### Tools needed 
- We will use Java11 
- IDE - Eclipse, IntelliJ, VS Code, Net Beans 

<img src="./images/day1.drawio.png" width="200">


### Software List 
- https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers
- https://git-scm.com/downloads
- https://code.visualstudio.com/download
- https://www.oracle.com/java/technologies/downloads/#java11
- 

## Day 1 Agenda 
- Creating Classes in Java, 
- Working with Classes in Java, 
- Making methods and classes final, 
- OOPS- Inheritance,
- Overriding methods, 
- Packages -Package access
- Documentation comments,  

## List of OOPS Concepts in Java 
- Inheritence 
- Encapulation
- Abstraction
- Polymorphism 


### Usage of variables 
- packages - lower case (com.ps.beans, org.ps.controller)
- varaibles - camel case (empId, salaryDrawn, address, withDraw)
- method names - camel case (getEmpId(), withDrawSalary(), makePayment(), getDataFromServer())
- class names - pascal case (Employee.java, HelloWorld.java, SomeController.java)
- constants - uppercase - (PI, LOCATION, VERSION)
- +++ indentation 

- What is a class 
    - is blue print of the object, 
    - Every class shall have characteristics 
  
- What is a Object 
- What is instance variable 
<!-- - what is static variable 
- What is static method 
- what is static block  -->
- what is local variable 


class Employee {
    int empId; 
    String empName;
    float empSalary
    int empDept;
    int empAge;

    void hi() {
        int x; 
    }
}




Employee e; 
Employee e = new Employee(); 


- jar file is collection of class files + properties etc 
- java documentation to understand .jar content 
- WORM - Write Once Read Many 
- DRY - Dont Repeate Yourself 


### Access Specifiers 
- Encapulation
  - public 
  - private 
  - protected
  - default (package)
- keep all your variable private, you access it with getters / setters 

### Access Modifiers 
- final 
- static 
- synchronized 
- Abstract 
