class Calculator{

Addition a=new Addition();
Substraction s=new Substraction();
Multiplication m=new Multiplication();
Division d=new Division();

void performAddition(int x, int y){
a.add(x, y);
} 

void performSubstraction(int x, int y){
s.sub(x, y);
} 

void performMultiplication(int x, int y){
m.mul(x, y);
} 

void performDivision(int x, int y){
d.div(x, y);
} 

}

class Addition{
int res;
void add(int a, int b){
res=a+b;
System.out.println("Addition of two numbers = " + res);
}
}

class Substraction{
int res;
void sub(int a, int b){
res=a-b;
System.out.println("Substraction of two numbers = " + res);
}
}

class Multiplication{
int res;
void mul(int a, int b){
res=a*b;
System.out.println("Multiplication of two numbers = " + res);
}
}

class Division{
int res;
void div(int a, int b){
res=a/b;
System.out.println("Division of two numbers = " + res);
}
}

class TestCalculator{
public static void main(String args[]){
Calculator c= new Calculator();
c.performAddition(1,2);
c.performSubstraction(10,2);
c.performMultiplication(10,5);
c.performDivision(10,2);
}
}
