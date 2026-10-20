import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends  JFrame{

    public Main() {
        JLabel lblSaludo = new JLabel("Hola Mundo. \nCreando mi primer ejemplo");
        add(lblSaludo);

        // Aumentamos el tamaño de la ventana, le añadimos un titulo único
        // y le indicamos que hacer cuando cerrar la ventana
        this.setSize(400,200);
        this.setTitle("JFrame by vjimmes2003");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // para poder ver la ventana hay que poner esta línea
        this.setVisible(true);

    }
    public static void main(String[] args){
        Main main = new Main();
    }
}