package proceduralne;//Zadanie 31

import java.math.BigDecimal;

public class Rzutowanie {
    public static void main(String[] args) {
        System.out.println(Metody.policzPotege(3.2, 4));
        int wynik = (int) Metody.policzPotege(3, 5);
        System.out.println(wynik);
        int milisekundy = (int) Metody.przeliczMinutyNaMilisekundy(5);
        System.out.println(milisekundy);
        System.out.println(Metody.ileRazyObrociByte(383));

        int mojInt= 130;
        byte mojByte = (byte)mojInt; //256
        System.out.println(mojByte);

        System.out.println(Short.MAX_VALUE);

        //00 0
        //01 1
        //10 2
        //11 3

        //3 bity - 8
        //000
        //001
        //010
        //011

        //100
        //101
        //110
        //111

        //4 bity - 16
        // 0000
        // 0001
        // 0010
        // 0011

        // 0100
        // 0101
        // 0110
        // 0111

        // 1000
        // 1001
        // 1010
        // 1011

        // 1100
        // 1101
        // 1110
        // 1111
        //8 bit - 256 - byte
        //16 bit  32767 * 2 - short
        //32 - int
        //64 - long
        System.out.println(Long.MAX_VALUE);
        long myLong = 4_235_345_346L;

        float myFloat =(float) 123.55;

        int myInt2 = (int) myFloat;
        System.out.println(myInt2);

        BigDecimal duzaKwota = new BigDecimal("12343545645323423432432423423424234234");
        BigDecimal duzaKwota2 = new BigDecimal("12343545645323423432432423423424234234");
        System.out.println(duzaKwota);
        System.out.println(duzaKwota.multiply(duzaKwota2));

        char litera = '♔';
        //ASCII - 1byte 256
        //UNICODE - 4byte
        System.out.println(litera);

        char literaA = 'a';
        int a = litera;

        literaA++;
        System.out.println(literaA);
        for (char i = 0; i <=256 ; i++) {
            System.out.println(i);
        }


        char rzutowanie = (char)-5;
        System.out.println((int)rzutowanie);

        System.out.println(a);
        char krol = '\u265A'; //	U+265A
        System.out.println(krol);

        System.out.println();

        System.out.println(Metody.zwrocLiczbe());

        int[] tablica = {23, 65, 17, 7, -45, 95, -1};
        Metody.zwrocPozcjeElementu(17, tablica);
    }
}
