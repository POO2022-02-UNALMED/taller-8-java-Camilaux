package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short goles, byte dorsal){
        super(nombre,edad,"Portero");
        golesRecibidos = goles;
        this.dorsal = dorsal;
    }
    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Object elemento) {
        Portero portero = (Portero)elemento;
        int abs = Math.abs(this.getGolesRecibidos() - portero.getGolesRecibidos());
        return abs;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion()
                + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}
