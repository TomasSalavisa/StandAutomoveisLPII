public class Cliente {
    private String Nome;
    private String Morada;
    private int Telefone;
    private int CodigoPostal;
    private String Email;
    private String Login;
    private String Passe;

    public Cliente(String Nome, String Morada, int Telefone, int CodigoPostal, String Email, String Login, String Passe) {
        this.Nome = Nome;
        this.Morada = Morada;
        this.Telefone = Telefone;
        this.CodigoPostal = CodigoPostal;
        this.Email = Email;
        this.Login = Login;
        this.Passe = Passe;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String Morada) {
        this.Morada = Morada;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPasse() {
        return Passe;
    }

    public void setPasse(String Passe) {
        this.Passe = Passe;
    }
    
    
    public String MostraDados(){
        return "\nNome: "+Nome+"\nEmail: "+Email+"\nMorada: "+Morada+"\nTelefone: "+Telefone+"\nCodigo Postal: "+CodigoPostal+"\nLogin: "+Login+"\nPassword: "+Passe;
    }
}
