public class Files implements FileSysComponent{
    public int sz;
    public Files(int sz){
        this.sz = sz;
    }

    @Override
    public int fileSystem() {
        return sz;
    }
}
