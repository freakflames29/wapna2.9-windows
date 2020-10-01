//wapna for windows

import java.io.IOException;
import java.util.Scanner;

public class wap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in Wapna2.9");
        System.out.println("This is your own Desktop Assitant");
        System.out.println("To know every command type 'A'");
        while (true) {
            System.out.println("enter the command:");
            String c1, m1, v1;
            c1 = sc.nextLine();

            v1 = c1.toLowerCase();
            if (v1.equals("ff")) {
                try {
                    System.out.println("opening firefox...");
                    String s1 = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
                    Runtime r1 = Runtime.getRuntime();
                    Process p1 = r1.exec(s1);
                } catch (IOException E) {
                    E.printStackTrace();
                }
            } else if (v1.equals("bit")) {
                try {
                    System.out.println("opening bittorrent...");
                    String s2 = "C:\\Users\\SOURAV\\AppData\\Roaming\\BitTorrent\\BitTorrent.exe";
                    Runtime r2 = Runtime.getRuntime();
                    Process p2 = r2.exec(s2);

                } catch (IOException E1) {
                    E1.printStackTrace();
                }
            } else if (v1.equals("aud")) {
                try {
                    System.out.println("opening audacity...");
                    String s3 = "C:\\Program Files (x86)\\Audacity\\audacity.exe";
                    Runtime r3 = Runtime.getRuntime();
                    Process p3 = r3.exec(s3);
                } catch (IOException E2) {
                    E2.printStackTrace();
                }
            } else if (v1.equals("xam")) {
                try {
                    System.out.println("opening XAMPP...");
                    String s4 = "C:\\xampp2\\xampp-control.exe";
                    Runtime r4 = Runtime.getRuntime();
                    Process p4 = r4.exec(s4);
                } catch (IOException E3) {
                    E3.printStackTrace();
                }
            } else if (v1.equals("ai")) {
                try {
                    System.out.println("opening illustrator...");
                    String s5 = "C:\\Program Files (x86)\\Adobe\\Adobe Illustrator CC 2019 (32 Bit)\\Support Files\\Contents\\Windows\\Illustrator.exe";
                    Runtime r5 = Runtime.getRuntime();
                    Process p5 = r5.exec(s5);
                } catch (IOException E4) {
                    E4.printStackTrace();
                }
            } else if (v1.equals("ch")) {
                try {
                    System.out.println("opening chrome...");
                    String s6 = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
                    Runtime r6 = Runtime.getRuntime();
                    Process p6 = r6.exec(s6);
                } catch (IOException E5) {
                    E5.printStackTrace();
                }


            } else if (v1.equals("ij")) {
                try {
                    System.out.println("opening IntellijIDE...");
                    String s7 = "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\bin\\idea64.exe";
                    Runtime r7 = Runtime.getRuntime();
                    Process p7 = r7.exec(s7);
                } catch (IOException E6) {
                    E6.printStackTrace();
                }
            } else if (v1.equals("ink")) {
                try {
                    System.out.println("opening inkscape...");
                    String s8 = "C:\\Program Files (x86)\\Inkscape\\inkscape.exe";
                    Runtime r8 = Runtime.getRuntime();
                    Process p8 = r8.exec(s8);
                } catch (IOException E7) {
                    E7.printStackTrace();
                }
            } else if (v1.equals("tb")) {
                try {
                    System.out.println("opening Thunder Bird...");
                    String s9 = "C:\\Program Files (x86)\\Mozilla Thunderbird\\thunderbird.exe";
                    Runtime r9 = Runtime.getRuntime();
                    Process p9 = r9.exec(s9);
                } catch (IOException E8) {
                    E8.printStackTrace();
                }
            } else if (v1.equals("blue")) {
                try {
                    System.out.println("opening bluej...");
                    String s10 = "C:\\Program Files\\BlueJ\\BlueJ.exe";
                    Runtime r10 = Runtime.getRuntime();
                    Process p10 = r10.exec(s10);
                } catch (IOException E9) {
                    E9.printStackTrace();
                }
            } else if (v1.equals("a")) {
                System.out.println("programs     commands");
                System.out.println("-------------------");
                System.out.println("FireFox :------> ff");
                System.out.println("chrome :---------> ch");
                System.out.println("intellij  :------> ij");
                System.out.println("illustrator:-----> ai");
                System.out.println("inkscape :------> ink");
                System.out.println("bittorrent :------> bit");
                System.out.println("thunderbird:------> tb");
                System.out.println("audacity:------> aud");
                System.out.println("bluej:---------> blue");
                System.out.println("XAMpp :------> xam");

            }
//

            else {
                System.out.println("command not found !");
            }
        }


    }
}