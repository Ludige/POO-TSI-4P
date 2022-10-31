package bancoheranca;

public abstract class Pessoa{
    private String nome;
    private String numero;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public Pessoa(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    public Pessoa(){
      //System.out.println("Proerd é o programa");
    }
}
