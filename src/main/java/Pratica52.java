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
 
           Equacao2Grau x1 = new Equacao2Grau(1,2,1);
           Equacao2Grau x2 = new Equacao2Grau(1,5,1);
           Equacao2Grau x3 = new Equacao2Grau(2,4,0);
           
           System.out.println("Primeira Raiz de x1: "+x1.getRaiz1());
           System.out.println("Segunda Raiz de x1: "+x1.getRaiz2());
           System.out.println("Primeira Raiz de x2: "+x2.getRaiz1());
           System.out.println("Segunda Raiz de x2: "+x2.getRaiz2());
           System.out.println("Primeira Raiz de x3: "+x3.getRaiz1());
           System.out.println("Segunda Raiz de x3: "+x3.getRaiz2());
    }
}
