package leetcode12xx.SubtractTheProductAndSumOfDigitsOfAnInteger1281;

public class Solution {
    public int subtractProductAndSum(int n) {

        int lastnumber = 0;
        int productOfDigits = 1;
        int sumOfDigits = 0;
// найти произвидение всех цифр числа
        while (n > 0) {
            lastnumber = n % 10; // по остатку находим последнее значение
            sumOfDigits += lastnumber;
            productOfDigits *= lastnumber;
            n = n / 10; // укоротить значение на один регистр
        }

//  возвращаем разность  productOfDigits от sumOfDigits
        return productOfDigits - sumOfDigits;
    }
}
