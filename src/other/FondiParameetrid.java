package other;
// Fail other.FondiParameetrid.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/** Fondiparameetrid "v6ti - v22rtus" paaridena.
 * @author Jaanus Poial
 * @version 0.9 
 * @since JDK 1.5
 */
public class FondiParameetrid extends HashMap<String, Object> {

   /** versioonihalduseks */
   static final long serialVersionUID = 23456;

   /** n2itestring, mida kuvada */
   String s = "ABCDabcd,.1234";

   /** synkroniseerimiseks */
   Boolean valmis = new Boolean (false);

   /** v2line raam dialoogile */
   JFrame raam;

   /** vaikekonstruktor */
   FondiParameetrid () {
      put ("name", "Dialog");
      put ("style", new Integer (Font.PLAIN));
      put ("size", new Integer (14));

      //================================================
      // Va"lise raami loomine ja juhtimine
      //================================================
      raam = new JFrame();
      raam.setSize (350, 300);
      raam.setTitle ("Vali font");
      raam.addWindowListener (new WindowAdapter() {
         public void windowClosing (WindowEvent e) {
            synchronized (valmis) {
               valmis.notifyAll();
            }
         }
      });

      //================================================
      // Tegeliku liidese ehitamine on eraldi meetodina
      //================================================

      looDialoog (raam.getContentPane());

      raam.setVisible (true);
      try {
         synchronized (valmis) {
            valmis.wait(); // ootame dialoogi lo'ppu
         }
      } catch (InterruptedException e) {}
      raam.setVisible (false);  // eemaldame akna

   } // konstruktor

   //===================================================
   // Kasutame Graphics-objekti saamiseks u"lekatmist
   //===================================================

   /** Konteiner Graphics-objekti saamiseks. */
   class JFondiNaide extends JPanel {

      /** versioonihalduseks */
      static final long serialVersionUID = 23456;

      /** ylekaetud paint-meetod, mis tegelikult n2itestringi joonistab */
      public void paint (Graphics g) {

         g.setFont (votaFont());       // font

         //=============================================
         // Arvutame teksti asukoha fondimeetrika alusel
         //=============================================

         FontMetrics fm = g.getFontMetrics();
         int tekstikorgus = fm.getHeight();
         int tekstilaius = fm.stringWidth (s);
         int kastikorgus = getSize().height;
         int kastilaius = getSize().width;
         if ((kastilaius  < tekstilaius) ||
             (kastikorgus < tekstikorgus)) {
            // throw new RuntimeException ("Ei mahu!");
         }
         int x = (kastilaius - tekstilaius) / 2;
         int y = (kastikorgus - tekstikorgus) / 2 +
            fm.getAscent(); // alusjoone saamiseks

         g.setColor (Color.white);
         g.fillRect (0, 0, kastilaius, kastikorgus);
         g.setColor (Color.black);
         g.drawString (s, x, y);

      } // paint

   } // JFondiNaide

