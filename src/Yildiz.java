import java.util.Scanner;

public class Yildiz {

    public static void main(String[] args) {
        yildizBas(6);
    }

    public static void yildizBas(int i){

        int rows = i;
        // loop to iterate for the given number of rows
        for (i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }

            // for new line after printing each row
            System.out.println();
        }
    }
}


/*Kullanýcýdan satýr sayýsýný belirtmek üzere bir tamsayý aldýðýnýzý düþününüz. Alýnan tamsayý
* kadar sayýdan oluþmak üzere, aþaðýdaki örnekte verilen þekli ekrana çizen yildizBas() fonksiyonunu
* yazýnýz. (15 Puan)
*
* ÖR: 6 Tamsayýsý girildiðindeki çýktý.
*
*
*       * * * * * *
*        * * * * *
*         * * * *
*          * * *
*           * *
*            *
*
*
*
*       public static void yildizBas(int i){
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*  }
*  */
