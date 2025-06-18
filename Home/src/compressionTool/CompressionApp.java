package compressionTool;

import java.util.Scanner;

// Interface defining compressor behavior
interface Compressor {
    void compress(String fileName);
    double getCompressionRatio();
}

// Implementation for ZIP compression
class ZipCompressor implements Compressor {
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using ZIP...");
    }

    public double getCompressionRatio() {
        return 1.8;
    }
}

// Implementation for RAR compression
class RarCompressor implements Compressor {
    public void compress(String fileName) {
        System.out.println("Compressing " + fileName + " using RAR...");
    }

    public double getCompressionRatio() {
        return 2.0;
    }
}

// Main class
public class CompressionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for type of compression
        System.out.print("Choose compression type (ZIP/RAR): ");
        String type = scanner.nextLine();

        // Ask user for file name
        System.out.print("File to compress: ");
        String fileName = scanner.nextLine();

        Compressor compressor;

        // Choose appropriate class
        if (type.equalsIgnoreCase("ZIP")) {
            compressor = new ZipCompressor();
        } else if (type.equalsIgnoreCase("RAR")) {
            compressor = new RarCompressor();
        } else {
            System.out.println("Unsupported compression type.");
            scanner.close();
            return;
        }

        // Perform compression
        compressor.compress(fileName);
        System.out.println("Compression Ratio: " + compressor.getCompressionRatio());

        scanner.close();
    }
}
