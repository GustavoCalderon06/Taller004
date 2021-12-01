package interfazGrafica;

import Desaparecido.Desaparecido;
import Desastre.desastresMeteorologicos;
import Desastre.tipos;
import ventana.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GUI4 extends GUI {
    private JButton botonmenuPrincipal;
    private JButton botonModificacion;
    private JLabel label1;
    private JLabel label2;

    public GUI4(){
        super("",500,400);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        visualizarDesaparecidos();
    }

    public void visualizarDesaparecidos(){
        setLayout(null);
        setBounds(10,10,400,300);
        setTitle("Registro de desaparecidos");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label1 = new JLabel("Nombre; pais; edad; sexo; desastre");
        label1.setBounds(10,20,200,30);
        add(label1);
        ArrayList<Desaparecido> desaparecidos = new ArrayList<Desaparecido>();
        //ArrayList<desastres> desastres= new ArrayList<desastres>();
        desastresMeteorologicos desastres1 = new desastresMeteorologicos("Huracán  1876", "Santiago",
                "1939", 1999, tipos.tornados, desaparecidos);
        Desaparecido max = new Desaparecido("max","chile","22","masculino", desastres1);
        desastres1.actualizarDesaparecidos(desaparecidos,max);

        //efectivamente funciona
        // desastres1.visualizarDesapariciones(desaparecidos);
        label2= new JLabel(desaparecidos.toString());
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
            //System.exit(0);
            //JOptionPane.showMessageDialog(this, "");
        }
    }


}