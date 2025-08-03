import java.io.File;

class DirectoryManager {

    public static void main(String[] args) {
        try {
        
            File notesDir = new File("notes");
            
            // create directory
            if (notesDir.mkdir()) {
                System.out.println("Directory 'notes' created successfully");
            }

            // retri and print the relative path of the directory
            System.out.println("Relative Path: " + notesDir.getPath());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
