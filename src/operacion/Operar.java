    
package operacion;


public class Operar { // Nimbres de la clase 

    private double number1; // atributos 
    private double number2;
    private double numero3;
    

    public Operar(double number1, double number2) { //metodo contructor 
        this.number1 = number1;
        this.number2 = number2;
        
    }

    public Operar(double numero3) {
        this.numero3 = numero3;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }
    
    

    public double getNumber1() { // get - llamar - obtener
        return number1;
    }

    public void setNumber1(double number1) { // set - fijar
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    
    // Metodo tipo procedimiento no retorna valors
    public double sumar(){
        double suma = this.number1 + this.number2;
        System.out.println("La suma es "+suma);
        
        return suma; 
        
                
    }
    // metodo que retorna valores 
    public double restar() {
        
        double  resta =this.number1- this.number2;
        System.out.println("La resta es"+resta);
        
        
        return resta ;
    }
    
    
    
    
    public double dividir () {
        double divide = 0;
        if (this.number1==0){
            System.out.println("Ingresar dos dividendos");
        }
        else {
            divide = this.number1/this.number2;
            System.out.println("La diviosion es:"+divide);
        }
        //return divide
         return divide; 
         
    }
    
      public double multiplicar() {
        double multiplicacion =this.number1*this.number2;
        System.out.println("La multiplicacion es: "+multiplicacion);
        
    
    return multiplicacion; 
    
      }
    
    }

   
    



