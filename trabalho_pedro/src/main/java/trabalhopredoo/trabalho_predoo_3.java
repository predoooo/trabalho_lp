/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhopredoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class trabalho_predoo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Posto posto = new Posto(3);
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);

        try {
            Bomba bombaDisponivel = posto.bombaDisponivel();
            bombaDisponivel.abastecer(caminhao);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    
}
class Bomba {
    private final String combustivel;
    private Carro carroAbastecendo;
    public Bomba(String combustivel) {
        this.combustivel = combustivel;
    }
    public void abastecer(Carro carro) {
        this.carroAbastecendo = carro;
        System.out.println("O " + carro.getClass().getSimpleName() + " " + carro.nomeCompleto() + " está sendo abastecido com " + this.combustivel);
    }
    public boolean estaDisponivel() {
        return this.carroAbastecendo == null;
    }

    void abastecer(Caminhao caminhao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Posto {
    private final List<Bomba> bombas;
    public Posto(int numBombas) {
        bombas = new ArrayList<>();
        for (int i = 0; i < numBombas; i++) {
            bombas.add(new Bomba("Diesel"));
        }
    }
    public Bomba bombaDisponivel() throws Exception {
        for (Bomba bomba : bombas) {
            if (bomba.estaDisponivel()) {
                return bomba;
            }
        }
        throw new Exception("Nenhuma bomba disponível");
    }
}