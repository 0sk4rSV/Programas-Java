/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import logica.LogPrincipal;
import oovv.Circulo;
import oovv.Cuadrado;
import oovv.Figura;
import oovv.MiEX;
import oovv.Rectangulo;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class MiVentana extends javax.swing.JFrame {

    /**
     * Creates new form MiVentana
     */
    public MiVentana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bEliminaXY = new javax.swing.JButton();
        bSumaAreas = new javax.swing.JButton();
        bVerDistanciaEntre2Figuras = new javax.swing.JButton();
        bCreaRectangulo = new javax.swing.JButton();
        jlX = new javax.swing.JLabel();
        tfX = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        tfY = new javax.swing.JTextField();
        bCreaCirculo = new javax.swing.JButton();
        tfAnchura = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        jlAnchura = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        tfRadio = new javax.swing.JTextField();
        jlRadio = new javax.swing.JLabel();
        bEliminaTodas = new javax.swing.JButton();
        bLista = new javax.swing.JButton();
        bCreaCuadrado = new javax.swing.JButton();
        jlLado = new javax.swing.JLabel();
        tfLado = new javax.swing.JTextField();
        bSumaPerimetros = new javax.swing.JButton();
        bEliminaRango = new javax.swing.JButton();
        jlRango = new javax.swing.JLabel();
        tfRangoFin = new javax.swing.JTextField();
        tfRangoIni = new javax.swing.JTextField();
        rbArea = new javax.swing.JRadioButton();
        rbPerimetro = new javax.swing.JRadioButton();
        jlGuion = new javax.swing.JLabel();
        bAñadeFigurasRandom = new javax.swing.JButton();
        bSumaFigurasZona = new javax.swing.JButton();
        bVerFAreaGrandePequeña = new javax.swing.JButton();
        bVerDistanciaFigurasPunto = new javax.swing.JButton();
        bSalir5 = new javax.swing.JButton();
        bVerFPerimetroGrandePequeño = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bEliminaXY.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bEliminaXY.setText("eliminaXY");
        bEliminaXY.setActionCommand("eliminafiguraXY");
        bEliminaXY.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bSumaAreas.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bSumaAreas.setText("suma áreas");
        bSumaAreas.setActionCommand("sumaareas");
        bSumaAreas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bVerDistanciaEntre2Figuras.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bVerDistanciaEntre2Figuras.setText("ver distancia entre dos figuras");
        bVerDistanciaEntre2Figuras.setActionCommand("salir");
        bVerDistanciaEntre2Figuras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bVerDistanciaEntre2Figuras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bCreaRectangulo.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bCreaRectangulo.setText("crea RECTÁNGULO");
        bCreaRectangulo.setActionCommand("crearectangulo");
        bCreaRectangulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jlX.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlX.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlX.setText("X");

        tfX.setColumns(5);
        tfX.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfX.setText("0");

        jlY.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlY.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlY.setText("Y");

        tfY.setColumns(5);
        tfY.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfY.setText("0");

        bCreaCirculo.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bCreaCirculo.setText("crea CÍRCULO");
        bCreaCirculo.setActionCommand("creacirculo");
        bCreaCirculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        tfAnchura.setColumns(5);
        tfAnchura.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfAnchura.setText("0");

        tfAltura.setColumns(5);
        tfAltura.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfAltura.setText("0");

        jlAnchura.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlAnchura.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlAnchura.setText("Anchura");

        jlAltura.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlAltura.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlAltura.setText("Altura");

        tfRadio.setColumns(5);
        tfRadio.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfRadio.setText("0");

        jlRadio.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlRadio.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlRadio.setText("Radio");

        bEliminaTodas.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bEliminaTodas.setText("elimina todas");
        bEliminaTodas.setActionCommand("eliminafiguras");
        bEliminaTodas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bLista.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bLista.setText("lista");
        bLista.setActionCommand("listafiguras");
        bLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bCreaCuadrado.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bCreaCuadrado.setText("crea CUADRADO");
        bCreaCuadrado.setActionCommand("creacuadrado");
        bCreaCuadrado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jlLado.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlLado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlLado.setText("Lado");

        tfLado.setColumns(5);
        tfLado.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfLado.setText("0");

        bSumaPerimetros.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bSumaPerimetros.setText("suma perímetros");
        bSumaPerimetros.setActionCommand("sumaperimetros");
        bSumaPerimetros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bEliminaRango.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bEliminaRango.setText("elimina rango");
        bEliminaRango.setActionCommand("eliminarango");
        bEliminaRango.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jlRango.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlRango.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlRango.setText("Rango");

        tfRangoFin.setColumns(5);
        tfRangoFin.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfRangoFin.setText("0");

        tfRangoIni.setColumns(5);
        tfRangoIni.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tfRangoIni.setText("0");

        buttonGroup1.add(rbArea);
        rbArea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbArea.setSelected(true);
        rbArea.setText("Área");

        buttonGroup1.add(rbPerimetro);
        rbPerimetro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbPerimetro.setText("Perímetro");

        jlGuion.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jlGuion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlGuion.setText("-");

        bAñadeFigurasRandom.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bAñadeFigurasRandom.setText("crea 10 figuras ALEATORIAS");
        bAñadeFigurasRandom.setActionCommand("añadefigurasrandom");
        bAñadeFigurasRandom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        bSumaFigurasZona.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bSumaFigurasZona.setText("suma figuras zonas");
        bSumaFigurasZona.setActionCommand("sumafiguraszona");
        bSumaFigurasZona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bSumaFigurasZona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bVerFAreaGrandePequeña.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bVerFAreaGrandePequeña.setText("area mas grande/pequeña");
        bVerFAreaGrandePequeña.setActionCommand("verareafiguragrandepequeña");
        bVerFAreaGrandePequeña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bVerFAreaGrandePequeña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bVerDistanciaFigurasPunto.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bVerDistanciaFigurasPunto.setText("ver distancia figuras a un punto");
        bVerDistanciaFigurasPunto.setActionCommand("verdistanciafiguraspunto");
        bVerDistanciaFigurasPunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bVerDistanciaFigurasPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bSalir5.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bSalir5.setText("Salir");
        bSalir5.setActionCommand("salir");
        bSalir5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bSalir5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bVerFPerimetroGrandePequeño.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        bVerFPerimetroGrandePequeño.setText("perimetro mas grande/pequeño");
        bVerFPerimetroGrandePequeño.setActionCommand("verperimetrofiguragrandepequeño");
        bVerFPerimetroGrandePequeño.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        bVerFPerimetroGrandePequeño.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlY, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAnchura, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfY, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCreaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bAñadeFigurasRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bEliminaXY, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bSumaAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlRango)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfRangoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlGuion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfRangoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbPerimetro)
                                            .addComponent(rbArea)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bEliminaRango, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bEliminaTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(bSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlLado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfLado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bSumaPerimetros, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bSumaFigurasZona, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVerDistanciaEntre2Figuras, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVerFAreaGrandePequeña, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVerFPerimetroGrandePequeño, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVerDistanciaFigurasPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bLista, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAltura, tfAnchura, tfRadio, tfRangoFin, tfRangoIni, tfX, tfY});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlAltura, jlAnchura, jlLado, jlRadio, jlRango, jlX, jlY});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAñadeFigurasRandom, bCreaCirculo, bCreaCuadrado, bCreaRectangulo, bEliminaXY, bLista, bSalir5, bSumaAreas, bSumaFigurasZona, bSumaPerimetros, bVerDistanciaEntre2Figuras, bVerDistanciaFigurasPunto, bVerFAreaGrandePequeña, bVerFPerimetroGrandePequeño});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlX)
                    .addComponent(tfX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlY)
                    .addComponent(tfY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAltura)
                    .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAnchura)
                    .addComponent(tfAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCreaRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCreaCirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCreaCuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAñadeFigurasRandom)
                .addGap(30, 30, 30)
                .addComponent(bLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEliminaXY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbArea)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rbPerimetro))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfRangoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfRangoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlRango)
                        .addComponent(jlGuion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminaRango)
                    .addComponent(bEliminaTodas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSumaAreas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSumaPerimetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSumaFigurasZona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVerFAreaGrandePequeña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVerFPerimetroGrandePequeño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVerDistanciaFigurasPunto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVerDistanciaEntre2Figuras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bSalir5)
                .addContainerGap())
        );

        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiVentana().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadeFigurasRandom;
    private javax.swing.JButton bCreaCirculo;
    private javax.swing.JButton bCreaCuadrado;
    private javax.swing.JButton bCreaRectangulo;
    private javax.swing.JButton bEliminaRango;
    private javax.swing.JButton bEliminaTodas;
    private javax.swing.JButton bEliminaXY;
    private javax.swing.JButton bLista;
    private javax.swing.JButton bSalir5;
    private javax.swing.JButton bSumaAreas;
    private javax.swing.JButton bSumaFigurasZona;
    private javax.swing.JButton bSumaPerimetros;
    private javax.swing.JButton bVerDistanciaEntre2Figuras;
    private javax.swing.JButton bVerDistanciaFigurasPunto;
    private javax.swing.JButton bVerFAreaGrandePequeña;
    private javax.swing.JButton bVerFPerimetroGrandePequeño;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlAnchura;
    private javax.swing.JLabel jlGuion;
    private javax.swing.JLabel jlLado;
    private javax.swing.JLabel jlRadio;
    private javax.swing.JLabel jlRango;
    private javax.swing.JLabel jlX;
    private javax.swing.JLabel jlY;
    private javax.swing.JRadioButton rbArea;
    private javax.swing.JRadioButton rbPerimetro;
    private javax.swing.JTextArea taPantalla;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfAnchura;
    private javax.swing.JTextField tfLado;
    private javax.swing.JTextField tfRadio;
    private javax.swing.JTextField tfRangoFin;
    private javax.swing.JTextField tfRangoIni;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    // End of variables declaration//GEN-END:variables

    /**
     * asigna el oyente de acción a los botones.
     *
     * @param oyente de acción
     */
    public void setOyente(LogPrincipal oyente) {
        JButton[] losBotones = {bCreaRectangulo, bCreaCirculo, bCreaCuadrado, bAñadeFigurasRandom, bLista,
            bEliminaXY, bEliminaRango, bEliminaTodas, bSumaAreas, bSumaPerimetros, bSumaFigurasZona, bVerDistanciaEntre2Figuras,
            bVerFAreaGrandePequeña, bVerFPerimetroGrandePequeño, bVerDistanciaFigurasPunto, bVerDistanciaEntre2Figuras};
        for (JButton boton : losBotones) {
            boton.addActionListener(oyente);
        }
    }

    /**
     * @return un Rectangulo
     * @throws MiEX si altura o anchura son 0 o negativos
     */
    public Rectangulo getRectangulo() throws MiEX {
        return new Rectangulo(
                Double.parseDouble(tfAltura.getText()),
                Double.parseDouble(tfAnchura.getText()),
                Integer.parseInt(tfX.getText()),
                Integer.parseInt(tfY.getText()));
    }

    /**
     * @return un Circulo
     * @throws MiEX si el radio es 0 o negativo
     */
    public Circulo getCirculo() throws MiEX {
        return new Circulo(
                Double.parseDouble(tfRadio.getText()),
                Integer.parseInt(tfX.getText()),
                Integer.parseInt(tfY.getText()));
    }

    /**
     * @return un Cuadrado
     * @throws MiEX si el radio es 0 o negativo
     */
    public Cuadrado getCuadrado() throws MiEX {
        return new Cuadrado(
                Double.parseDouble(tfLado.getText()),
                Integer.parseInt(tfX.getText()),
                Integer.parseInt(tfY.getText()));
    }

    /**
     * muestra el listado de figuras.
     *
     * @param listado a mostrar
     */
    public void muestra(String listado) {
        taPantalla.setText(listado);
    }

    /**
     * @return la posicón X de la figura
     */
    public int getx() {
        return Integer.parseInt(tfX.getText());
    }

    /**
     * @return la posicón Y de la figura
     */
    public int gety() {
        return Integer.parseInt(tfY.getText());
    }

    public double getRangoIni() throws MiEX {
        if ((Double.parseDouble(tfRangoIni.getText()) < 0)) {
            throw new MiEX("No se admiten valores negativos.");
        }
        return Double.parseDouble(tfRangoIni.getText());
    }

    public double getRangoFin() throws MiEX {
        if ((Double.parseDouble(tfRangoFin.getText()) < 0)) {
            throw new MiEX("No se admiten valores negativos.");
        }
        return Double.parseDouble(tfRangoFin.getText());
    }

    public String tipoRango() {
        if (rbArea.isSelected()) {
            return "area";
        } else {
            return "perimetro";
        }
    }

    /**
     * devuelve la Figura en la posición X, Y. como es abstracta hay que
     * codificar los métodos abstractos getArea y getPerimetro
     *
     * @return una Figuracon los valors X,Y definidos
     */
    public Figura getFigura() {
        return new Figura(Integer.parseInt(tfX.getText()),
                Integer.parseInt(tfY.getText())) {
            @Override
            public double calculaArea() {
                return -1;
            }

            @Override
            public double calculaPerimetro() {
                return -1;
            }
        };
    }

}
