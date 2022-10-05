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
public class enumDias {
    public enum dias {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    public enum continentes {
        AFRICA (53),
        EUROPA (24),
        ASIA (22),
        AMERICA (26),
        OCEANIA (62);
        
        private int paises;

        private continentes(int paises) {
            this.paises = paises;
        }

        public int getPaises() {
            return paises;
        }

        public void setPaises(int paises) {
            this.paises = paises;
        }
    }
    
}
