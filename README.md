# Selenium
Selenium Project

Java Tutorials:

Java logic Practice programs :
https://beginnersbook.com/2017/09/java-examples/
https://codescracker.com/java/program/java-program-add-n-numbers.htm

String Manipulations Programs :
https://www.javatpoint.com/java-string

Collections Practice Programs :
http://java2novice.com/java-collections-and-util/

Selenium Class GIT Repo
https://github.com/ravilella1234/Durgsoft_6_30PM.git

Notes:-
25/02/2019 6:43 PM


AM  : public , protected, <default>, private

NAM : final, abstract, strictfp, static, native, synchronized, transiant,        volatile


AM NAM class ClassName
{
    AM NAM dataType variableName = value;

    AM NAM returnType methodName(parameters)
    {
       -------
    }

}


Class Level AM & NAM:
---------------------
class/AM  : public , <default>
class/NAM : final, abstract, strictfp


Variable Level AM & NAM:
------------------------
Variable/AM  : public , protected, <default>, private
Variable/NAM : final, static, transiant, volatile


Method Level AM & NAM:
---------------------
Method/AM  : public , protected, <default>, private
Method/NAM : final, abstract, strictfp, static, native, synchronized





26/02/2019

static Method()
{
    instance family(variables/methods): through class Object

    static family(variables/methods): either direcly or indirectly through className.

}

instance Method()
{
    instance family(variables/methods): directly

    static family(variables/methods): either direcly or indirectly through className.

}


public class SecondClass 
{
 int i=100; // instance (or) non-static (or) global variable
 static String name="ravilella"; // static variable
 
 public void m1()
 {
  System.out.println(i);
  m1();
  
  System.out.println(SecondClass.name);
  SecondClass.m2();

 }
 
 public static void m2()
 {
  SecondClass obj=new SecondClass();
  System.out.println(obj.i);
  obj.m1();
  
  System.out.println(SecondClass.name);
  SecondClass.m2();
  
 }
 
 public static void main(String[] args) 
 {
  SecondClass obj=new SecondClass(); 
  System.out.println(obj.i);
  System.out.println(name);
 
  obj.m1

 }

}

