package model;
import model.Tarefa;
import model.Humor;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

                Tarefa t1 = new Tarefa("Atividade pratica", LocalDate.now(),Humor.FELIZ);

                System.out.println("=== Tarefa Criada com Humor ===");
                System.out.println(t1);

                // Agora, quando você terminar a tarefa, basta chamar o método concluir
                t1.concluir();

                System.out.println("\n=== Após concluir a tarefa ===");
                System.out.println(t1);


                if (t1.isConcluida()) {
                    System.out.println("\nParabéns! Você completou a tarefa com humor: " + t1.getHumorAtual());
                }

            }
        }


