public class MembresiaPremium extends Membresia {
    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado) {
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Acceso Premium concedido a " + nombreUsuario + ". Visitas ilimitadas.");
        return true;
    }

    public boolean ingresarConInvitado() {
        if (pasesInvitado > 0) {
            pasesInvitado--;
            System.out.println("Acceso concedido para " + nombreUsuario + " y su invitado. Pases restantes: " + pasesInvitado);
            return true;
        } else {
            System.out.println("Acceso denegado para el invitado de " + nombreUsuario + ". No quedan pases de invitado disponibles.");
            return false;
        }
    }

    public int getPasesInvitado() {
        return pasesInvitado;
    }

    public void setPasesInvitado(int pasesInvitado) {
        this.pasesInvitado = pasesInvitado;
    }
}