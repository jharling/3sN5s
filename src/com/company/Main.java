package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 1000;
        int answer = 0;
        answer = numMaker(answer, num-1);
        System.out.println(answer);
    }

    private static Integer numMaker(int answer, int num) {
        if (num % 3 == 0) {
            answer = answer + num;
        } else if (num % 5 == 0) {
            answer = answer + num;
        } else if (num < 3) {
            return answer;
        }
        return numMaker(answer, num - 1);
    }
}
