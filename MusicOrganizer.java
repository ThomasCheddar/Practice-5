import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index, boolean validIndex)
    {
        if(validIndex == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    public void listAllFiles(){
        for (String filename : files){
            System.out.println(filename);
        }
    }
    
    public void listWithIndex(){
        int position;
        String filename;
        for (int index = 0; index < files.size(); index++) {
            filename = files.get(index);
            System.out.println(index + ": " + filename);
        }
    }
    
    public boolean listMatching(String searchString)
    {
        for(String filename : files) {
            if(filename.contains(searchString)) {
                System.out.println(filename);
                return true;
            }
        }
        System.out.println("L");
        return false;
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
    
    public void checkIndex(int index){
        if (index < 0 && index > files.size()){
            System.out.println("the valid range is" + files.size());
        }
    }
    
    public boolean validIndex(int index){
        return index >= 0 && index < files.size();
    }
}
