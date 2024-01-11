public class Carro {
    private String Marca;
    private String Modelo;
    private String Segmento;
    private int Combustivel;
    private int Preco;
    private int Ano;

    public Carro(String Marca, String Modelo, String Segmento, int Combustivel, int Preco, int Ano) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Segmento = Segmento;
        this.Combustivel = Combustivel;
        this.Preco = Preco;
        this.Ano = Ano;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSegmento() {
        return Segmento;
    }

    public void setSegmento(String Segmento) {
        this.Segmento = Segmento;
    }

    public int getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(int Combustivel) {
        this.Combustivel = Combustivel;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    
    
    public String MostraDadosCarro(){
        return "\nMarca: "+Marca+"\nModelo: "+Modelo+"\nSegmento: "+Segmento+"\nCombustivel: "+Combustivel+"\nPreço: "+Preco+"\nAno: "+Ano;
    }
}
