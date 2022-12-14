package uz.bakhromjon.meaningfulNames;

import java.util.Date;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 13/12/22, Tue
 **/
public class UsePronounceableNames {
    public static void main(String[] args) {
//        NameString
//        Name

        /* Name cannot be int or non-string*/


//        customerInfo, customer -> indistinguishable


        // bad version
        class DtaRcrd102 {
            private Date genymdhms;
            private Date modymdhms;
            private final String pszqint = "102";
            /* ... */
        }
        ;

//        If you can’t pronounce it, you can’t discuss it without sounding like an idiot. “Well,
//                over here on the bee cee arr three cee enn tee we have a pee ess zee kyew int, see?” This
//        matters because programming is a social activity


        // good version
        class Customer {
            private Date generationTimestamp;
            private Date modificationTimestamp;
            ;
            private final String recordId = "102";
            /* ... */
        }
        ;

        int s = 0;
        int[] t = new int[10];
        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }


        final int NUMBER_OF_TASKS = 10; // random
        int[] taskEstimate = new int[10]; // random
        int realdays = 20; // random
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }


//        PhoneNumber phoneString;
// name not changed when type changed!
    }

    //
    public static void copyCharsBadVersion(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    public static void copyCharsGoodVersion(char source[], char destionation[]) {
        for (int i = 0; i < source.length; i++) {
            destionation[i] = source[i];
        }
    }
}
