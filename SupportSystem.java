import java.util.HashSet;

public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    public SupportSystem(){
        reader = new InputReader();
        responder = new Responder();
    }
    
    public void start(){
        boolean finished = false;
        
        printWelcome();
        while(!finished){
            HashSet<String> input = reader.getInput();
            
            if(input.contains("bye")){
                finished = true;
            }
            else{
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        printGoodbye();
    }
    
    private void printWelcome(){
        System.out.println("Selamat datang pada Tech Support");
        System.out.println();
        System.out.println("Berikan masalah yang kamu alami");
        System.out.println("Kami akan membantu masalah yang mungkin kamu hadapi");
        System.out.println("Apabila selesai, ketik 'Selesai' pada sistem");
        
    }
    
    private void printGoodbye(){
        System.out.println("Terima kasih telah menggunakan Tech Support");
    }
}
