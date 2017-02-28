public class Snake
{
    private String name;
    private int positionX =10;
    private int positionY = 10;

    public Snake(String name, int positionX, int positionY){
     this.name = name;
     this.positionX = positionX;
     this.positionY = positionY;
    }

    public Snake(){

    }

   public void declarePosition(){
        System.out.println("I am a snake and i'm standing on square (" + currentPosition() + ")");
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


    public void killRabbit(){
        System.out.println("You're mine mr rabbit!!!'");
    }
}