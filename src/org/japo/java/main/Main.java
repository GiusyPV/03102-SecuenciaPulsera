/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String NOM_NINYA = "Marta";
        final String ART_DESEO = "Pulsera hippy";
        final double DIN_INICIAL = 1.0;
        final double PRE_PULSERA = 0.70;

        //Cabecera
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");

        //Inicio
        System.out.printf("Nombre de la niña ...: %s%n", NOM_NINYA);
        System.out.printf(Locale.ENGLISH, "Dinero inicial ......: %.2f €%n", DIN_INICIAL);

        //Separador
        System.out.println("---");

        //Compras
        System.out.printf("Artículo a comprar ..: %s%n", ART_DESEO);
        System.out.printf(Locale.ENGLISH, "Precio artículo .....: %.2f €%n", PRE_PULSERA);

        //Separador
        System.out.println("---");

        //Calculos
        double dinRest = DIN_INICIAL - PRE_PULSERA;

        System.out.printf(Locale.ENGLISH, "Dinero restante .....: %.2f €%n", dinRest);
    }
}
