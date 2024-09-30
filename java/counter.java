class Counter {
    private int clicks = 0;

    public void click(){
        ++this.clicks;
    }

    public int getClicks(){
        return this.clicks;
    }

    public void reset(){
        this.clicks = 0;
    }
}

// public class counter {
//     int clicks = 0;

//     private void click(int clicknum){
//         clicks += clicknum;
//     }

//     private void returnNum(Strings args[]){
//         return clicks;
//         System.out.println(clicks);
//     }
//     public static void main(String args[]){
//         counter click = new click(100);

//         counter returnNum;
//     }
// }
