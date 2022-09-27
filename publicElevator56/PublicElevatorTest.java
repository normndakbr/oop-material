// Percobaan 6
package publicElevator56;

public class PublicElevatorTest {
    public static void main(String[] args) {
        PublicElevator pubElevator = new PublicElevator();

        pubElevator.bukaPintu = true;
        pubElevator.bukaPintu = false;
        pubElevator.lantaiSkrg--;
        pubElevator.lantaiSkrg++;
        pubElevator.lantaiSkrg = 7;
        pubElevator.bukaPintu = true;
        pubElevator.bukaPintu = false;
        pubElevator.lantaiSkrg = 1;
        pubElevator.bukaPintu = true;
        pubElevator.lantaiSkrg++;
        pubElevator.bukaPintu = false;
        pubElevator.lantaiSkrg--;
        pubElevator.lantaiSkrg--;
    }
}
