public class Turnos {
   private int id_Turno;
   private int id_Tipo_Area;
    private String nombre_Turno;
    private String jornada;
    private String hora_Entrada;
    private String hora_Salida;
    private String fecha_Turno;
    private String Observaciones;

    //Constructor sin Parametros
    public Turnos() {

    }

    //Constructor con Parametros
    public Turnos(int id_Turno, int id_Tipo_Area, String nombre_Turno, String jornada, String hora_Entrada, String hora_Salida, String fecha_Turno, String Observaciones) {
        this.id_Turno = id_Turno;
        this.id_Tipo_Area = id_Tipo_Area;
        this.nombre_Turno = nombre_Turno;
        this.jornada = jornada;
        this.hora_Entrada = hora_Entrada;
        this.hora_Salida = hora_Salida;
        this.fecha_Turno = fecha_Turno;
        this.Observaciones = Observaciones;
    }

    //Métodos Setters
    public void setId_Turno(int id_Turno) {
        this.id_Turno = id_Turno;
    }
    public void setId_Tipo_Area(int id_Tipo_Area) {
        this.id_Tipo_Area = id_Tipo_Area;
    }
    public void setNombre_Turno(String nombre_Turno) {
        this.nombre_Turno = nombre_Turno;
    }
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    public void setHora_Entrada(String hora_Entrada) {
        this.hora_Entrada = hora_Entrada;
    }
    public void setHora_Salida(String hora_Salida) {
        this.hora_Salida = hora_Salida;
    }
    public void setFecha_Turno(String fecha_Turno) {
        this.fecha_Turno = fecha_Turno;
    }
    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    //Métodos Getters
    public int getId_Turno() {
        return id_Turno;
    }
    public int getId_Tipo_Area() {
        return id_Tipo_Area;
    }
    public String getNombre_Turno() {
        return nombre_Turno;
    }
    public String getJornada() {
        return jornada;
    }
    public String getHora_Entrada() {
        return hora_Entrada;
    }
    public String getHora_Salida() {
        return hora_Salida;
    }
    public String getFecha_Turno() {
        return fecha_Turno;
    }
    public String getObservaciones() {
        return Observaciones;
    }
}
