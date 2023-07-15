public class TestReturnType {

    public int nothingReturn()
    {
        int a=10;
        int b=10;
        int sumVal=a+b;
        //System.out.println("Sum Value"+c);
        return sumVal;
    }

    public static void main(String args[])
    {
        int finalSumVal;
        TestReturnType t=new TestReturnType();
        finalSumVal=t.nothingReturn();
        System.out.println("Sum Value from Main method"+finalSumVal);
    }
}
