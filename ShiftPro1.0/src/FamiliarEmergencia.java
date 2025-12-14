public class FamiliarEmergencia {
    //Definir atributos
    private int id_Documento_Familiar;
    private int id_Tipo_Familiar;
    private int id_Tipo_Documento;
    private String nombre_Familiar;
    private String Parentesco;
    private String telefono_Familiar;
    private String correo_Familiar;

    //Constructor sin parámetros   
    public FamiliarEmergencia() {
    }
    
    //Constructor con parámetros
    public FamiliarEmergencia(int id_Documento_Familiar, int id_Tipo_Familiar, int id_Tipo_Documento, String nombre_Familiar, String Parentesco, String telefono_Familiar, String correo_Familiar) {
        this.id_Documento_Familiar = id_Documento_Familiar;
        this.id_Tipo_Familiar = id_Tipo_Familiar;
        this.id_Tipo_Documento = id_Tipo_Documento;
        this.nombre_Familiar = nombre_Familiar;
        this.Parentesco = Parentesco;
        this.telefono_Familiar = telefono_Familiar;
        this.correo_Familiar = correo_Familiar;
    }

    //Métodos Setters
    public void setId_Documento_Familiar(int id_Documento_Familiar) {
        this.id_Documento_Familiar = id_Documento_Familiar;
    }
    public void setId_Tipo_Familiar(int id_Tipo_Familiar) {
        this.id_Tipo_Familiar = id_Tipo_Familiar;
    }
    public void setId_Tipo_Documento(int id_Tipo_Documento) {
        this.id_Tipo_Documento = id_Tipo_Documento;
    }
    public void setNombre_Familiar(String nombre_Familiar) {
        this.nombre_Familiar = nombre_Familiar;
    }
    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }
    public void setTelefono_Familiar(String telefono_Familiar) {
        this.telefono_Familiar = telefono_Familiar;
    }
    public void setCorreo_Familiar(String correo_Familiar) {
        this.correo_Familiar = correo_Familiar;
    }

    //Métodos Getters
    public int getId_Documento_Familiar() {
        return id_Documento_Familiar;
    }
    public int getId_Tipo_Familiar() {
        return id_Tipo_Familiar;
    }
    public int getId_Tipo_Documento() {
        return id_Tipo_Documento;
    }
    public String getNombre_Familiar() {
        return nombre_Familiar;
    }
    public String getParentesco() {
        return Parentesco;
    }
    public String getTelefono_Familiar() {
        return telefono_Familiar;
    }
    public String getCorreo_Familiar() {
        return correo_Familiar;
    }
}
