package com.pluralsigh;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] spiltFullName;
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        System.out.println("Enter you full name: ");
        String fullName = scanner.nextLine().trim();
        spiltFullName = fullName.split(" ");
        int length = spiltFullName.length;


        if (length ==1 && !spiltFullName[0].isEmpty()){
            firstName = spiltFullName[0];
            middleName = "none";
            lastName = "none";
            suffix= "none";
        } else if (length == 2){
            firstName = spiltFullName[0];
            middleName = "none";
            lastName = spiltFullName[1];
            suffix= "none";
        } else if (length == 3 && !fullName.contains(",")) {
            firstName = spiltFullName[0];
            middleName = spiltFullName[1];
            lastName = spiltFullName[2];
            suffix = "none";
        } else if (length == 3 && fullName.contains(",")){
            firstName = spiltFullName[0];
            middleName = "none";
            lastName = spiltFullName[1].replace(","," ");
            suffix = spiltFullName[2];

        } else if (length ==4){
            firstName = spiltFullName[0];
            middleName = spiltFullName[1];
            lastName = spiltFullName[2].replace(","," ");
            suffix = spiltFullName[3];
        } else {
            System.out.println("Invalid Format");
        }



        System.out.println("FirstName: "+firstName);
        System.out.println("MiddleName: "+middleName);
        System.out.println("LastName: "+lastName);
        System.out.println("Suffix: "+suffix);
    }
}
