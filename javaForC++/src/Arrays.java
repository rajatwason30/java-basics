public class Arrays {
    public static void fun(int [] arr){
        arr[0]=100;
        arr[3]=20;
    }
    public static void main(String[] args){
        // vid-4 : array
        int [] arr= new int[5];  // same as int* a= new int[5] in c++
        arr[0]=10;
        arr[1]=2;
        arr[3]=23;
        arr[4]=54;

        for(int i=0;i<5;i++) System.out.println(arr[i]);
        // passing arr to a fun
        fun(arr);
        // address of arr has been passed to fun => able to change value in arr
        for(int i:arr)
            System.out.println(i);

        // 2d array
        int [][] a= new int[2][3];
        a[0][0]=1; a[1][2]=4;

        // jacked array
        int [][] a1= new int[2][];
        a1[0]= new int[3];   // first row contains 3 elems
        a1[1]= new int[4]; // second row contains 4 elems

        a1[0][0]=11;
        a1[0][2]=13;
        a1[1][0]=21;
        a1[1][3]=24;
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
                System.out.print(a1[i][j]+ " ");
            System.out.println();
        }

        //passing 2d arr to a fun
        // fun1 can change vals in a1
        fun1(a1);
    }

    private static void fun1(int[][] a1) {
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
                System.out.print(a1[i][j]+ " ");
            System.out.println();
        }
    }
}
