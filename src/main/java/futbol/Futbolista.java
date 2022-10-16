package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private final String posicion ;

    public Futbolista(String nombre, int edad, final String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        nombre = "Maradona";
        edad = 30;
        posicion = "delantero";
    }

    public boolean equals(Futbolista f){
        if(this == f){
            return true;
        }
        if(f == null) {
            return false;
        }
        return false;
    }

    public abstract boolean jugarConLasManos();

    public int compareTo(Futbolista futbolista){
        if(this.nombre == futbolista.getNombre() ){
            return 0;
        }
        else return 1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }
    @Override
    public String toString() {
        return "El futbolista " + nombre + "tiene " + edad + ", y juega de " + posicion;
    }

}
