package Java200;

public class FourMagicSquare {
    private int[][] magic;
    private int n;

    public int[][] getMagic(){
            return magic;
    }
    public FourMagicSquare(int n){
        magic=new int[n][n];
        this.n=n;
    }
    public FourMagicSquare(){
        this(4);
    }
    public void make(){
        makeA();
        makeR();
    }
    private  void makeR() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= 0 && i < n / 4) || (i >= n / 4 * 3 && i < n)) {
                    if (j >= n / 4 && j < n / 4 * 3) {
                        magic[i][j] = n * n - (i * n + j);
                    }
                } else { //i가 중앙
                    if ((j >= 0 && j < n / 4) || (j >= n / 4 * 3 && j < n)) {
                        magic[i][j] = n * n - (i * n + j);
                    }
                }
            }
        }
    }
    private void makeA(){
        for (int i = 0; i<n*n; i++){
            magic[i/n][i%n]= i+1;
        }
    }
}
