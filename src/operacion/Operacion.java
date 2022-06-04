
package operacion;

public class Operacion {


    public static void main(String[] args) {
        
        
        
       Operar Mioperacion = new Operar(5,3);
        System.out.println(""+Mioperacion.getNumber1());
        System.out.println(""+Mioperacion.getNumber2());
        
        
        Operar Mioperacion2 = new Operar (0);
        System.out.println(""+Mioperacion2.getNumero3());
        
        double resultadosuma = Mioperacion.sumar();
        System.out.println("La suma es:"+resultadosuma);
      
        double resultadoResta = Mioperacion.restar();
        System.out.println("La resta es:"+resultadoResta);
        
        
        Operar Mioperacion3 = new Operar (3);
        double resultadodivide = Mioperacion.dividir();
        
        
        
        Operar Mioperacion4 = new Operar (4);
        double resultadomultiplicacion = Mioperacion.multiplicar();
        
        
        
        
        
                
        
        
        
        
        
        
       
    }
    
}
