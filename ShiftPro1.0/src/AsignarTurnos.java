
import java.util.Date;

public class AsignarTurnos {

    //Definir atributos
    private int id_Asignar;
    private int id_Turno;
    private String fecha_Entrada_Salida;
    private String entrada_Salida;

    //Constructor sin Parametros
    public AsignarTurnos() {

}

//Constructor con Parametros
    public AsignarTurnos(int id_Asignar, int id_Turno, String fecha_Entrada_Salida, String entrada_Salida) {
        this.id_Asignar = id_Asignar;
        this.id_Turno = id_Turno;
        this.fecha_Entrada_Salida = fecha_Entrada_Salida;
        this.entrada_Salida = entrada_Salida;
    }

    //Métodos Setters
    public void setId_Asignar(int id_Asignar) {
        this.id_Asignar = id_Asignar;
    }
    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }
    public void setFecha_Entrada_Salida(String fecha_Entrada_Salida) {
        this.fecha_Entrada_Salida = fecha_Entrada_Salida;
    }
    public void setEntrada_Salida(String entrada_Salida) {
        this.entrada_Salida = entrada_Salida;
    }

    //Métodos Getters
    public int getId_Asignar() {
        return id_Asignar;
    }
    public int getId_Turno() {
        return id_Turno;
    }
    public String getFecha_Entrada_Salida() {
        return fecha_Entrada_Salida;
    }
    public String getEntrada_Salida() {
        return entrada_Salida;
    }
}