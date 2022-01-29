package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type a 4 word sentence:");
        String sentance = scanner.nextLine();

        System.out.println(sentance.replaceAll("\\s+", "\n"));


    }
}

