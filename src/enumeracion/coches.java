/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author Miguel1
 */

        public enum coches {
        renault (53,12000),
        auidi (24,2600),
        bmw (22,222883),;

    private coches(int caballos, int precio) {
        this.caballos = caballos;
        this.precio = precio;
    }
       
        
        private final int caballos;
        private final int precio;

        public int getCaballos() {
            return caballos;
        }

        public int getPrecio() {
            return precio;
        }

        }

