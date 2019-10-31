package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "ZR-1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "ZR-2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "ZR-3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "ZR-4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "ZR-5";
        
        Protoss protoss1 = new Protoss();
        protoss1.name = "PR-1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "PR-2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "PR-3";
        
        Terran terran1 = new Terran();
        terran1.name = "TR-1";
        Terran terran2 = new Terran();
        terran2.name = "TR-2";
        Terran terran3 = new Terran();
        terran3.name = "TR-3";
        Terran terran4 = new Terran();
        terran4.name = "TR-4";
        
        /*Zerg[] zerg = new Zerg[5];
        for (int i = 0; i < 5; i++) {
        zerg[i] = new Zerg();
        zerg[i].name = "ZERG_No" + i;
        
        Protoss[] protoss = new Protoss[3];
        for (int i = 0; i < 5; i++) {
        protoss[i] = new Protoss();
        protoss[i].name = "PROTOSS_No" + i;
     
        Terran[] terran = new Terran[4];
        for (int i = 0; i < 5; i++) {
        terran[i] = new Terran();
        terran[i].name = "TERRAN_No" + i;*/
        
        
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
