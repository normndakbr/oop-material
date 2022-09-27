// Percobaan 7
package privateElevator7;

public class PrivateElevatorTest {
    public static void main(String[] args) {
        PrivateElevator privElevator = new PrivateElevator();

        privElevator.bukaPintu = true;
        privElevator.bukaPintu = false;
        privElevator.lantaiSkrg--;
        privElevator.lantaiSkrg++;
        privElevator.lantaiSkrg = 7;
        privElevator.bukaPintu = true;
        privElevator.bukaPintu = false;
        privElevator.lantaiSkrg = 1;
        privElevator.bukaPintu = true;
        privElevator.lantaiSkrg++;
        privElevator.bukaPintu = false;
        privElevator.lantaiSkrg--;
        privElevator.lantaiSkrg--;
    }
}
