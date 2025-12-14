public class TiposOperarios {
    //Definir atributos
    private int id_Tipo_Operario;
    private String nombre_Tipo_Operario;

    //Constructor sin parámetros
    public TiposOperarios() {
    }

    //Constructor con parámetros
    public TiposOperarios(int id_Tipo_Operario, String nombre_Tipo_Operario) {
        this.id_Tipo_Operario = id_Tipo_Operario;
        this.nombre_Tipo_Operario = nombre_Tipo_Operario;
    }

    //Métodos Setters
    public void setId_Tipo_Operario(int id_Tipo_Operario) {
        this.id_Tipo_Operario = id_Tipo_Operario;
    }
    public void setNombre_Tipo_Operario(String nombre_Tipo_Operario) {
        this.nombre_Tipo_Operario = nombre_Tipo_Operario;
    }

    //Métodos Getters
    public int getId_Tipo_Operario() {
        return id_Tipo_Operario;
    }
    public String getNombre_Tipo_Operario() {
        return nombre_Tipo_Operario;
    }    
}
