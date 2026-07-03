package pokemon;

import java.awt.*;

@SuppressWarnings("removal")
public class CambiaFont extends java.applet.Applet {
  public void paint(Graphics g) {
    Font f;

	/* scrive con il font di default */
    g.drawString("Questa e' una stringa",10,10);

	/* cambia font: times con dimensione 14 */
    f = new Font("TimesRoman", Font.PLAIN, 14);
    g.setFont(f);

	/* scrive un'altra stringa */
    g.drawString("Nuova stringa in un nuovo carattere",10,50);

	/* ancora cambiamento di font: Helvetica bold, dim 16 */
    f = new Font("Helvetica", Font.BOLD, 16);
    g.setFont(f);
    g.drawString("In grassetto",10,100);

	/* grassetto+corsivo */
    f = new Font("Symbol", Font.BOLD+Font.ITALIC, 12);
    g.setFont(f);
    g.drawString("safdsaf",10,150);
  }
}