public class OOPSBannerApp {

    public static void main(String[] args) {

        printBanner();
    }

    public static void printBanner() {

        // Line 1
        System.out.println(String.join("   ",
                "OOOOO",
                "OOOOO",
                "PPPPP",
                "SSSSS"));

        // Line 2
        System.out.println(String.join("   ",
                "O   O",
                "O   O",
                "P   P",
                "S"));

        // Line 3
        System.out.println(String.join("   ",
                "O   O",
                "O   O",
                "PPPPP",
                "SSSSS"));

        // Line 4
        System.out.println(String.join("   ",
                "O   O",
                "O   O",
                "P",
                "    S"));

        // Line 5
        System.out.println(String.join("   ",
                "OOOOO",
                "OOOOO",
                "P",
                "SSSSS"));
    }
}
