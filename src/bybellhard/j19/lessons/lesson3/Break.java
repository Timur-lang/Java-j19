package bybellhard.j19.lessons.lesson3;

public class Break {
    public static void main(String[] args) {
      /*  for (int i = 0; i < 99999; i++){
            System.out.println(i);
            if (i == 5)break;
        }

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0)continue;
            System.out.println(i);
        }*/
        int[] intsBreak = {0, 11, -2, 21, 5};

        for (int i = 0; i < intsBreak.length; i++) {
 //           int digit = intsBreak[i];

            if (i % 2 != 0)
                intsBreak[i] += intsBreak[i];

            //         System.out.println(intsBreak[i]);

        }
        for (int digit : intsBreak) {

            System.out.println(digit + " ");
        }
        System.out.println();
    }

}
