//each iteration will take highest to the end thats it 
int[] arr = {3,2,5,1,6,8};
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
         }
   }
  System.out.println(Arrays.toString(arr));
