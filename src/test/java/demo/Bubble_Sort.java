package demo;

public class Bubble_Sort {

    public static void main(String[] args) {
        int a[] = {11, 22, 76, 9, 8};
        int temp;
        int flag=0;

        for (int i = 0; i < a.length - 1; i++) {
           

           for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }

            // If no swapping happened, the array is already sorted
            if (flag == 0) {
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

//number swap done --round pending-swapping happening flag=1--number not swapping means list sorted flag=0
//length-1-i --- In round1 last element get sorted ,round 2 second last gets sorted likewise 