package V2;

import java.io.Serializable;
import java.util.Arrays;

public class FileToBeTransfer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fileName;
    private int fileSize;
    private byte[] fileData;

    public FileToBeTransfer(String fileName, int fileSize){
        this.fileName=fileName;
        this.fileSize=fileSize;
        fileData=new byte[fileSize];

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "FileToBeTransfer{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", fileData=" + Arrays.toString(fileData) +
                '}';
    }
}
