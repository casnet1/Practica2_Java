
package mipaquete;

 class Suma {
public static void main (String [] args){
    if(args.length !=2){
        System.out.print("Error, introduzca 2 cantidades ");
        System.out.println("numericas como arguumentos");
        System.exit(0);
    }
    float a;
    try{
        a=Float.parseFloat(args[0]);
    }
    catch(NumberFormatException nfe1){
        a=0.0f;
    }
    
    
    float b;
    try{
        b=Float.parseFloat(args[1]);
    }
    catch(NumberFormatException nfe2){
        b=0.0f;
    }
    float c=a+b;
    System.out.printf("%.3f + %.3d=%.4f\n",a,b,c);
    
   
}    
}
