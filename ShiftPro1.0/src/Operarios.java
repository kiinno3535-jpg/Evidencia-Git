public class Operarios {
    //Definir atributos
    private int id_Login;
    private int id_Tipo_Operario;
    private int id_Tipo_Documento;
    private String nombre_Operario;
    private String password_Operario;
    private String confirmar_Password;

    //Constructor sin parámetros
    public Operarios() {
    }

    //Constructor con parámetros
    public Operarios(int id_Login, int id_Tipo_Operario, int id_Tipo_Documento, String nombre_Operario, String password_Operario, String confirmar_Password) {
        this.id_Login = id_Login;
        this.id_Tipo_Operario = id_Tipo_Operario;
        this.id_Tipo_Documento = id_Tipo_Documento;
        this.nombre_Operario = nombre_Operario;
        this.password_Operario = password_Operario;
        this.confirmar_Password = confirmar_Password;
    }

    //Métodos Setters
    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }
    public void setId_Tipo_Operario(int id_Tipo_Operario) {
        this.id_Tipo_Operario = id_Tipo_Operario;
    }
    public void setId_Tipo_Documento(int id_Tipo_Documento) {
        this.id_Tipo_Documento = id_Tipo_Documento;
    }
    public void setNombre_Operario(String nombre_Operario) {
        this.nombre_Operario = nombre_Operario;
    }
    public void setPassword_Operario(String password_Operario) {
        this.password_Operario = password_Operario;
    }
    public void setConfirmar_Password(String confirmar_Password) {
        this.confirmar_Password = confirmar_Password;
    }

    //Métodos Getters
    public int getId_Login() {
        return id_Login;
    }
    public int getId_Tipo_Operario() {
        return id_Tipo_Operario;
    }
    public int getId_Tipo_Documento() {
        return id_Tipo_Documento;
    }
    public String getNombre_Operario() {
        return nombre_Operario;
    }
    public String getPassword_Operario() {
        return password_Operario;
    }
    public String getConfirmar_Password() {
        return confirmar_Password;
    }

}
