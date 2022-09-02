/*
Реализуйте программу, которая считает стоимость покупки, учитывая НДС.
 Т.е. дана стоимость товара и размер НДС (например, 19%)
 Ваша программа должна рассчитать, сколько вы должны оплатить, учитывая налог.
 */

public class Main {
    public static void main(String[] args) {

        double price1 = 150.0;
        int vat = 19;
        double vatFromPrice1 = price1*vat/100;
        double price2 = price1 + vatFromPrice1;

        System.out.println("price without VAT is " + price1);
        System.out.println("VAT is " + vat + "%");
        System.out.println("price with VAT is " + price2);


    }
}