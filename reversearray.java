class dsa1 {
    static void reversearray(int arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k)
        {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }
    public static void main(String[] args)
    {
         
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
     
        int n = arr.length;
     
        reversearray(arr, n, k);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
