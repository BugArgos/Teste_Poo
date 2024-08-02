package poo.gilberto.sintaxebasica;

public class SwitchTest {
    public static void main(String[] args) {
        int numero = 3;
        switch (numero) {
            case 1:
                System.out.println("O valor é 1");
                break;
            case 2:
                System.out.println("O valor é 2");
                break;
            case 3:
                System.out.println("O valor é 3");
            case 4:
                System.out.println("O valor é 4");
                break;
            default:
                System.out.println("Valor não encontrado");
                break;
        }
        // Sem a utilização do Break, o código continua a sua execução, imprimindo
        // os valores presentes nos outros casos
    }
}
