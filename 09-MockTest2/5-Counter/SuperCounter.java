class SuperCounter extends Counter{

    public SuperCounter(int counter){
        super(counter);
    }

    public void addN(int n){
        counter += n;
    }

    public static void main(String[] args){
        SuperCounter counter = new SuperCounter(9);
        counter.addN(7);
        System.out.println(counter.getCounter());
    }
}

