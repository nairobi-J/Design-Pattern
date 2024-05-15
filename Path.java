import java.io.File;
import java.util.ArrayList;

import java.util.List;

public class Path implements FileSysComponent{
    public List<FileSysComponent>branches;
    private int size;
     public Path(){
         this.size = 0;
         branches = new ArrayList<>();
     }
     public void add(FileSysComponent components){
         branches.add(components);

     }
    @Override
     public int fileSystem(){
         for(FileSysComponent i : branches){
             size = size + i.fileSystem();
         }
         return size;
     }
}
