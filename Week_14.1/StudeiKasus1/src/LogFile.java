public class LogFile {

    private String filename;
    private String permissions;
    private String month;
    private int date;
    
    public LogFile(String permissions, String month, int date, String filename){
        this.permissions = permissions;
        this.month = month;
        this.date = date;
        this.filename = filename;
    }
    
    public String getFilename() {
        return filename;
    }

    public String getPermissions() {
        return permissions;
    }
    
    public String getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }
    
    @Override
    public String toString() {
        return "LogFile{" +
                "permissions='" + permissions + '\'' +
                ", month='" + month + '\'' +
                ", date=" + date +
                ", filename='" + filename + '\'' +
                '}';
    }
}
