package interfazGrafica;


import ventana.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUI3 extends GUI {
    private JLabel label1;
    private JLabel label2;
    private JLabel bienvenida;
    private JButton botonUno;
    private JButton botonDos;

    public GUI3(){
        super("",500,400);
        generarTitulo();
        botonDetalle();
        botonVisualizar();
    }

    private void generarTitulo(){
        String textoBienvenida = "Registro ";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida,20,30,500,30);
    }

    private void botonDetalle(){
        String textoBoton = "Detalle Registro";
        this.botonUno = super.generarBoton(textoBoton,175,100,150,40);
        this.add(this.botonUno);
        this.botonUno.addActionListener(this);
    }

    private void botonVisualizar(){
        String textoBoton = "Desaparecidos";
        this.botonDos = super.generarBoton(textoBoton,175,200,150,40);
        this.add(this.botonDos);
        this.botonDos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.botonUno){
            GUI2 ventanaInstrucciones = new GUI2();
        }
        if(e.getSource() == this.botonDos){
            GUI4 ventanaInstrucciones = new GUI4();
        }
    }
}
