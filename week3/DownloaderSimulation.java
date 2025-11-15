package week3;

class FileChunkDownloader extends Thread {

    private int chunkId;

    public FileChunkDownloader(int chunkId) {
        this.chunkId = chunkId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Chunk " + chunkId + " downloading...");

            // Simulate variable download time
            Thread.sleep(2000 + (int)(Math.random() * 2000)); 

            System.out.println("Chunk " + chunkId + " downloaded.");
        } catch (InterruptedException e) {
            System.out.println("Chunk " + chunkId + " download interrupted.");
        }
    }
}


public class DownloaderSimulation {

    public static void main(String[] args) {

        // Let's simulate downloading 5 chunks
        FileChunkDownloader c1 = new FileChunkDownloader(1);
        FileChunkDownloader c2 = new FileChunkDownloader(2);
        FileChunkDownloader c3 = new FileChunkDownloader(3);
        FileChunkDownloader c4 = new FileChunkDownloader(4);
        FileChunkDownloader c5 = new FileChunkDownloader(5);

        // Start all chunk download threads
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        try {
            // Main thread waits for all chunks to complete
            c1.join();
            c2.join();
            c3.join();
            c4.join();
            c5.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n>>> Download complete! All chunks finished.");
    }
}
