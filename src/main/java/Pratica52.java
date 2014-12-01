/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */

import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

public class Pratica52 {
    public static void main(String[] args) {
 
           Equacao2Grau x1 = new Equacao2Grau(12.0,32.0,43.0);
           Equacao2Grau x2 = new Equacao2Grau(12.0,21.0,52.0);
           Equacao2Grau x3 = new Equacao2Grau(37.0,73.0,14.0);
           
           System.out.println("Primeira Raiz de x1: "+x1.getRaiz1());
           System.out.println("Segunda Raiz de x1: "+x1.getRaiz2());
           System.out.println("Primeira Raiz de x2: "+x2.getRaiz1());
           System.out.println("Segunda Raiz de x2: "+x2.getRaiz2());
           System.out.println("Primeira Raiz de x3: "+x3.getRaiz1());
           System.out.println("Segunda Raiz de x3: "+x3.getRaiz2());
    }
}
