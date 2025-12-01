////////////////////////////////////////////////////////////////////////
//
//  Required Import Files
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Pattern
//  Description     :   Used To Print Pattern
//  Input           :   Integer, Integer
//  Output          :   Pattern
//  Author          :   Prathamesh Rajesh Bawane
//  Date            :   01/12/2025
//
////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j= iCol; j >= 1; j--)
            {
                if(j == i)
                {
                    System.out.printf("#\t");
                }
                else
                {
                    System.out.printf("*\t");
                }
            }
            System.out.printf("\n");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function : Main
//
////////////////////////////////////////////////////////////////////////

class Program_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        pobj = null;
        sobj.close();

        System.gc();
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Test Case Handled By Application
//  
//  Input   :   iRow : 4        iCol : 4
//  
//  Output  :   *   *   *   #
//              *   *   #   *
//              *   #   *   *
//              #   *   *   *
////////////////////////////////////////////////////////////////////////
