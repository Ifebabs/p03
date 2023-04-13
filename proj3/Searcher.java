//**************************************************************************************************
// CLASS: Searcher
//
// CSE205  Object Oriented Programming and Data Structures, Summer(Session B) 2022
// Project Number: p03
//
// AUTHOR
// Ife Babarinde
//**************************************************************************************************
package proj3;

import java.util.ArrayList;

public class Searcher {
    
    /*
     * Method implements an iterative binary search to find the Student object by last name
     * since its in ascending ordered and returns the index of the Student object, or returns - 1 if not found 
     */
    public static int search(ArrayList<Student> pList, String pKey) {
    
        int pLow = 0;
        int pHigh = pList.size() - 1;
        while (pLow <= pHigh) {
            int middle = (pLow + pHigh) / 2;
            int findMe = pKey.compareTo(pList.get(middle).getLastName());
            if (findMe == 0) {
                return middle;
            } else if (findMe < 0) {
                pHigh = middle - 1;
            } else {
                pLow = middle + 1;
            }
        }

        return -1;
    }
}
