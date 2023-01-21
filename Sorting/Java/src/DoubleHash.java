public class DoubleHash {
    public static void main(String[] args){

        Integer [] array = {18,15,13,22};
        Integer [] sortedArray = new Integer[7];
        boolean [] isFilled = new boolean[7];
        for (int i = 0; i < isFilled.length; i++) {
            isFilled[i] = false;
        }


        for (int i = 0; i < array.length; i++) {
            Integer key = array[i];

            Integer x = (Math.abs(key.hashCode()))%(sortedArray.length);
            System.out.print(key + " slotx: " + x + " ");
            if(isFilled[x]==false){
                sortedArray[x] = key;
                isFilled[x] = true;
            }else{
                int y = 1+ (Math.abs(key.hashCode()))%(sortedArray.length-1);
                System.out.println(key + " sloty: " + y);
                sortedArray[y] =key;
                isFilled[y] = true;
            }

//            int y = 1+ Math.abs(x.hashCode())%(sortedArray.length-1);
//            System.out.print("y: " + y + " ");
//            sortedArray[y] =key;
//
            System.out.println("");

        }


        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]+ " ");
        }

    }

}
