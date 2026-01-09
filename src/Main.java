
void main() {
    int[] arrayOfRandomNumbers = new Random().ints(15, 1, 101).toArray();
    IO.println("basic Array = " + java.util.Arrays.toString(arrayOfRandomNumbers));

    for(int i = 0; i < arrayOfRandomNumbers.length; i++){
        int current = arrayOfRandomNumbers[i];
        int j = i-1;
        for(; j >=0; j--){
           if(current < arrayOfRandomNumbers[j]){
               arrayOfRandomNumbers[j+1] = arrayOfRandomNumbers[j];
           } else{
               break;
           }
        }
        arrayOfRandomNumbers[j+1]=current;
    }
    IO.println("sorted Array = " + java.util.Arrays.toString(arrayOfRandomNumbers));
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Please add number which index you want to find: ");
    int targetNumber = scanner.nextInt();
    int targetIndex = 0;
    int lowIndex = 0;
    int highIndex = arrayOfRandomNumbers.length-1;
       while (lowIndex <= highIndex){
           int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
           if(targetNumber == arrayOfRandomNumbers[middleIndex]){
                   targetIndex = middleIndex;
                   IO.println("index  of = " + targetNumber+" is "+targetIndex);
           break;
           }

           if(targetNumber > arrayOfRandomNumbers[middleIndex]){
                      lowIndex = middleIndex+1;
                   }else if(targetNumber < arrayOfRandomNumbers[middleIndex]){
                      highIndex = middleIndex-1;
                   };
       }
    if(lowIndex > highIndex ){
        IO.println("there is no " + targetNumber+" in this array");
    }
}
