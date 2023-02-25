
package Model;


public class IMC {
    
    private double peso;
    private double altura;
    public double imc;
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getImc(){
        imc = (peso/Math.pow(altura, 2));
        return Math.round(imc*100.0)/100.0;
    }   
    
    public String getEstado(){
        String estado;
        if(imc > 18.5){
            if(imc < 24.9){
                estado = "Peso saludable";
            }
            else if(imc < 30.0){
                estado = "Sobrepeso";
            }
            else{
                estado = "Obesidad";
            }
        }
        else{
            estado = "Bajo peso";   
        }
        return estado;
    }
    
}
