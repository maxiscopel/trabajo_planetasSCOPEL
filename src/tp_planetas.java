public class tp_planetas {

    // Clase Persona
    static class Persona {
        String nombre;
        String apellidos;
        String numeroDocumentoIdentidad;
        int añoNacimiento;
        String paisNacimiento;
        char genero;

        // Constructor
        public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
            this.añoNacimiento = añoNacimiento;
            this.paisNacimiento = paisNacimiento;
            this.genero = genero;
        }

        // Métodos get y set
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getApellidos() { return apellidos; }
        public void setApellidos(String apellidos) { this.apellidos = apellidos; }
        public String getPaisNacimiento() { return paisNacimiento; }
        public void setPaisNacimiento(String paisNacimiento) { this.paisNacimiento = paisNacimiento; }
        public char getGenero() { return genero; }
        public void setGenero(char genero) { this.genero = genero; }

        // Método para imprimir atributos
        void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Número de documento: " + numeroDocumentoIdentidad);
            System.out.println("Año de nacimiento: " + añoNacimiento);
            System.out.println("País de nacimiento: " + paisNacimiento);
            System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
            System.out.println();
        }
    }

    // Clase Planeta
    static class Planeta {
        String nombre;
        int cantidadSatelites;
        double masa; // en kilogramos
        double volumen; // en km³
        int diametro; // en km
        int distanciaMediaAlSol; // en millones de km
        TipoPlaneta tipo;
        boolean observable;
        double periodoOrbital; // en años
        double periodoRotacion; // en días

        // Constructor
        public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol,
                       TipoPlaneta tipo, boolean observable, double periodoOrbital, double periodoRotacion) {
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaMediaAlSol = distanciaMediaAlSol;
            this.tipo = tipo;
            this.observable = observable;
            this.periodoOrbital = periodoOrbital;
            this.periodoRotacion = periodoRotacion;
        }

        // Métodos get y set
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public double getDensidad() { return masa / volumen; }
        public boolean esPlanetaExterior() {
            double distanciaUA = distanciaMediaAlSol / 149.597870; // Convertir a UA
            return distanciaUA > 3.4;
        }

        // Método para imprimir atributos
        void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de satélites: " + cantidadSatelites);
            System.out.println("Masa (kg): " + masa);
            System.out.println("Volumen (km³): " + volumen);
            System.out.println("Diámetro (km): " + diametro);
            System.out.println("Distancia media al Sol (millones km): " + distanciaMediaAlSol);
            System.out.println("Tipo: " + tipo);
            System.out.println("Observable: " + observable);
            System.out.println("Periodo orbital (años): " + periodoOrbital);
            System.out.println("Periodo de rotación (días): " + periodoRotacion);
            System.out.println("Densidad (kg/km³): " + getDensidad());
            System.out.println("Es un planeta exterior: " + esPlanetaExterior());
            System.out.println();
        }
    }

    // Enum TipoPlaneta
    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // Método main
    public static void main(String[] args) {
        // Crear objetos Persona
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Colombia", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Argentina", 'M');

        System.out.println("Datos de las personas:");
        p1.imprimir();
        p2.imprimir();

        // Crear objetos Planeta
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 149, TipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        System.out.println("Datos de los planetas:");
        tierra.imprimir();
        jupiter.imprimir();
    }
}