class Dot {
	private byte x;
	private byte y;
	public void setDot(byte X, byte Y) {
		if (X<10&&X>=0&&Y<10&&Y>=0) {
			x=X; y=Y;
		} else {
		}
	}
	public byte getX() {
		return x;
	}
	public byte getY() {
		return y;
	}
}
