package CodeWars;

public class Main {

    public static void main(String[] args) {

        DRoot cos = new DRoot();

        System.out.println(cos.digital_root(132189));


    }




}




  class DRoot {
    public int digital_root(int n) {

          int temp = 0;
        while(n != 0) {
            temp = n%10;

            System.out.println(temp);

            n = n/10;

        }

        return temp;
    }

   private void recursion() {



    }



}


  /*  digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
        => 24 ...
        => 2 + 4
        => 6*/