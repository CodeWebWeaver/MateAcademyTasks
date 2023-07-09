package org.morning_task.file_name_extractor;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        String cleanFileName = "";
        int IndexOfStartFileName = dirtyFileName.indexOf('_') + 1;
        int IndexOfEndFileName = dirtyFileName.lastIndexOf('.');
        cleanFileName = dirtyFileName.substring(IndexOfStartFileName, IndexOfEndFileName);
        return cleanFileName;
    }
}
