class fctr {

    public static int  factorial(int f){
        //int getter;
        if(f>0) {
            return   f * factorial(f - 1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int f=4;
        int get;
        System.out.println(f+" ის ფაქტორიალი არის "+factorial(f));



    }
}