class SwapNumber{
public static void main(String agrs[]){
int a=100,b=400;

a=a+b;
b =a-b;
a =a-b;
a=a-b+a+b;
b=a-b+a+b+a+b+a+b;

a=a-b+a+b+a+b+a+b+a-b+a+b+a+b+a+b+b+a+b-b+a+b+a+b+a+b;


System.out.println("a:" +a);
System.out.println("a:" +b);
}
}