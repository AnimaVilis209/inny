package DK.IT;

public class Plansza {
    //Argumenty
    public int rzedy;
    public int kolumny;

    //Metody
    public void ustawplansze(int x, int y){
        rzedy=x;
        kolumny=y;
    }
    public void drukujPlansze() {
        Symbol symbol = new Symbol();
        symbol.ustawZnak('X');
        for(int i=0;i<rzedy;i++){
            for(int j=0;j<kolumny;j++){
                System.out.print(symbol.znak);
            }
            System.out.println();
        }
        //1234
    }
}
