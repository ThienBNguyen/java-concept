package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int myValue = 10000;
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println(
//                "integer min value = " + myMinIntValue
//        );
//        System.out.println(
//                "integer max value = " + myMaxIntValue
//        );
//        System.out.println(
//                "busted max value = " + (myMaxIntValue + 1)
//        );
//        int myMaxIntTest= 1;
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println(myMaxShortValue);
//
//        byte myFirstByteNum = 10;
//        short myFirstShortNum = 10000;
//        long myFirstLongNum = 5000 + (10*myFirstByteNum) + (10 * myFirstShortNum);
//        System.out.println(myFirstLongNum);
//        printConversion(0.0);
//        printMegaBytesAndKilBytes(2500);
//        System.out.println(6440 / 525600);
//        printYearsAndDays(6440);
//        printYearsAndDays(525600);
//        isOdd(3);
//        System.out.println(
//                sumOdd(1, 100)
//        );
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        VipPerson person2 = new VipPerson("Bbob", 2500.00);
        System.out.println(person2.getName());
        VipPerson person3 = new VipPerson("tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long conversionToMiles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + conversionToMiles + " mi/h");
        }
    }

    public static void printMegaBytesAndKilBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int converse = (kiloBytes / 1024);
            int remainKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + converse + "MB and " + remainKb + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;

    }

    public static boolean areEqualByThreeDecimalPlaces(double fist, double second) {
        int firstDecimal = (int) (fist * 1000);
        int seconDecimal = (int) (second * 1000);
        if (firstDecimal == seconDecimal) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        if (first + second == third) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int first, int second, int third) {
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int first) {
        return (first >= 13 && first <= 19);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else return radius * radius * Math.PI;

    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long xx = minutes;
            long zz = (xx % 525600) / 1440;

            long yy = xx / 525600;

            System.out.println(xx + " min = " + yy + " y and " + zz + " d");
        }
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second != third) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        if (summer && temperature < 25) {
            return false;
        } else if (!summer && temperature > 35) {
            return false;
        } else if (summer && temperature >= 45) {
            return true;
        } else return true;
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }
    }

    public static boolean isLeapYear2(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;

    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }if(isLeapYear(year) && month ==2){
            return 29;
        }
        switch (month){
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;

        }
    }
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }else {
            boolean num = number % 2 != 0;

            System.out.println(num);
            return num;

        }
    }
    public static int sumOdd(int start, int end){
        if((end < start) || start < 0 || end < 0){
            return -1;
        }
        int sum =0;
        for(int i = start; i <=end; i++){
            if(isOdd(i)){
                sum +=i;
            }
        }
        return sum;
    }
}
