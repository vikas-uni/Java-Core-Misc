package recursion;

import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FileComparator extends SimpleFileVisitor<Path> {

    // Map to store file sizes (key: size in bytes, value: list of file paths with that size)
    private final Map<Long, List<Path>> sizeToFileMap = new HashMap<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (attrs.isRegularFile()) {
            long size = attrs.size();
            // Add the file path to the list for its corresponding size
            sizeToFileMap.computeIfAbsent(size, k -> new ArrayList<>()).add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    public Map<Long, List<Path>> getSizeToFileMap() {
        return sizeToFileMap;
    }

    public static void main(String[] args) {
        // Specify the starting directory path here
        String startDirectoryPath = "C:\\Users\\vikasgond\\Downloads"; // Replace with your folder path

        Path startPath = Paths.get(startDirectoryPath);
        FileComparator fc = new FileComparator();

        if (!Files.isDirectory(startPath)) {
            System.out.println("Error: The path provided is not a valid directory.");
            return;
        }

        try {
            // Walk the file tree starting from the specified path
            Files.walkFileTree(startPath, fc);
            
            Map<Long, List<Path>> results = fc.getSizeToFileMap();

            System.out.println("Comparison Results (Files with the same size):");
            // Iterate through the map to find entries where more than one file shares the same size
            results.forEach((size, paths) -> {
                if (paths.size() > 1) {
                    System.out.printf("\nSize: %d bytes\n", size);
                    paths.forEach(path -> System.out.println("  - " + path));
                }
            });

        } catch (IOException e) {
            System.err.println("An I/O error occurred while walking the file tree: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
