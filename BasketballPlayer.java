package prob1;

public class BasketballPlayer {
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private int twoPointersAttempted;
	private int twoPointersMade;
	private int threePointersAttempted;
	private int threePointersMade;
	private int getTotalPoints;
	
	public BasketballPlayer(String name) {
		this.name = name;
	}
	
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}
	
	public int getFreeThrowsMade() {
		return freeThrowsMade;
	
	}
	
	public void shootFreeThrow(boolean isMade) {
		freeThrowsAttempted++;
		if(isMade) {
			freeThrowsMade++;
		}
		
	}
	
	public double getFreeThrowPercent() {
		if(freeThrowsAttempted==0) {
			return 0.0;
		}
		double percent =  100.0 * freeThrowsMade/freeThrowsAttempted;
		return percent;
	}
	
	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	
	}
	
	public int getTwoPointersMade() {
		return twoPointersMade;
		
	}
	
	public void shootTwoPointer(boolean isMade) {
		twoPointersAttempted ++;
		if(isMade) {
			twoPointersMade ++;
		}
	}
	
	public double getTwoPointerPercent() {
		if(twoPointersAttempted==0) {
			return 0.0;
		}
			double percent =  100.0 * twoPointersMade/twoPointersAttempted;
			return percent;
		
	}
	
	public int getThreePointersAttempted() {
		return threePointersAttempted;
	
	}
	
	public int getThreePointersMade() {
		return threePointersMade;
		
	}
	
	public void shootThreePointer(boolean isMade) {
		threePointersAttempted ++;
		if(isMade) {
			threePointersMade++;
		}
	}
	
	public double getThreePointerPercent() {
		if(threePointersAttempted==0) {
			return 0.0;
		}
			double percent = 100.0 * threePointersMade/threePointersAttempted;
			return percent;
			
		}
	
	public int getTotalPoints() {
		return 1*freeThrowsMade + 2*twoPointersMade + 3*threePointersMade;
	}
	public int GetTotalPoints_OnlyTwoPointers() {
		return 2*twoPointersMade;
	}
	public int GetTotalPoints_OnlyThreePointers() {
		return 3*threePointersMade;
		

    }
	
	public String toString() {
		String msg = String.format("Player:%s, points:%d\n Free Throws: made:%d, attempted:%d, percent:%.1f\n 2 Pointers: made:%d, attempted:%d, percent:%.1f\n Three Pointers: made:%d, attempted:%d, percent:%.1f");
		
				return msg;
				
	}
}
	
	


