package arrays;

public class JaggedArrayString {

	public static void main(String[] args) {
		String[][] names=new String[2][3];
		names[0][0]="vishwa";
		names[0][1]="java";
		names[0][2]="sql";
		names[1][0]="spring";
		names[1][1]="react";
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.print(names[i][j]+"|");
			}
			System.out.println();
		}

	}

}
