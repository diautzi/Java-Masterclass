public class MegaBytesConverter {
    // write a method called printMegaBytesAndKiloByte that has 1 para, of type int with the name kiloBytes
    //this method should not return anything (void)
    // needs to print message in the "XX KB = MB and ZZ KB"
    // XX represents kiloBytes
    // YY represents the calculated megabytes
    // ZZ represents the calculated remaining kilobytes
    // 1MB = 1024 KB

    public static void printMegaBytesAndKiloBytes( int kiloBytes) {

        if(kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesRemaining = kiloBytes - megaBytes * 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemaining + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
