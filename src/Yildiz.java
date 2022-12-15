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


/*Kullan�c�dan sat�r say�s�n� belirtmek �zere bir tamsay� ald���n�z� d���n�n�z. Al�nan tamsay�
* kadar say�dan olu�mak �zere, a�a��daki �rnekte verilen �ekli ekrana �izen yildizBas() fonksiyonunu
* yaz�n�z. (15 Puan)
*
* �R: 6 Tamsay�s� girildi�indeki ��kt�.
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
