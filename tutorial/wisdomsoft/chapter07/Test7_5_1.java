class Test7_5_1{
    public static void main(String[] args) {
        int iArray1[] = {1,10};
        int iArray2[] = {100,1000,10000};
        
        int iaa[][] = new int[2][];
        iaa[0] = iArray1;
        iaa[1] = iArray2;

        for(int i=0; i < iaa.length; i++){
            for(int j = 0; j < iaa[i].length; j++){
                System.out.println("iaa[" + i + "][" + j + "] = " + iaa[i][j]);
            }
        }
    }
}