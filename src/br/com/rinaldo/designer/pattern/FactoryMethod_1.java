package br.com.rinaldo.designer.pattern;

public class FactoryMethod_1 {
    // Criador Abstrato
    // Produto Abstrato
    // Criador Concreto
    // Produto Concreto

    @SuppressWarnings("unused")
    public void main(String[] args) {
        Categoria categoria = new Digital();
        Produto produto = categoria.novoProduto();
    }
    interface Produto {
    }

    class ProdutoDigital implements Produto {
    }

    class ProdutoFisico implements Produto {
    }

    interface Categoria {
        Produto novoProduto();
    }

    class Digital implements Categoria {
        @Override
        public Produto novoProduto() {
            // ...
            return new ProdutoDigital();
        }
    }

    class Fisico implements Categoria {
        @Override
        public Produto novoProduto() {
            // ...
            return new ProdutoFisico();
        }
    }
}
