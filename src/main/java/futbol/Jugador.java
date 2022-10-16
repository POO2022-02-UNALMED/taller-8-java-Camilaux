package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre,int edad, String posicion, short goles, byte dorsal){
        super(nombre,edad,posicion);
        golesMarcados = goles;
        this.dorsal = dorsal;
    }

    public Jugador (){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public int compareTo(Object elemento) {
        Jugador jugador = (Jugador) elemento;
        int abs = Math.abs(this.getEdad() - jugador.getEdad());
        return abs;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() +
                " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
