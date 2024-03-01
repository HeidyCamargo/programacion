/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.programacion2;

import characters.Character;

public class Programacion2 {

    public static void main(String[] args) {
        Character homero = new Character("homero", "inspector de seguridad", 33, "pequeño demonio");
        homero.greeting();
        System.out.println(homero.getAge());

        Character bart = new Character();
        bart.setPhrase("Ay caramba");
        bart.greeting();

    }
}
