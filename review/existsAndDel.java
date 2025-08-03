import java.io.File;
import java.io.IOException;

class CacheDataManager {  

    public static void main(String[] args) {  
        try {  
  
            File cacheFile = new File("cache.txt");  

   
            if (cacheFile.exists()) {  
             
                if (cacheFile.delete()) {  
                    System.out.println("Old cache file deleted successfully.");  
                } else {  
                    System.out.println("Failed to delete the old cache file.");  
                }  
            }  

            if (cacheFile.createNewFile()) {  
                System.out.println("New cache file created successfully.");  
            } else {  
                System.out.println("Failed to create the new cache file.");  
            }  

        } catch (IOException e) {  
            System.out.println("An error occurred: " + e.getMessage());  
        }  
    }  
}
