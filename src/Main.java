import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Membresia> membresias = new ArrayList<>();

        MembresiaBasica basica = new MembresiaBasica("MB-001", "Carlos Mendoza", 2);
        MembresiaPremium premium = new MembresiaPremium("MP-002", "Ana Lopez", 1);

        membresias.add(basica);
        membresias.add(premium);

        for (Membresia m : membresias) {
            m.mostrarDatos();
        }

        System.out.println("\n--- Simulación de accesos al torniquete ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nIntento de acceso #" + i + ":");
            for (Membresia m : membresias) {
                m.verificarAcceso();
            }
        }

        System.out.println("\n--- Prueba de acceso con invitado (Membresia Premium) ---");
        premium.ingresarConInvitado();
        premium.ingresarConInvitado();
    }
}