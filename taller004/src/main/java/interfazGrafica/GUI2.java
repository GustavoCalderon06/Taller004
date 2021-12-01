package interfazGrafica;

import Desaparecido.Desaparecido;
import Desastre.desastresMeteorologicos;
import Desastre.tipos;
import ventana.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GUI2 extends GUI {
    private JButton botonmenuPrincipal;
    private JButton botonModificacion;
    private JLabel label1;
    private JLabel label2;

    public GUI2(){
        super("",500,400);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        detalleDesastre();
    }

    private void detalleDesastre(){
        setLayout(null);
        setTitle("Registro de desastres");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label1 = new JLabel("Nombre; lugar; fecha; tipo");
        label1.setBounds(10,20,200,30);
        add(label1);
        ArrayList<desastresMeteorologicos> desastresMeteorologicos = new ArrayList<desastresMeteorologicos>();
        ArrayList<Desaparecido> desaparecidos = new ArrayList<Desaparecido>();
        desastresMeteorologicos.add(new desastresMeteorologicos("Tornado del 2000", "Valdivia",
                "2000", 2832, tipos.tornados, desaparecidos));

        //label2 = new JLabel(desastres.toString());
        label2= new JLabel(desastresMeteorologicos.toString());
        label2.setBounds(10,30,200,30);
        add(label2);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonmenuPrincipal) {
            GUI3 bienvenida = new GUI3();
            this.dispose();
            System.exit(0);
        }
        if (e.getSource() == this.botonModificacion) {
            GUI4 bienvenida = new GUI4();
            this.dispose();
            System.exit(0);
            //JOptionPane.showMessageDialog(this, "");
        }
    }
}