   /** dialoogi loomine etteantud konteinerisse */
   void looDialoog (Container kest) {

      //================================================
      // Aknaelemendid
      //================================================
      JPanel valikutePaneel = new JPanel();
      JPanel nimePaneel = new JPanel();
      JPanel ryhmaPaneel = new JPanel();
      JFondiNaide fondiNaide = new JFondiNaide();
      JLabel nimeSilt = new JLabel ("Nimi");
      String [] fondid = GraphicsEnvironment.
         getLocalGraphicsEnvironment().
         getAvailableFontFamilyNames();
      JList nimed = new JList (fondid);
      JScrollPane nimePaan = new JScrollPane (nimed);
      JLabel tekstiSilt = new JLabel ("Tekst");
      JTextField tekstiVali = new JTextField (s, 14);
      JLabel suuruseSilt = new JLabel ("Suurus");
      String [] psuurused = { "6", "8", "10", "12",
         "14","16","18","20","24","30","36","40" };
      JComboBox suurused = new JComboBox (psuurused);
      JLabel stiiliSilt = new JLabel ("Stiil");
      JCheckBox rasvane = new JCheckBox ("Paks kiri");
      JCheckBox kaldkiri = new JCheckBox ("Kaldkiri");
      JButton okNupp = new JButton ("Valmis");

      //================================================
      // Ka"itumine
      //================================================
      nimed.addListSelectionListener
         (new ListSelectionListener() {
         public void valueChanged 
            (ListSelectionEvent e) {
            String s = (String)((JList)e.getSource()).
               getSelectedValue();
            put ("name", s);
            JFondiNaide n = (JFondiNaide)
               ((Container)((JPanel)((JPanel)
               ((JScrollPane)((JViewport)((JList)e.
               getSource()).getParent()).getParent()).
               getParent()).getParent()).getParent()).
               getComponent (0);
            n.repaint();
         }
      } );

      tekstiVali.addActionListener
         (new ActionListener() {
         public void actionPerformed (ActionEvent e) {
            s = ((JTextField)e.getSource()).getText();
            JFondiNaide n = (JFondiNaide)
               ((Container)((JPanel)((JPanel)
               ((JTextField)e.getSource()).
               getParent()).getParent()).getParent()).
               getComponent (0);
            n.repaint();
         }
      } );

      suurused.addItemListener (new ItemListener() {
         public void itemStateChanged (ItemEvent e) {
            int suurus = Integer.parseInt ((String)
              ((JComboBox)e.getSource()).
              getSelectedItem());
            put ("size", new Integer (suurus));
            JFondiNaide n = (JFondiNaide)
               ((Container)((JPanel)((JPanel)
               ((JComboBox)e.getSource()).
               getParent()).getParent()).getParent()).
               getComponent (0);
            n.repaint();
         }
      } );

      rasvane.addItemListener (new ItemListener() {
         public void itemStateChanged (ItemEvent e) {
            int stiil =
               ((Integer)(get ("style"))).intValue();
            boolean olek = ((JCheckBox)e.getSource()).
               isSelected();
            if (olek)
               stiil = stiil + Font.BOLD;
               else stiil = stiil - Font.BOLD;
            put ("style", new Integer (stiil));
            JFondiNaide n = (JFondiNaide)
               ((Container)((JPanel)((JPanel)
               ((JCheckBox)e.getSource()).getParent()).
               getParent()).getParent()).
               getComponent (0);
            n.repaint();
         }
      } );

      kaldkiri.addItemListener (new ItemListener() {
         public void itemStateChanged (ItemEvent e) {
            int stiil =
               ((Integer)(get ("style"))).intValue();
            boolean olek = ((JCheckBox)e.getSource()).
               isSelected();
            if (olek)
               stiil = stiil + Font.ITALIC;
               else stiil = stiil - Font.ITALIC;
            put ("style", new Integer (stiil));
            JFondiNaide n = (JFondiNaide)
               ((Container)((JPanel)((JPanel)
               ((JCheckBox)e.getSource()).
               getParent()).getParent()).getParent()).
               getComponent (0);
            n.repaint();
         }
      } );

      okNupp.addActionListener (new ActionListener() {
         public void actionPerformed (ActionEvent e) {
            synchronized (valmis) {
               valmis.notifyAll();
            }
         }
      } );

      //================================================
      // Va"ljana"gemine
      //================================================
      kest.setLayout (new BoxLayout
         (kest, BoxLayout.Y_AXIS));
      kest.add (fondiNaide);
      kest.add (valikutePaneel);

      nimed.setVisibleRowCount (7);
      nimePaneel.setLayout (new BoxLayout
         (nimePaneel, BoxLayout.Y_AXIS));
      nimePaneel.add (nimeSilt);
      nimePaneel.add (nimePaan);
      ryhmaPaneel.setLayout (new BoxLayout
         (ryhmaPaneel, BoxLayout.Y_AXIS));
      ryhmaPaneel.add (tekstiSilt);
      ryhmaPaneel.add (tekstiVali);
      ryhmaPaneel.add (suuruseSilt);
      ryhmaPaneel.add (suurused);
      ryhmaPaneel.add (stiiliSilt);
      ryhmaPaneel.add (rasvane);
      ryhmaPaneel.add (kaldkiri);
      ryhmaPaneel.add (okNupp);
      valikutePaneel.setLayout (new GridLayout (1,2));
      valikutePaneel.add (nimePaneel);
      valikutePaneel.add (ryhmaPaneel);
      nimed.setSelectedValue (get ("name"), true);
      suurused.setSelectedItem
         (get ("size").toString());

   } // looDialoog


   /** peameetod - silumiskest */
   public static void main (String[] parameetrid) {
      FondiParameetrid fp = new FondiParameetrid();
      Font f = fp.votaFont();
      System.out.println ("Valiti kiri: " + f);
      fp.raam.dispose();
   } // main

   /** Fondi loomine parameetritest. */
   public Font votaFont() {
      return new Font ((String)get ("name"), 
         ((Integer)(get ("style"))).intValue(), 
         ((Integer)(get ("size"))).intValue());
   } // votaFont

} // other.FondiParameetrid
