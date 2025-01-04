/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int Aval) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public int getSizeListNode(ListNode ln){
        int size = 0;
        while(ln != null){
            ln = ln.next;
            size++;
        }        
        return size;
    }

    public int[] listNodeToArray(ListNode ln){
        int [] array = new int[getSizeListNode(ln)];
        int [] arrayReversed = array;
        for(int i=0; i < array.length; i++){
            array[i] = ln.val;
            //System.out.println(array[i]);        
            ln = ln.next;
        }

        return array;
    }

    public int [] sumTwoArray(int[] array1, int[] array2){

        int sizeArray1 = array1.length;
        int sizeArray2 = array2.length;
        int [] arraySum = null;
        int [] arrayTmp1 = null;
        int [] arrayTmp2 = null;

        if(sizeArray1 >= sizeArray2){
            arrayTmp1 = new int [sizeArray1+1];
            arrayTmp2 = new int [sizeArray1+1];
            arraySum = new int [sizeArray1+1];
        }
        else{
            arrayTmp1 = new int [sizeArray2+1];
            arrayTmp2 = new int [sizeArray2+1];
            arraySum = new int [sizeArray2+1];
        }

        for(int i =0; i < arraySum.length; i++){

            if(i < sizeArray1){
                arrayTmp1[i] = array1[i];
            }
            else{
                arrayTmp1[i] = 0;
            }

            if(i < sizeArray2){
                arrayTmp2[i] = array2[i];
            }
            else{
                arrayTmp2[i] = 0;
            }
        }

        for(int i=0; i < arraySum.length; i++){

            arraySum[i] += arrayTmp1[i] + arrayTmp2[i];

            if(arraySum[i] > 9){
                arraySum[i] = arraySum[i]%10;
                arraySum[i+1] = arraySum[i+1]+1;
            }

            //CONTROLLO
            //System.out.println(arrayTmp1[i] +" |+| " + arrayTmp2[i] + " = " + arraySum[i]);
        }
        int [] arraySumAdapted = arrayAdapt(arraySum);

        return arraySumAdapted;
    }

    public int [] arrayAdapt(int [] array){
        int countZero = 0;
        for(int i= array.length-1; i >=0; i--){
            if(array[i] == 0){
                countZero++;
            }
            else
            {
                break;
            }
        }

        int difference = array.length - countZero;
        int [] newArray = new int[difference];

        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i];

            //CONTROLLO
            //System.out.println(newArray[i]);
        }

        return newArray;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //Creazione Array di L1
        int [] array_l1 = listNodeToArray(l1);

        //Creazione Array di L2
        int [] array_l2 = listNodeToArray(l2);

        //Creazione Array di Somma
        int [] array = sumTwoArray(array_l1,array_l2);

        //CONTROLLO
        /*for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        */

        ListNode ls = new ListNode();
        ListNode l3 = ls;

        for(int i = 0; i < array.length; i++){
            ls.val = array[i];
            
            if(i <= array.length-2){
                ls.next = new ListNode();
                ls = ls.next;
            }   
        }
            
        return l3;
    }
}