////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindFactorial
//  Description     :   Used to find factorial of given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Prathamesh Rajesh Bawane
//  Date            :   9/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindFactorial(int iNo)
    {
        int iCnt = 0;
        int iFac = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFac *= iCnt;
        }
        System.out.println(iFac);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program16_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);
    }
}