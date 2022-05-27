public class Prac7 {
    public static void main(String[] args){
        String plateNumber = "" + (char)(Math.random()*26+65);
        plateNumber += (char)(Math.random()*26+65);
        plateNumber += (char)(Math.random()*26+65);
        plateNumber += (int)(Math.random()*10);
        plateNumber += (int)(Math.random()*10);
        plateNumber += (int)(Math.random()*10);
        plateNumber += (int)(Math.random()*10);
        System.out.println(plateNumber);
    }
}
