package com.mycompany.exercicios;

public class Livro {

    public String titulo;
    public Integer numeroPaginas;
    public Double preco;
    public String autor;
    
    public Livro(String titulo, String autor, Integer numeroPaginas, Double preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
    }

    public String exibirDetalhes() {

        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nPaginas: " + this.numeroPaginas + "\nPreco: R$ " + this.preco;
    }

    public String aplicarDesconto(Double percentual) {

        if (percentual >= 0 && percentual <= 50) {

            Double desconto = this.preco * percentual / 100;

            this.preco = this.preco - desconto;

            return "Desconto aplicado!";
        }

        return "Desconto invalido!";
    }
} 