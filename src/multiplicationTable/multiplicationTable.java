package multiplicationTable;

public class multiplicationTable {
	public static void main(String[] args) {
		int[][]mulTable=new int[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<=i;j++){
				mulTable[i][j]=(j+1)*(i+1);
				System.out.print((j+1)+"*"+(i+1)+"="+mulTable[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
