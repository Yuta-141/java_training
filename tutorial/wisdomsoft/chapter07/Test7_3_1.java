class Test7_3_1{
    public static void main(String[] args) {
        int iArray[] = {1,10,100,100 * 10};

        for(int i = 0; i < 4; i++){
            System.out.println("iArray[" + i + "] = " + iArray[i]);
        }

        String strArray[] = {
            "Blue Blue Grass Moon, UnderThe Crimon Air.",
            new String("Twilight Grass Moon, Fairy Tale Princess.")
        };
        System.out.println("strArray[0] = " + strArray[0]);
        System.out.println("strArray[1] = " + strArray[1]);
    }
}