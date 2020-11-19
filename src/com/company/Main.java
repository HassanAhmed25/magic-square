package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[][] magicSquare =
                {{'P', 'R', 'E', 'Y'},
                {'L', 'A', 'V', 'A' },
                {'O', 'V', 'E', 'R' },
                {'T', 'E', 'N', 'D' }};

        char c =  'n';
        Scanner e = new Scanner(System.in);
        do {
            System.out.print("Enter row index: ");
            Scanner sr = new Scanner(System.in);
            int row;
            row = sr.nextInt();

            System.out.print("Enter column index: ");
            Scanner sc = new Scanner(System.in);
            int col;
            col = sc.nextInt();

            displayRow(magicSquare,row);
            displayColumn(magicSquare,col);

            System.out.println("Want to go again Y or N?");
            c = e.next().charAt(0);

            if (c == 'N' || c == 'n')
            {
                System.out.println("Thank you. Have a nice day");
                System.exit(0);
            }

            else if(!(c == 'Y' || c == 'y'))
            {
                System.out.println("I said Y or N.");
                c = e.next().charAt(0);
            }

        }
        while (c == 'Y' || c == 'y');
    }
    public static void displayRow (char[][] mSq, int row)
    {
        if (row < mSq.length) {
            System.out.print("Row = ");
            for (int i = 0; i < mSq[0].length; i++) {
                System.out.print(mSq[row][i]);
            }
            System.out.println();
        }

        else {
            System.out.println("Invalid row");
        }
    }

    public static void displayColumn (char[][] mSq, int col)
    {
        if (col < mSq[0].length) {
            System.out.print("Column = ");
            for (char[] chars : mSq) {
                System.out.print(chars[col]);
            }
            System.out.println();
        }
        else {
            System.out.println("Invalid column");
        }
    }
}
