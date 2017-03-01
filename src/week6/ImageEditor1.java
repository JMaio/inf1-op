package week6;

import java.awt.Color;

import stdlib.Picture;

public class ImageEditor1 {

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
	
	public static Picture makeGreyscale(Picture pic) {
		Picture greyscale = new Picture(pic.width(), pic.height());
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				greyscale.set(i, j, toGrey(pic.get(i, j)));
			}
		}
		return greyscale;
	}
	
	public static void main(String[] args) {
		Picture p = new Picture("src/week6/lion2.jpg"); // or use any other colour image
		Picture greyscale = makeGreyscale(p);
		p.show();
		greyscale.show();
	}
	
	
	
}
