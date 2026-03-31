interface BtnClick{
    void click();
}
public class AnonymousClass4 {
    public static void main(String[] args) {
        BtnClick btn = new BtnClick() {
            public void click(){
                System.out.println("Button Clicked!!");
            }
        };
        btn.click();
    }
}
