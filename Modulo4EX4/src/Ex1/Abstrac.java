package Ex1;

abstract class Abstrac {
    public abstract void detalhes();
    String nome,autor;
    double preco,numeroFaixa,duracao;

  public void Livros (String nome,String autor,double preco){
        this.nome=nome;
        this.autor=autor;
        this.preco=preco;

    }
    public void CDs ( String nome,double preco,double numeroFaixa){
        this.nome=nome;
        this.preco=preco;
        this.numeroFaixa=numeroFaixa;

    }
    public void DVDs (String nome,  double preco,double duracao){
        this.nome=nome;
        this.preco=preco;
        this.duracao=duracao;
    }



}

