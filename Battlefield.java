public class Battlefield
{

    

    public static void main(String[] args){
        Rabbit rabbit1 = new Rabbit();
        Snake snake1 = new Snake();


       // virkende version!
        rabbit1.moveUp(); 
        snake1.moveDown();
        rabbit1.moveUp();
        snake1.moveDown();
        rabbit1.moveRight();
        snake1.moveDown();
        rabbit1.moveRight();
        snake1.moveDown();
        rabbit1.moveRight();
        snake1.moveDown();
        rabbit1.moveUp();
        snake1.moveLeft();
        rabbit1.moveRight();
        snake1.moveLeft();
        rabbit1.moveRight();
        snake1.moveLeft();
        rabbit1.moveRight();
        rabbit1.askForMercy();
        snake1.moveDown();
        snake1.killRabbit();


     
    }
 
}