////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindLargestDigit
//  Description     :   Used to Find largest digit from given number
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Prathamesh Rajesh Bawane
//  Date            :   9/11/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNo /= 10;
        }
        System.out.print("Largest digit is " + iMax);
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program20_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(83429);
    }
}