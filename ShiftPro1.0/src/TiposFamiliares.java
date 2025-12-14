public class TiposFamiliares{
    //Definir atributos
    private int id_Tipo_Familiar;
    private String nombre_Tipo_Familiar;

    //Constructor sin parámetros
    public TiposFamiliares() {
    }

    //Constructor con parámetros
    public TiposFamiliares(int id_Tipo_Familiar, String nombre_Tipo_Familiar) {
        this.id_Tipo_Familiar = id_Tipo_Familiar;
        this.nombre_Tipo_Familiar = nombre_Tipo_Familiar;
    }

    //Métodos Setters
    public void setId_Tipo_Familiar(int id_Tipo_Familiar) {
        this.id_Tipo_Familiar = id_Tipo_Familiar;
    }
    public void setNombre_Tipo_Familiar(String nombre_Tipo_Familiar) {
        this.nombre_Tipo_Familiar = nombre_Tipo_Familiar;
    }
    //Métodos Getters
    public int getId_Tipo_Familiar() {
        return id_Tipo_Familiar;
    }
    public String getNombre_Tipo_Familiar() {
        return nombre_Tipo_Familiar;
    }
}
