
package academia;

public class Aula {
    private double valorDaDiaria = 100;
    private String superior;
    private String inferior;
    
   
 public Aula (double valorDaDiaria, String superior){
     this.valorDaDiaria = valorDaDiaria;
     this.superior = superior;
     
 }
    public double getValorDaDiaria(){
        return this.valorDaDiaria;
    }
    
    public String getSuperior(){
        return this.superior;
    }
    
    public String getInferior(){
        return this.inferior;
    }
    
    
}