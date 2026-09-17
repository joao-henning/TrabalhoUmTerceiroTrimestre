package com.mycompany.exercicios;

public class Produto {

    public String nome;
    public Double preco;
    public Integer quantidadeEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String adicionarEstoque(Integer quantidade) {

        if (quantidade > 0) {
            this.quantidadeEstoque =
                    this.quantidadeEstoque + quantidade;

            return "Entrada realizada com sucesso!";
        }

        return "A quantidade deve ser positiva.";
    }

    public String vender(Integer quantidade) {

        if (quantidade > 0 &&
                quantidade <= this.quantidadeEstoque) { 
            this.quantidadeEstoque =
                    this.quantidadeEstoque - quantidade;

            return "Venda realizada com sucesso!";
        }

        return "Nao foi possivel realizar a venda.";
    }

    public Double calcularValorEstoque() {
        return this.preco * this.quantidadeEstoque;
    }

    public String exibirResumo() {

        return "Produto: " + this.nome + "\nPreco: R$ " + this.preco + "\nEstoque: " + this.quantidadeEstoque + "\nValor do estoque: R$ " + this.calcularValorEstoque();
    }
}
