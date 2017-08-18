
import java.awt.EventQueue;
import visao.PrincipalJFrame;

/*
* @author (name=Felipe Vieira Baehr, date=
 */
public class Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PrincipalJFrame principal = new PrincipalJFrame();
            }
        });
    }
}
