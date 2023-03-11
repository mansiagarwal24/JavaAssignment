/*
    Write the following a functional interface and implement it using lambda:

    To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
    Increment the number by 1 and return incremented value Parameter (int) Return int
    Concatination of 2 string Parameter (String , String ) Return (String)
    Convert a string to uppercase and return . Parameter (String) Return (String)

 */

package Java8Features;

interface greaterNo{
    boolean greaterOrNot(int a,int b);
}

interface increment{
    int incre(int a);
}

interface concatination{
    String concat(String s1,String s2);
}

interface upperCase{
    String upper(String s);
}


public class ques1A {
    public static void main(String[] args) {
        //part (a)
        greaterNo num=(a,b)-> {
            return a>b;
        };
        System.out.println("a is greater than b: "+num.greaterOrNot(4,8));

        //part(b)
        increment n=(c)->{
            return c=c+1;
        };
        System.out.println("number is incremented by plus one: "+n.incre(5));

        //part(c)
        concatination s=(s1,s2)->{
          return s1+s2;
        };
        System.out.println("Concatination of 2 strings: "+s.concat("Mansi"," Aggarwal"));

        //part(d)
        upperCase u = (a)->{
            return a.toUpperCase();
        };
        System.out.println("string in upper case: "+u.upper("Welcome to ttn"));
    }
}
