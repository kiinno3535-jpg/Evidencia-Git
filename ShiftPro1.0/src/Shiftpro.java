public class Shiftpro {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Mundo!");

        System.out.println("-----EMPLEADOS-----");

        //Crear un objeto de la clase Empleados usando el constructor con parámetros
        Empleados empleado1 = new Empleados(111245632, 1, 1, "Jhon Quintero", "Calle 58 sur#27-56", "3102569874", "neonk@gmail.com");
        //Mostrar los Datos del empleado usando el metodo Getter
        System.out.println("Id Documento: " + empleado1.getId_Documento());
        System.out.println("Tipo Empleado: " + empleado1.getId_Tipo_Empleado());
        System.out.println("Tipo Documento: " + empleado1.getId_Tipo_Documento());
        System.out.println("Nombre Empleado: " + empleado1.getNombre_Empleado());
        System.out.println("Dirección: " + empleado1.getDireccion());
        System.out.println("Teléfono Empleado: " + empleado1.getTelefono_Empleado());
        System.out.println("Correo Empleado: " + empleado1.getCorreo_Empleado());

        //Crear un objeto usando el constructor sin parámetros
        Empleados empleado2 = new Empleados();
        //Asignar valores a los atributos usando los métodos Setters
        empleado2.setId_Documento(987654321);
        empleado2.setId_Tipo_Empleado(2);
        empleado2.setId_Tipo_Documento(2);
        empleado2.setNombre_Empleado("Nomad Smith");
        empleado2.setDireccion("Carrera 45#23-78");
        empleado2.setTelefono_Empleado("3204567890");
        empleado2.setCorreo_Empleado("nommad@gmail.com"); 

        //Mostrar los Datos del empleado2 usando el metodo Getter
        System.out.println("Id Documento: " + empleado2.getId_Documento());
        System.out.println("Tipo Empleado: " + empleado2.getId_Tipo_Empleado());
        System.out.println("Tipo Documento: " + empleado2.getId_Tipo_Documento());
        System.out.println("Nombre Empleado: " + empleado2.getNombre_Empleado());
        System.out.println("Dirección: " + empleado2.getDireccion());
        System.out.println("Teléfono Empleado: " + empleado2.getTelefono_Empleado());
        System.out.println("Correo Empleado: " + empleado2.getCorreo_Empleado());


        System.out.println("-----ASIGNAR-----");


        //Crear un objeto de la clase Asignar usando el constructor con parámetros
        Asignar asignar1 = new Asignar(1, 1, 111245632, "202-12-15 06:00:00");
        //Mostrar los Datos del Asignar usando el metodo Getter
         System.out.println("Id Asignar: " + asignar1.getId_Asignar());
         System.out.println("Id Turno: " + asignar1.getId_Turno());
         System.out.println("Id Login: " + asignar1.getId_Login()); 
         System.out.println("Fecha Hora Registro: " + asignar1.getFecha_Hora_Registro());
        
        //Crear un objeto usando el constructor sin parámetros
        Asignar asignar2 = new Asignar();
        //Asignar valores a los atributos usando los métodos Setters
        asignar2.setId_Asignar(2);
        asignar2.setId_Turno(2);
        asignar2.setId_Login(987654321);
        asignar2.setFecha_Hora_Registro("2025-12-16 14");

        //Mostrar los Datos del Asignar2 usando el metodo Getter
        System.out.println("Id Asignar: " + asignar2.getId_Asignar());
        System.out.println("Id Turno: " + asignar2.getId_Turno());
        System.out.println("Id Login: " + asignar2.getId_Login());
        System.out.println("Fecha Hora Registro: " + asignar2.getFecha_Hora_Registro());

       
        System.out.println("-----TIPOS-----");


        //Crear un objeto de la clase TipoDocumento usando el constructor con parámetros
        TipoDocumento tipoDoc1 = new TipoDocumento(1, "Cédula de Ciudadanía");
        //Mostrar los Datos del TipoDocumento usando el metodo Getter
        System.out.println("Id Tipo Documento: " + tipoDoc1.getId_Tipo_Documento());
        System.out.println("Nombre Tipo Documento: " + tipoDoc1.getNombre_Tipo_Documento());   

        //Crear un objeto usando el constructor sin parámetros
        TipoDocumento tipoDoc2 = new TipoDocumento();

        //Asignar valores a los atributos usando los métodos Setters
        tipoDoc2.setId_Tipo_Documento(2);
        tipoDoc2.setNombre_Tipo_Documento("Cedula de Extranjería");

        //Mostrar los Datos del TipoDocumento2 usando el metodo Getter
        System.out.println("Id Tipo Documento: " + tipoDoc2.getId_Tipo_Documento());
        System.out.println("Nombre Tipo Documento: " + tipoDoc2.getNombre_Tipo_Documento());

        System.out.println("-----TIPOS EMPLEADOS-----");

        //Crear un objeto de la clase TiposEmpleados usando el constructor con parámetros
        TiposEmpleados tipoEmp1 = new TiposEmpleados(1, "Administrativo");
        //Mostrar los Datos del TiposEmpleados usando el metodo Getter
        System.out.println("Id Tipo Empleado: " + tipoEmp1.getId_Tipo_Empleado());
        System.out.println("Nombre Tipo Empleado: " + tipoEmp1.getNombre_Tipo_Empleado());

        //Crear un objeto usando el constructor sin parámetros
        TiposEmpleados tipoEmp2 = new TiposEmpleados();

        //Asignar valores a los atributos usando los métodos Setters
        tipoEmp2.setId_Tipo_Empleado(2);
        tipoEmp2.setNombre_Tipo_Empleado("Operativo");

        //Mostrar los Datos del TiposEmpleados2 usando el metodo Getter
        System.out.println("Id Tipo Empleado: " + tipoEmp2.getId_Tipo_Empleado());
        System.out.println("Nombre Tipo Empleado: " + tipoEmp2.getNombre_Tipo_Empleado());

        System.out.println("-----TIPOS AREAS-----");

        //Crear un objeto de la clase TipoArea usando el constructor con parámetros
        TipoArea tipoArea1 = new TipoArea(1, "Recursos Humanos");
        //Mostrar los Datos del TipoArea usando el metodo Getter
        System.out.println("Id Tipo Area: " + tipoArea1.getId_Tipo_Area());
        System.out.println("Nombre Tipo Area: " + tipoArea1.getNombre_Area());

        //Crear un objeto usando el constructor sin parámetros
        TipoArea tipoArea2 = new TipoArea();
        //Asignar valores a los atributos usando los métodos Setters
        tipoArea2.setId_Tipo_Area(2);
        tipoArea2.setNombre_Area("Almacén");

        //Mostrar los Datos del TipoArea2 usando el metodo Getter
        System.out.println("Id Tipo Area: " + tipoArea2.getId_Tipo_Area());
        System.out.println("Nombre Tipo Area: " + tipoArea2.getNombre_Area());

        System.out.println("-----TIPOS FAMILIARES-----");

        //Crear un objeto de la clase TiposFamiliares usando el constructor con parámetros
        TiposFamiliares tipoFam1 = new TiposFamiliares(1, "Cónyuge");
        //Mostrar los Datos del TiposFamiliares usando el metodo Getter
        System.out.println("Id Tipo Familiar: " + tipoFam1.getId_Tipo_Familiar());
        System.out.println("Nombre Tipo Familiar: " + tipoFam1.getNombre_Tipo_Familiar());

        //Crear un objeto usando el constructor sin parámetros
        TiposFamiliares tipoFam2 = new TiposFamiliares();

        //Asignar valores a los atributos usando los métodos Setters
        tipoFam2.setId_Tipo_Familiar(2);
        tipoFam2.setNombre_Tipo_Familiar("Hijo");

        //Mostrar los Datos del TiposFamiliares2 usando el metodo Getter
        System.out.println("Id Tipo Familiar: " + tipoFam2.getId_Tipo_Familiar());
        System.out.println("Nombre Tipo Familiar: " + tipoFam2.getNombre_Tipo_Familiar());

        System.out.println("-----TIPOS OPERARIOS-----");

        //Crear un objeto de la clase TiposOperarios usando el constructor con parámetros
        TiposOperarios tipoOpe1 = new TiposOperarios(1, "Desarrollador");
        //Mostrar los Datos del TiposOperarios usando el metodo Getter
        System.out.println("Id Tipo Operario: " + tipoOpe1.getId_Tipo_Operario());
        System.out.println("Nombre Tipo Operario: " + tipoOpe1.getNombre_Tipo_Operario());

        //Crear un objeto usando el constructor sin parámetros
        TiposOperarios tipoOpe2 = new TiposOperarios();

        //Asignar valores a los atributos usando los métodos Setters
        tipoOpe2.setId_Tipo_Operario(2);
        tipoOpe2.setNombre_Tipo_Operario("AdministardorBD");

        //Mostrar los Datos del TiposOperarios2 usando el metodo Getter
        System.out.println("Id Tipo Operario: " + tipoOpe2.getId_Tipo_Operario());
        System.out.println("Nombre Tipo Operario: " + tipoOpe2.getNombre_Tipo_Operario());

        System.out.println("-----OPERARIOS-----");

        //Crear un objeto de la clase Operarios usando el constructor con parámetros
        Operarios operario1 = new Operarios(111245632, 1, 1, "Jhon Quintero", "neonk1234", "neonk1234");        
        //Mostrar los Datos del Operarios usando el metodo Getter
        System.out.println("Id Login: " + operario1.getId_Login());
        System.out.println("Id Tipo Operario: " + operario1.getId_Tipo_Operario());
        System.out.println("Id Tipo Documento: " + operario1.getId_Tipo_Documento());
        System.out.println("Nombre Operario: " + operario1.getNombre_Operario());
        System.out.println("Password Operario: " + operario1.getPassword_Operario());
        System.out.println("Confirmar Password: " + operario1.getConfirmar_Password());

        //Crear un objeto usando el constructor sin parámetros
        Operarios operario2 = new Operarios();

        //Asignar valores a los atributos usando los métodos Setters
        operario2.setId_Login(2);
        operario2.setId_Tipo_Operario(987654321);
        operario2.setId_Tipo_Documento(2);
        operario2.setNombre_Operario("AdministardorBD");
        operario2.setPassword_Operario("admin1234");
        operario2.setConfirmar_Password("admin1234");

        //Mostrar los Datos del Operarios2 usando el metodo Getter
        System.out.println("Id Login: " + operario2.getId_Login());
        System.out.println("Id Tipo Operario: " + operario2.getId_Tipo_Operario());
        System.out.println("Id Tipo Documento: " + operario2.getId_Tipo_Documento());
        System.out.println("Nombre Operario: " + operario2.getNombre_Operario());
        System.out.println("Password Operario: " + operario2.getPassword_Operario());
        System.out.println("Confirmar Password: " + operario2.getConfirmar_Password());

        System.out.println("-----FAMILIARES DE EMERGENCIA-----");

        //Crear un objeto de la clase FamiliarEmergencia usando el constructor con parámetros
        FamiliarEmergencia famEmerg1 = new FamiliarEmergencia(112233445, 1, 1, "Maria Lopez", "Madre", "3109876543", "MariaQ@gmail.com");
        //Mostrar los Datos del FamiliarEmergencia usando el metodo Getter
        System.out.println("Id Documento Familiar: " + famEmerg1.getId_Documento_Familiar());
        System.out.println("Id Tipo Familiar: " + famEmerg1.getId_Tipo_Familiar());
        System.out.println("Id Tipo Documento: " + famEmerg1.getId_Tipo_Documento());
        System.out.println("Nombre Familiar: " + famEmerg1.getNombre_Familiar());
        System.out.println("Parentesco: " + famEmerg1.getParentesco());
        System.out.println("Teléfono Familiar: " + famEmerg1.getTelefono_Familiar());
        System.out.println("Correo Familiar: " + famEmerg1.getCorreo_Familiar());

        //Crear un objeto usando el constructor sin parámetros
        FamiliarEmergencia famEmerg2 = new FamiliarEmergencia();

        //Asignar valores a los atributos usando los métodos Setters
        famEmerg2.setId_Documento_Familiar(554433221);
        famEmerg2.setId_Tipo_Familiar(2);
        famEmerg2.setId_Tipo_Documento(2);
        famEmerg2.setNombre_Familiar("Carlos Quintero");
        famEmerg2.setParentesco("Padre");
        famEmerg2.setTelefono_Familiar("3201234567");
        famEmerg2.setCorreo_Familiar("carlosQ@gmail.com");

        //Mostrar los Datos del FamiliarEmergencia2 usando el metodo Getter
        System.out.println("Id Documento Familiar: " + famEmerg2.getId_Documento_Familiar());
        System.out.println("Id Tipo Familiar: " + famEmerg2.getId_Tipo_Familiar());
        System.out.println("Id Tipo Documento: " + famEmerg2.getId_Tipo_Documento());
        System.out.println("Nombre Familiar: " + famEmerg2.getNombre_Familiar());
        System.out.println("Parentesco: " + famEmerg2.getParentesco());
        System.out.println("Teléfono Familiar: " + famEmerg2.getTelefono_Familiar());
        System.out.println("Correo Familiar: " + famEmerg2.getCorreo_Familiar());


        System.out.println("-----TURNOS-----");

        //Crear un objeto de la clase Turnos usando el constructor con parámetros
        Turnos turno1 = new Turnos(1, 1,"Administrativo", "Mañana", "06:00:00", "14:00:00", "2024-12-15", "Turno para labores administrativas");

        //Mostrar los Datos del Turnos usando el metodo Getter
        System.out.println("Id Turno: " + turno1.getId_Turno());
        System.out.println("Id Tipo Area: " + turno1.getId_Tipo_Area());
        System.out.println("Nombre Turno: " + turno1.getNombre_Turno());
        System.out.println("Jornada: " + turno1.getJornada());
        System.out.println("Hora Entrada: " + turno1.getHora_Entrada());
        System.out.println("Hora Salida: " + turno1.getHora_Salida());
        System.out.println("Fecha Turno: " + turno1.getFecha_Turno());
        System.out.println("Observaciones: " + turno1.getObservaciones());

        //Crear un objeto usando el constructor sin parámetros
        Turnos turno2 = new Turnos();

        //Asignar valores a los atributos usando los métodos Setters
        turno2.setId_Turno(2);
        turno2.setId_Tipo_Area(2);
        turno2.setNombre_Turno("Operativo");
        turno2.setJornada("Tarde");
        turno2.setHora_Entrada("14:00:00");
        turno2.setHora_Salida("22:00:00");
        turno2.setFecha_Turno("2024-12-16");
        turno2.setObservaciones("Turno para labores operativas");

        //Mostrar los Datos del Turnos2 usando el metodo Getter
        System.out.println("Id Turno: " + turno2.getId_Turno());
        System.out.println("Id Tipo Area: " + turno2.getId_Tipo_Area());
        System.out.println("Nombre Turno: " + turno2.getNombre_Turno());
        System.out.println("Jornada: " + turno2.getJornada());
        System.out.println("Hora Entrada: " + turno2.getHora_Entrada());
        System.out.println("Hora Salida: " + turno2.getHora_Salida());
        System.out.println("Fecha Turno: " + turno2.getFecha_Turno());
        System.out.println("Observaciones: " + turno2.getObservaciones());

        System.out.println("-----ASIGNAR TURNOS-----");

        //Crear un objeto de la clase AsignarTurnos usando el constructor con parámetros
        AsignarTurnos asignarTurno1 = new AsignarTurnos(1, 1, "2025-12-15", "Entrada");

        //Mostrar los Datos del AsignarTurnos usando el metodo Getter
        System.out.println("Id Asignar: " + asignarTurno1.getId_Asignar());
        System.out.println("Id Turno: " + asignarTurno1.getId_Turno());
        System.out.println("Fecha Entrada Salida: " + asignarTurno1.getFecha_Entrada_Salida());
        System.out.println("Entrada Salida: " + asignarTurno1.getEntrada_Salida());

        //Crear un objeto usando el constructor sin parámetros
        AsignarTurnos asignarTurno2 = new AsignarTurnos();

        //Asignar valores a los atributos usando los métodos Setters
        asignarTurno2.setId_Asignar(2);
        asignarTurno2.setId_Turno(2);
        asignarTurno2.setFecha_Entrada_Salida("2025-12-16");
        asignarTurno2.setEntrada_Salida("Salida");

        //Mostrar los Datos del AsignarTurnos2 usando el metodo Getter
        System.out.println("Id Asignar: " + asignarTurno2.getId_Asignar());
        System.out.println("Id Turno: " + asignarTurno2.getId_Turno());
        System.out.println("Fecha Entrada Salida: " + asignarTurno2.getFecha_Entrada_Salida());
        System.out.println("Entrada Salida: " + asignarTurno2.getEntrada_Salida());

    }
}


      