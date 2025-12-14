public class TipoDocumento {
    //Definir atributos
    private int id_Tipo_Documento;
    private String nombre_Tipo_Documento;

    //Constructor sin parámetros
    public TipoDocumento() {
    }

    //Constructor con parámetros
    public TipoDocumento(int id_Tipo_Documento, String nombre_Tipo_Documento) {
        this.id_Tipo_Documento = id_Tipo_Documento;
        this.nombre_Tipo_Documento = nombre_Tipo_Documento;
    }

    //Métodos Setters
    public void setId_Tipo_Documento(int id_Tipo_Documento) {
        this.id_Tipo_Documento = id_Tipo_Documento;
    }
    public void setNombre_Tipo_Documento(String nombre_Tipo_Documento) {
        this.nombre_Tipo_Documento = nombre_Tipo_Documento;
    }

    //Métodos Getters
    public int getId_Tipo_Documento() {
        return id_Tipo_Documento;
    }
    public String getNombre_Tipo_Documento() {
        return nombre_Tipo_Documento;
    }    
}
