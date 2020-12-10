package TugasBesar;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Pegawai> pegawais = new ArrayList<>();
        File inputfilePegawai = new File("src/TugasBesar/Pegawai.txt");
        Scanner inPegawai = new Scanner(inputfilePegawai);
        while (inPegawai.hasNextLine()) {
            String[] str = inPegawai.nextLine().split(";");
            pegawais.add(new Pegawai(str[0],str[1],str[2],str[3],str[4]));
        }inPegawai.close();
        
        
        ArrayList<Riwayat> riwayats = new ArrayList<>();
        File inputfileRiwayat = new File("src/TugasBesar/Riwayat.txt");
        Scanner inRiwayat = new Scanner(inputfileRiwayat);
        while (inRiwayat.hasNextLine()) {
            String[] str = inRiwayat.nextLine().split(";");
            riwayats.add(new Riwayat(str[0],str[1],str[2],str[3],str[4],str[5]));
        }inRiwayat.close();
        
        ArrayList<Perizinan> perizinan = new ArrayList<>();
        File inputfilePerizinan = new File("src/TugasBesar/Perizinan.txt");
        Scanner inPerizinan = new Scanner(inputfilePerizinan);
        while (inPerizinan.hasNextLine()) {
            String[] str = inPerizinan.nextLine().split(";");
            perizinan.add(new Perizinan(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7]));
        }inPerizinan.close();
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuUser(pegawais, riwayats, perizinan).setVisible(true));
    }
}
