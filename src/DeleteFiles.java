import java.io.File;
import java.io.FilenameFilter;

public class DeleteFiles {

    private static final String FILE_DIR = "H:\\Office\\OneDrive\\OneDrive - NMSWorks Software Private Limited\\" +
            "Documents\\SEACOM\\Dumps\\MEs";
    private static final String FILE_TEXT_EXT = "_.json";


    public static void main(String[] args) {

        new DeleteFiles().deleteFile(FILE_DIR,FILE_TEXT_EXT);
        System.out.println("Working Directory: " + FILE_DIR);

    }

    public void deleteFile(String folder, String ext) {

        GenericExtFilter filter = new GenericExtFilter(ext);
        File dir = new File(folder);

        String[] list = dir.list(filter);

        if (list.length == 0) return;

        File fileDelete;

        for (String file : list) {
            String temp = new StringBuffer(FILE_DIR).
                    append(File.separator).append(file).toString();
            fileDelete = new File(temp);
            boolean isdeleted = fileDelete.delete();
            System.out.println("file: " + temp + "is deleted :" + isdeleted);
        }
    }

    public class GenericExtFilter implements FilenameFilter {

        private String ext;

        public GenericExtFilter(String ext) {

            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }
}

