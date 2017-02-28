public class Rabbit
{
    private String name;
    private int positionX = 1;
    private int positionY = 1;

    public Rabbit(String name, int positionX, int positionY){
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Rabbit(){

    }


    public void declarePosition(){
        System.out.println("I am a rabbit and i'm standing on square (" + currentPosition() + ")");
    }
    
    public void moveUp(){
        this.positionY = positionY+1;
            if(positionY<0||positionY>10){
            System.out.println("false move");
        }else{
            declarePosition();
        }  
    }

     public void moveDown(){
        this.positionY = positionY-1; 
        if(positionY<0||positionY>10){
            System.out.println("false move");
        }else{
            declarePosition();
        }  
    }

     public void moveLeft(){
        this.positionX = positionX-1;
           if(positionX<0||positionX>10){
            System.out.println("false move");
        }else{
            declarePosition();  
        }
    }

     public void moveRight(){
        this.positionX = positionX+1;
           if(positionX<0||positionX>10){
            System.out.println("false move");
        }else{
            declarePosition();  
        }
    }
 
    public String currentPosition(){
        return positionX + " , " + positionY;
    }
 

    public void askForMercy(){
        System.out.println("Please dont kill mee :'( ");
    }

}
