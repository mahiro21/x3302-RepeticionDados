/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Constantes
        final int MAX = 12;
        final int MIN = 2;

        //Variables
        int t;
        int dado;
        int sietes = 0;
        double porcentaje;

        System.out.printf("probavilidades de exito%n=======================%n");
        //Bucles
        for (t = 1; t <= 20; t++) {
            dado = RND.nextInt(MAX - MIN + 1) + MIN;
            System.out.printf("Tirada %dº co resultado ..: %d%n", t, dado);
            if (dado == 7) {
                sietes++;
            }
        }
        System.out.println("---");
        porcentaje = (double) sietes / 20 * 100;
        System.out.printf(Locale.ENGLISH, "porcentaje de sietes ..:"
                + " %.2f%%%n", porcentaje);
    }
}
