package poo.gilberto.sintaxebasica;
import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite o minuto de início: ");
        int minutoInicio = scanner.nextInt();

        System.out.print("Digite a hora de término: ");
        int horaFim = scanner.nextInt();
        System.out.print("Digite o minuto de término: ");
        int minutoFim = scanner.nextInt();

        // Convesão de Horas para Minutos
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFim * 60 + minutoFim;

        int duracaoEmMinutos;
        // O jogo terminou no mesmo dia
        if (fimEmMinutos >= inicioEmMinutos) {
            duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
            }
        // O jogo terminou no dia seguinte
        else {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
            }

        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.printf("Duração do jogo: %d horas e %d minutos%n", duracaoHoras, duracaoMinutos);
        scanner.close();
        }
    }


