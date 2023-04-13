//**************************************************************************************************
// CLASS: Sorter
//
// CSE205  Object Oriented Programming and Data Structures, Summer(Session B) 2022
// Project Number: p03
//
// AUTHOR
// Ife Babarinde
//**************************************************************************************************
package proj3;

import java.util.ArrayList;

public class Sorter {


    // Swaps the elements of an ArrayList

    private static void swap(ArrayList<Student> pList, int pIndex1, int pIndex2) {

        Student temp = pList.get(pIndex1);
        pList.set(pIndex1, pList.get(pIndex2));
        pList.set(pIndex2, temp);

    }

    // Partition based on length of student's last name.
    // Setting the first element as the partition.
    private static int partition(ArrayList<Student> pList, int pFromIdx,
            int pToIdx) {

        Student pivot = pList.get(pFromIdx);
        int leftIdx = pFromIdx;
        int rightIdx = pToIdx;

        while (leftIdx < rightIdx) {
            
            while (pList.get(leftIdx).compareTo(pivot) < 0) {
                leftIdx++;
            }
            
            while (pList.get(rightIdx).compareTo(pivot) > 0) {
                rightIdx--;
            }
            if (leftIdx < rightIdx) {
                swap(pList, leftIdx, rightIdx);
            }
        }
        return rightIdx;
    }

    // Quick sort, sorts the ArrayList of Student objects by last name

    private static void quickSort(ArrayList<Student> pList, int pStart, int pEnd) {

        if (pStart < pEnd) {

            int pivot = partition(pList, pStart, pEnd);

            quickSort(pList, pStart, pivot - 1);

            quickSort(pList, pivot + 1, pEnd);

        }
    }


public static void sort(ArrayList<Student> pList) {

    quickSort(pList, 0, pList.size() - 1);

}


}
