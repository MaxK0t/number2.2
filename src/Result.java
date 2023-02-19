public class Result {
    private int num;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        int c = num + 7;
        if (c % 10 == 0){
            System.out.println("Digit ends on 3");
        } else {
            System.out.println("Digit ends ain't on 3");
        }
        return num;
    }
}
