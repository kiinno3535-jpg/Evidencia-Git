public class Asignar {
    //Definir atributos
    private int id_Asignar;
    private int id_Turno;
    private int id_Login;
    private String fecha_Hora_Registro;

    //Constructor sin Parametros
    public Asignar() {
    }
    
    //Constructor con Parametros
    public Asignar(int id_Asignar, int id_Turno, int id_Login, String fecha_Hora_Registro) {
        this.id_Asignar = id_Asignar;
        this.id_Turno = id_Turno;
        this.id_Login = id_Login;
        this.fecha_Hora_Registro = fecha_Hora_Registro;
    }

    //Métodos Setters
    public void setId_Asignar(int id_Asignar) {
        this.id_Asignar = id_Asignar;
    }
    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }
    public void setId_Login(int id_Login) {
        this.id_Login = id_Login;
    }
    public void setFecha_Hora_Registro(String fecha_Hora_Registro) {
        this.fecha_Hora_Registro = fecha_Hora_Registro;
    }

    //Métodos Getters
    public int getId_Asignar() {
        return id_Asignar;
    }
    public int getId_Turno() {
        return id_Turno;
    }
    public int getId_Login() {
        return id_Login;
    }
    public String getFecha_Hora_Registro() {
        return fecha_Hora_Registro;
    }
}
