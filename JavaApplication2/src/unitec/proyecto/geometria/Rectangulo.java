/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Rectangulo implements Superficies {
    private float ladoMayor;
    private float ladoMenor;
    
    public Rectangulo(){
        
    }


    public Rectangulo(float ladoMayor, float ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    public float calcularArea(){
        System.out.print("El area del rectangulo es:");
        return ladoMayor*ladoMenor;
        
    }
}

