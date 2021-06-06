package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    //1.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Add meg a szélességet: ");
//        double width = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("Add meg a magasságot: ");
//        double height = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("Add meg a vödrönkénti területet: ");
//        double areaPerBucket = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("Add meg az extra vödröket: ");
//        int extraBuckets = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println(PaintJob.getBucketCount(width, height, areaPerBucket, extraBuckets));

        //2.
//        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
//        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));

        //3.
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }
}
