////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckDivisible
//  Description     :   Used to check the given number is divisible by 5 and 11
//  Input           :   Integer
//  Output          :   String
//  Author          :   Prathamesh Rajesh Bawane 
//  Date            :   9/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckDivisible(int iNo)
    {
        if((iNo % 5)==0 && (iNo % 11)==0)
        {
            System.out.print("Divisible by both");
        }
        else 
        {
            System.out.print("Not Divisible");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program19_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}