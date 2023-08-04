import java.util.Scanner;
public class index {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Recolhe valor de H
        System.out.print("Informe o valor de h(Altura): ");
        float h = input.nextFloat();
        //Recolhe valor de ab
        System.out.print("\nInforme o valor de ab(Base): ");
        float base = input.nextFloat();
        // Calculando Altura: 
        float a = (float)Math.sqrt(Math.pow(h, 2) + (float)Math.pow(base, 2));
        //Calcular a área lateral
        float areaTriangulo = a*base;
        //Calcular a área Base
        float areaBase = base*base*4;
        //Calcular a área total 
        float areaTotal = 4*areaTriangulo + areaBase;
        //Recolhe o tipo
        int tipo = -1;
        do{
            System.out.print("\nInforme o tipo válido de tinta (1, 2 ou 3).");
            System.out.print("\n [1]: Tipo 1 - R$ 127,90");
            System.out.print("\n [2]: Tipo 2 - R$ 258,98");
            System.out.println("\n [3]: Tipo 3 - R$ 344,34");
            tipo = input.nextInt();        
        }while(tipo < 0 || tipo>3);
        //Recolhe o valor da tinta
        double valorBase;
        switch(tipo){
            case 1:
                valorBase = 127.90;
            break;
            case 2:
                valorBase = 258.98;
            break;
            default:
                valorBase = 344.34;
        }
        //Calculando litros
        float litros = areaTotal/(float)4.76;
        //Calculando latas
        float latas = (float)Math.ceil(litros/18);
        //Preço 
        double preco = valorBase*latas;
        //Volume
        float volume = areaBase/3 * h;
        //Log de saída
        System.out.println("ab: " + base);
        System.out.println("h: " + h);
        System.out.println("a1: " + a);
        System.out.println("Área Triângulo: " + areaTriangulo);
        System.out.println("Área Base: " + areaBase);
        System.out.println("Área Total: " + areaTotal);
        System.out.println("Tipo de Tinta: " + tipo);
        System.out.println("Litros: " + litros);
        System.out.println("Latas: " + latas);
        System.out.println("Preço: " + preco);
        System.out.println("Volume: "+ volume);  
        input.close();
    }       
}
