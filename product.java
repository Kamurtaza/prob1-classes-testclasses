package prob1;

public class product {
	private int batch;
	private String code;
	private String date;
	private int indexDateBegins;
	private String plant;
	



public product (String code) {
	this.code = code;
	this.plant = extractPlant();
	this.date = extractDate();
	this.batch = extractBatch();

}

private int extractBatch() {
	
}

private String extractDate() {
	this.date = "";
	
}

private String extractPlant() {
	this.plant = "";
for(int i = 0; i < 3; i++) {
	if(Character.isLetter(this.code.charAt(i))) {
		
	}
}
}
}