import java.util.Scanner;

class LoginSystem {
    // Data admin
    private static final String ADMIN_USERNAME = "diqo";
    private static final String ADMIN_PASSWORD = "2024";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====WELCOME TO LIBRARY SYSTEM====");

        // Meminta user memilih tipe login
        while (true) {
            System.out.println("Who are you?:");
            System.out.println("1. Login As Student");
            System.out.println("2. Login As Admin");
            System.out.println("3. Exit");
            System.out.println("Pilihan Anda: ");
            int userType = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            if (userType == 2) {
                // Login sebagai admin
                System.out.print("Masukkan USERNAME     : ");
                String username = scanner.nextLine();
                System.out.print("Masukkan PASSWORD     : ");
                String password = scanner.nextLine();

                if (loginAdmin(username, password)) {
                    System.out.println("Login Anda BERHASIL Sebagai Admin!");
                } else {
                    System.out.println("Login Anda GAGAL\n. Username Atau Password Salah.");
                }
            } else if (userType == 1) {
                // Login sebagai mahasiswa
                System.out.print("Masukkan NIM      : ");
                String nim = scanner.nextLine();

                if (loginMahasiswa(nim)) {
                    System.out.println("Login Anda BERHASIL Sebagai Mahasiswa!");
                } else {
                    System.out.println("Login Anda GAGAK\n. NIM Tidak Valid.");
                }
            } else if (userType == 3) {
                System.out.println("===GOODBYE===");
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Valid.");
            }


        }
    }


    // Fungsi untuk login sebagai admin
    private static boolean loginAdmin(String username, String password) {
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

    // Fungsi untuk login sebagai mahasiswa
    private static boolean loginMahasiswa(String nim) {
        return nim.length() == 15; // Memastikan panjang NIM 15 karakter
    }
}