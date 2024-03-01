/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacion2;

public class Programacion2 {

    public static void main(String[] args) {
        Character homero = new Character("homero", "inspector de seguridad", 33, "pequeño demonio");
        homero.greeting(); // Llamada al método greeting()
    }

    static class Character {
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }

        void greeting() {
            System.out.println(this.phrase);
        }
    }
}
