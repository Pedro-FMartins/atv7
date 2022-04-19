/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Pedro Ferreira Martins <'112011004351'>
 * @author Raphael Ninomiya <'11211100998'>
 */
public class Aluno {
    
    private double media;
    private String st1, st2;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSt1() {
        return st1;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public String getSt2() {
        return st2;
    }

    public void setSt2(String st2) {
        this.st2 = st2;
    }
    
    
    public void calcularMedia(){
        
        media = (Double.parseDouble(st1) + Double.parseDouble(st2))/2;
        System.out.println("A média do aluno será de: " + media);
    }
    
    
}
