
package JavaAssignment2;
class MyException extends Exception{
    public MyException(String stmt){
        super(stmt);
        System.out.println("Custom Exception");
    }
}
