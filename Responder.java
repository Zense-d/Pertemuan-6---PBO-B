import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Responder
{
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;

    public Responder()
    {
        responseMap = new HashMap<>();
        defaultResponses = new ArrayList<>();
        fillResponseMap();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    
    public String generateResponse(HashSet<String> words)
    {
        for (String word : words) {
            String response = responseMap.get(word);
            if(response != null) {
                return response;
            }
        }
        
        return pickDefaultResponse();
    }


    private void fillResponseMap()
    {
        responseMap.put("crash", 
                        "Crash sangat jarang terjadi pada sistem kami dalam konfigurasi normal\n" +
                        "Tolong beritahu konfigurasi yang berjalan pada PC anda");
        responseMap.put("crashes", 
                        "Crash sangat jarang terjadi pada sistem kami dalam konfigurasi normal\n" +
                        "Tolong beritahu konfigurasi yang berjalan pada PC anda");
        responseMap.put("slow", 
                        "Masalah performa sangat bergantung pada spesifikasi komputer anda\n"+
                        "Apabila anda merasa terganggu mungkin anda sudah dapat memutuskan untuk upgrade");
        responseMap.put("performance", 
                        "Masalah performa sangat bergantung pada spesifikasi komputer anda\n"+
                        "Apabila anda merasa terganggu mungkin anda sudah dapat memutuskan untuk upgrade");
        responseMap.put("bug", 
                        "Bug sangat jarang terjadi, mohon berikan informasi lebih\n"+
                        "Sehingga kami dapat memecahkan permasalahanmu");
        responseMap.put("buggy", 
                        "Bug sangat jarang terjadi, mohon berikan informasi lebih\n"+
                        "Sehingga kami dapat memecahkan permasalahanmu");
        responseMap.put("windows", 
                        "Sepertinya kamu memiliki masalah pada OS\n"+
                        "Pastikan kamu memiliki OS yang tidak dimodifikasi");
        responseMap.put("mac",
                        "Sepertinya kamu memiliki masalah pada OS\n"+
                        "Pastikan kamu memiliki OS yang tidak dimodifikasi");
        responseMap.put("installation", 
                        "Apakah kamu mendapatkan kode error setelah instalasi?\n"+
                        "Aplikasi seharusnya dapat berjalan normal apabila setiap tahap instalasi dijalankan");
        responseMap.put("memory", 
                        "Dalam tabel spesifikasi tertera kebutuhan minimum dari aplikasi ini\n" +
                        "Kebutuhan memori yang kurang dapat membuat konflik pada aplikasi\n");
        responseMap.put("linux", 
                        "Sepertinya kamu memiliki masalah pada OS\n"+
                        "Pastikan kamu memiliki OS yang tidak dimodifikasi");
        responseMap.put("bluej", 
                        "Ahhh, Sepertinya BlueJ agak sulit di troubleshoot."+
                        "Apakah kamu pernah coba IDE lain?");
    }

    private void fillDefaultResponses()
    {
        defaultResponses.add("Apakah masih ada? Kalau ada mohon beri tahu kami");
        defaultResponses.add("Kondisi tersebut sepertinya janggal, tolong beri tahu lebih rinci");
        defaultResponses.add("Sudahkah kamu cek konfigurasi? Bagaimana tampilannya");
        defaultResponses.add("Masalah ini belum pernah ditemukan sebelumnya, apakah kamu sudah cek kembali?");
        defaultResponses.add("Apakah kamu dapat terkoneksi dengan internet");
        defaultResponses.add("Apakah kamu sudah mencoba fitur troubleshoot?");
        defaultResponses.add("Saya butuh informasi lebih rinci pada masalah tersebut");
        defaultResponses.add("Apakah masalah ini merembet kemasalah lain, apabila iya dimana?");
        defaultResponses.add("Tolong berikan masalahmu lagi, sepertinya kamu sudah dekat dengan solusinya");
        defaultResponses.add("Apakah kamu sudah cek dokumentasi error, apa masalah yang dijelaskan?");
    
    }

    private String pickDefaultResponse()
    {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }
}
