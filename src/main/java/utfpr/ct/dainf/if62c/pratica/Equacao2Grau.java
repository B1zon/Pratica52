/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1338773
 * @param <T>
 */
public class Equacao2Grau<T extends Number & Comparable<T>> {
       private T a;
       private T b;
       private T c;
       
       private static final String MSG_A_VAZIA = "Coeficiente a não pode ser zero";
       private static final String MSG_INVALIDA = "Equação não tem solução real";
       
       public Equacao2Grau(){
           
       }
       
       public Equacao2Grau(T a, T b, T c){
              if(a.doubleValue()==0)
                throw new RuntimeException(MSG_A_VAZIA); 
              this.a = a;
              this.b = b;
              this.c = c;
       }
       
       public T getA(){
           return a;
       }
       
       public T getB(){
           return b;
       }
    
       public T getC(){
           return c;
       }
       
       public void setA(T a){
           if(a.doubleValue()==0)
              throw new RuntimeException(MSG_A_VAZIA);
           this.a = a;
       }
       
       public void setB(T b){
            this.b = b;
       }
       
       public void setC(T c){
           this.c = c;
       }
       
       public double getRaiz1(){
           double x ;
           if(((b.doubleValue()*b.doubleValue())-4*a.doubleValue()*c.doubleValue())<0)
               throw new RuntimeException(MSG_INVALIDA);
           x = (-b.doubleValue()+Math.sqrt(((b.doubleValue()*b.doubleValue())
                   -4*a.doubleValue()*c.doubleValue())))/(2*a.doubleValue());
           return x;
       }
       public double getRaiz2(){
           double x ;
           if(((b.doubleValue()*b.doubleValue())-4*a.doubleValue()*c.doubleValue())<0)
               throw new RuntimeException(MSG_INVALIDA);
           x = (-b.doubleValue()-Math.sqrt(((b.doubleValue()*b.doubleValue())
                   -4*a.doubleValue()*c.doubleValue())))/(2*a.doubleValue());
           return x;
       }
} 
