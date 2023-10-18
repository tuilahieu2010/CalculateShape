/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hieu
 */
public class Library 
{
    private Scanner sc = new Scanner(System.in);

    public String getString(String promt) {
        String s;
        do {
            System.out.print(promt);
            s = sc.nextLine();
        } while (s.equalsIgnoreCase(""));
        return s;
    }

    public double getDouble(String promt) {
        double number;
        while (true) {
            try {
                System.out.print(promt);
                number = Double.parseDouble(sc.nextLine());
                return number;
            } catch (Exception e) {
            }
        }
    }

    public int getBase(String promt) {
        int number;
        while (true) {
            try {
                do {
                    System.out.print(promt);
                    number = Integer.parseInt(sc.nextLine());
                } while (number != 2 && number != 10 && number != 16F);
                return number;
            } catch (Exception e) {
                System.out.println("Input invalid!");
            }
        }
    }

    public int getInt(String promt) {
        int number;
        while (true) {
            try {
                System.out.print(promt);
                number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.out.println("Input invalid!");
            }
        }
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt);
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }

}
