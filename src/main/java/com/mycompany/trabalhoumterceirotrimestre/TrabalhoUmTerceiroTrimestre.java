package com.mycompany.trabalhoumterceirotrimestre;

import com.mycompany.exercicios.Pessoa;

public class TrabalhoUmTerceiroTrimestre {

    public static void main(String[] args) {
        Pessoa lucas = new Pessoa("Lucas de Souza", 24, (double) 1.74);
        System.out.printf("%s", lucas.exibirDados());
        System.out.printf("%s", lucas.fazerAniversario());
        System.out.printf("%s", lucas.exibirDados());
    }
}
