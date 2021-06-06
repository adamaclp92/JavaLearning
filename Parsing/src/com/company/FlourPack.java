package com.company;

public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else{
            int bigCountKilo = bigCount * 5;
            int smallCountKilo = smallCount;
            int sum = bigCountKilo + smallCountKilo;
            if(bigCountKilo > goal && bigCountKilo % goal != 0){
                while(bigCountKilo > goal) {
                    bigCount--;
                    bigCountKilo = bigCount * 5;
                }
                sum = bigCountKilo + smallCountKilo;
                if(sum >= goal){
                    return true;
                }
                else
                    return false;
            }
            else if(sum >= goal)
                return true;
            else
                return false;
        }
    }
}
