public class MatriksLatihan1 {
    public static void main(String args[]) {
    int Bintang [][] = {{4,3},{5,7}};
    int Rizqi [][] = {{2,1},{3,4}};

    int A[][] = new int[2][2];
    for (int i=0;i<2;i++){
        for (int j=0;j<2;j++){
            A[i][j]=Bintang[i][j]-Rizqi[i][j];
            System.out.println(A[i][j]+ " ");
        }
        System.out.println();
    }   
    }
}

