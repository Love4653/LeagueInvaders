import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed = 10;
	
	Projectile(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	void update() {
		super.update();
		y = y - speed;
		if (y <= 0) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.bulletImg, x-100, y-84, 50, 36, null);
	}
}
