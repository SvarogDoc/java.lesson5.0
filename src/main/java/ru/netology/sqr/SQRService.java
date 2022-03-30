package ru.netology.sqr;

public class SQRService {

    public int calculate(int unRange, int upRange){
        int counter = 0; // считает количество раз, когда i * i попадает в диапазон
        for (int i = 10; i <= 99; i++) { //цикл от i = 10 до i = 99, после каждой итерации добавляет i + 1
            int sqr = i * i;
            if (unRange <= sqr && sqr <= upRange) { // && логическое И (true если оба условия верны)
                counter++; // равнозначно count = count + 1
            }
        }
        return counter;
    }
}

