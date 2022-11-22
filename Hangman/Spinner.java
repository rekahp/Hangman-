public class Spinner {
    public Spinner() {
        
    }
    int value = 0;
    public int spin(){
        

    // Conditions
        value = (int)(Math.random()*8);
        switch (value) {
            case 0:
                value = 0;
                 break;
            case 1:
                value = 100;
                break;
            case 2:
                value = 200;
                break;
            case 3:
                value = 500;
                break;
            case 4:
                value = 1000;
                break;
            case 5:
                value = 50;
                break;
            case 6:
                value = 0;
                break;
            case 7:
                value = 0;
                break;

        }
        return value;
    }
    
}
