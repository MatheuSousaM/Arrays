

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int [] array ={10, 20, 25, 45, 60, 76};
        int elemento;
        int posicao = -1;


        System.out.println("Arrays");
        for(int i = 0; i< array.length; i++ ){
            System.out.println(array[i]);
          
        }
    
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    int con = scan.nextInt();

    if (con == 1){

        System.out.println("Digite um dos numeros listados acima:");     
        elemento = scan.nextInt();      


        for( int i = 0; i < array.length; i++){
            if (array[i] == elemento){
                posicao=i;
                break;
            }
        }

        if(posicao != -1){
            System.out.println("Item " + elemento + " pode ser encontrado na posição: " + posicao);
        }
            else{
                System.out.println("Nenhum item foi encontrado");

            }
    }
    else {
        System.out.println("obrigado por usar o programa");
    }


    }
}
