package geometrija;

import java.awt.Graphics;

public class Drawing {
  private Shape[] shapes = new Shape[10];

  public void paint(Graphics g) {
    for (int i = 0; i < shapes.length; i++)
        shapes[i].draw(g);
}
}
