////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   PrintReverse
//  Description     :   Used to Print numbers from N till 1
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Prathamesh Rajesh Bawane
//  Date            :   9/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void PrintReverse(int iNo)
    {
        int iCnt = 0;

        for(iCnt  = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+ "\t");    
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program20_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}