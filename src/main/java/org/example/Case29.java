package org.example;

public class Case29 {

    public int divide(int dividend, int divisor) {
        // Обработка переполнения при делении минимального целого значения
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Возврат значения, если результат переполняет положительное целое значение
        }

        // Определяем знак результата
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Преобразуем делимое и делитель в положительные значения
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient = 0;

        // Используем битовые операции для оптимизации (двойное сдвиг и вычитание)
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;

            // Умножаем делитель на 2 в цикле пока он меньше или равен делимому
            while (absDividend >= (temp << 1)) {
                temp <<= 1; // Увеличиваем делитель (темп) в 2 раза
                multiple <<= 1; // Увеличиваем множитель (количество раз, которое смогли вычесть)
            }

            // Вычитаем найденный делитель (temp) из делимого и увеличиваем частное
            absDividend -= temp;
            quotient += multiple;
        }

        // Применяем знак к результату
        quotient = negative ? -quotient : quotient;

        // Гарантируем, что результат находится в рамках 32-битного знакового целого
        return (int) quotient;
    }

//Runtime - 1ms  (71.72%)
//Memory - 41.36mb  (15.39%)

/*    public int divide(int dividend, int divisor) {
        BigDecimal dividendBD = new BigDecimal(dividend);
        BigDecimal divisorBD = new BigDecimal(divisor);
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }

        return dividendBD.divide(divisorBD, 2, BigDecimal.ROUND_HALF_UP).intValue();
    }*/

}

/**


29. Divide Two Integers
    Difficulty: Medium

Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.



Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.

Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.



Constraints:

        -231 <= dividend, divisor <= 231 - 1
divisor != 0

*/
