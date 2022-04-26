import java.util.Random;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int boton,boton_piso=1,ascensor_piso=1;
        System.out.println("La persona se encuentra en el piso "+gen_persona()+" y el elevador en el piso "+ascensor_piso);
        System.out.println("Presione el botón para llamar al elevador (0) (Generar persona)");
        Scanner llamar=new Scanner(System.in);
        boton=llamar.nextInt();
        while(boton_piso!=0){
            System.out.println("A que piso desea ir? (Presione 0 para salir del elevador)");
            Scanner b_piso=new Scanner(System.in);
            boton_piso=b_piso.nextInt();
            //System.out.println(boton_piso);
            if(boton_piso!=0){
                if(boton_piso==ascensor_piso){
                    System.out.println("Usted ya se encuentra en ese piso");
                }else{
                    ascensor_piso=boton_piso;
                    System.out.println("Usted fue al piso "+ascensor_piso);
                    System.out.println("El ascensor se encuentra en el piso "+ascensor_piso);
                }
            }
        }
    }
    public static int gen_persona(){
        Random random = new Random();

        int persona = random.nextInt(2 + 1) + 1;
        return persona;
    }
}

