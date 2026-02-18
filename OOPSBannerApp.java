public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        // Store all banner lines in String array
        String[] banner = {

                String.join("   ", "OOOOO", "OOOOO", "PPPPP", "SSSSS"),
                String.join("   ", "O   O", "O   O", "P   P", "S"),
                String.join("   ", "O   O", "O   O", "PPPPP", "SSSSS"),
                String.join("   ", "O   O", "O   O", "P", "    S"),
                String.join("   ", "OOOOO", "OOOOO", "P", "SSSSS")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
