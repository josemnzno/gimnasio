public class MembresiaBasica extends Membresia {
    private int visitasRestantes;

    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasRestantes) {
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            visitasRestantes--;
            System.out.println("Acceso concedido a " + nombreUsuario + ". Visitas restantes: " + visitasRestantes);
            return true;
        } else {
            System.out.println("Acceso denegado a " + nombreUsuario + ". No le quedan visitas disponibles.");
            return false;
        }
    }

    public int getVisitasRestantes() {
        return visitasRestantes;
    }

    public void setVisitasRestantes(int visitasRestantes) {
        this.visitasRestantes = visitasRestantes;
    }
}