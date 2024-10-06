/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author predo
 */
public class trabalho_predoo_4 {
    public class Contador {
    private static int valor = 0; // Inicializa o atributo estático com valor 0
    public static void incrementa() {
        valor++; // Acessa o atributo estático e aumenta em uma unidade
    }
    public static void decrementa() {
        valor--; // Acessa o atributo estático e diminui em uma unidade
    }
    public static int getValor() {
        return valor; // Acessa o atributo estático
    }
    public static void main(String[] args) {
        // Chama o método estático getValor() que exibe: 0
        System.out.println(Contador.getValor());
        // Chama o método estático incrementa()
        Contador.incrementa();
        // Chama o método estático getValor() que exibe: 1
        System.out.println(Contador.getValor());
    }

    }
    
}
