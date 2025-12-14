public class TipoArea {
    //Definir atributos
    private int id_Tipo_Area;
    private String nombre_Area;
    
    //Constructor sin parámetros
    public TipoArea() {   
}
    //Constructor con parámetros
    public TipoArea(int id_Tipo_Area, String nombre_Area) {
        this.id_Tipo_Area = id_Tipo_Area;
        this.nombre_Area = nombre_Area;
    }
    //Métodos Setters
    public void setId_Tipo_Area(int id_Tipo_Area) {
        this.id_Tipo_Area = id_Tipo_Area;
    }
    public void setNombre_Area(String nombre_Area) {
        this.nombre_Area = nombre_Area;
    }
    //Métodos Getters
    public int getId_Tipo_Area() {
        return id_Tipo_Area;
    }
    public String getNombre_Area() {
        return nombre_Area;
    }
}
