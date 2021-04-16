package Midterm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class1 {
    int a, b, m[] = new int[12], p[] = new int[12];;

    public void mm1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a->");
        a = scanner.nextInt();
        System.out.print("b->");
        b = scanner.nextInt();

    }

    public void mm2() {
        Random random = new Random();

        for(int i=0; i<12; i++){
            m[i] = (random.nextInt(b-a)+a);
        }
        System.out.println(Arrays.toString(m));
    }

    public int mm3() {

        for (int i = 0; i < 12; i++) {
            if (m[i] > 0) {
                p[i] = m[i];
            } else p[i] = 999;
        }

        Arrays.sort(p);
        if (p[0] == 999) {
            System.out.println("araris dadebiti ricxvi");

        } else return p[0];
        return 0;
    }
    public void mm4() {
        for(int i=0;i<12;i++){
            System.out.println((i+1)+"."+m[i]);
        }
    }
    public void mm5() {

        for (int i = 0; i < 12; i++) {
            if (m[i] % 3 == 0) {
                p[i] = m[i];
            }else p[i] = 0;

        }
        System.out.println("samis jeradebi = "+Arrays.toString(p));
    }}


