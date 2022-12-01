package leetcode17xx.DetermineIfStringHalvesAreAlike1704;

/*
        1. Берем строку и дели ее на 2 части  split, substring
*       2.Механизм проверки, что буква глассная number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        3. Далее прогоняем каждую строку и сравниваем значение каждого элемента массива с элементами массива vowels
         для а свой счет, для в - свой
        4. Сравнить count с нулем
* */
public class Solution {
    public boolean halvesAreAlike(String s) {


        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);


        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (a.charAt(i) == vowels[j]) {
                    count++;
                    break;
                }
            }
        }

        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (b.charAt(i) == vowels[j]) {
                    count--;
                    break;
                }
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.halvesAreAlike("Pasha"));
    }
}


