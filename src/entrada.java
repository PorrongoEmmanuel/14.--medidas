import javax.swing.*;

public class entrada {

    public void calculo() {
        int peso, edad;
        double m, estatura;
        String condicion;
        peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso en kilos mi compa"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la estatura "));
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad "));
        m = peso / (estatura * estatura);
        JOptionPane.showMessageDialog(null, "su IMC es:\n " + m);
        if (m <= 22.0 && edad < 45) {
            JOptionPane.showMessageDialog(null, "es bajo o medio riesco de enfermedades  ");
        } else {
            if (m > 22 && edad <= 95) {
                JOptionPane.showMessageDialog(null, "es medio alto riesco de enfermedades  ");
            }
        }
    }}
