public class Ship {
	private byte length;
	private Dot begin;
	private Dot end;
	public void setShip(byte Length, byte beginX, byte beginY, byte endX, byte endY){
		if (Length<4 && Length>=0) {
			length=Length;
		} else {
		}
		if (beginX==endX && beginY!=endY) {
			if(bebinY>endY) {
				if(length==beginY-endY+1) {
					begin.setDot(beginX,beginY);
					end.setDot(endX,endY);
				}
			} else {
				if(length==endY-beginY+1) {
					begin.setDot(beginX,beginY);
					end.setDot(endX,endY);
				}
			}
		} else if (beginX!=endX && beginY==endY) {
			if(bebinX>endX) {
				if(length==beginX-endX+1) {
					begin.setDot(beginX,beginY);
					end.setDot(endX,endY);
				}
			} else {
				if(length==endX-beginX+1) {
					begin.setDot(beginX,beginY);
					end.setDot(endX,endY);
				}
			}
		} else {
		}
	}
