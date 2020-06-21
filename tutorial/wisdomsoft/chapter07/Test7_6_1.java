class Test7_6_1{
    public static void main(String[] args) {
        int[] iArray = {1,10,100};
        int[][] iaa = {iArray,{1000,10000}};

        for(int i = 0; i < iaa.length; i++){
            for(int j =0;j < iaa[i].length;j++){
                System.out.println("iaa[" + i + "][" + j + "] = " + iaa[i][j]);
            }
        }
    }
}