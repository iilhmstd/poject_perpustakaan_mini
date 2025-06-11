import java.io.*;

public class perpustakaan_mini {
    public static void main(String [] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String[] adminUsername = {"admin1", "superuser", "admin2", "admin3"};
        String[] adminPassword = {"password123", "sipaling admin", "admin ke2", "admin magang"};

        System.out.println(" =======================================");
        System.out.println(" ==========  ==========");
        System.out.println(" =======================================");
        System.out.println();
        System.out.println("==== Silahkan login terlebih dahulu ====");
        System.out.print("username : "); String USERNAME = br.readLine();
        System.out.print("password : "); String PASSWORD = br.readLine();

        boolean isAdmin = false;

        for (int i = 0; i < adminUsername.length; i++) {
            if (adminUsername[i].equals(USERNAME) && adminPassword[i].equals(PASSWORD)) {
                isAdmin = true;
                break;
            }
        }

        if (isAdmin) {
            System.out.println("Anda berhasil LOGIN sebagai ADMIN!");
        } else {
            System.out.println("Anda Berhasil LOGIN sebagai user");
        }

        br.close();


    }
}