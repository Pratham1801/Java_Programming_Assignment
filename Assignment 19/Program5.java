////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CalculatePower
//  Description     :   Used to calculate the power of given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Prathamesh Rajesh Bawane 
//  Date            :   9/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CalculatePower(int iBase, int iExp)
    {
        int iCnt = 0;
        int iResult = 1;

        for (iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iResult = iResult * iBase;
        }
        System.out.print(iResult);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program19_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2 ,5);
    }
}