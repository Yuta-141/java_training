class Test7_5_3{
    public static void main(String[] args) {
        int iaa[][] = {{0,1,2},{10,11,12,13},{20},{30,31}};

        for(int i =0; i<iaa.length;i++){
            for(int j = 0; j < iaa[i].length;j++){
                System.out.println("iaa[" + i + "][" + j  + "] = " + iaa[i][j]);
            }
        }
    }
}