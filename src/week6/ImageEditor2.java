package week6;

import java.awt.Color;

import stdlib.Picture;

public class ImageEditor2 {

	public static double luminance(Color color) {
		return (0.299 * color.getRed() +
				0.587 * color.getGreen() +
				0.114 * color.getBlue());
	}

	public static Color toGrey(Color color) {
		int l = (int) Math.round(luminance(color));
		Color grey = new Color(l, l, l);
		return grey;
	}
	
	public static Picture threshold(Picture p, int thresh) {
		Picture threshed = new Picture(p.width(), p.height());
		for (int i = 0; i < p.width(); i++) {
			for (int j = 0; j < p.height(); j++) {
				int l = (int) Math.round(luminance(p.get(i, j)));
				if (l >= thresh) {
					threshed.set(i, j, toGrey(p.get(i, j)));
				}
				else {
					threshed.set(i, j, new Color(0, 0, 0));
				}
			}
		}
		return threshed;
	}
	
	public static void main(String[] args) {
		Picture p = new Picture("src/week6/lion2.jpg"); // or use any other colour image
		Picture greyscale = ImageEditor1.makeGreyscale(p);
		p.show();
		greyscale.show();
		Picture t = threshold(p, 50);
		t.show();
	}
}
