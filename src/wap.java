//wapna for windows
import java.io.IOException;
import java.util.Scanner;

class windowswap
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome in Wapna2.9");
        System.out.println("This is your own Desktop Assitant");
        System.out.println("To know every command type 'A'");
        while(true) {
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
            }

            else if (v1.equals("bit")) {
                try {
                    System.out.println("opening bittorrent...");
                    String s2 = "C:\\Users\\SOURAV\\AppData\\Roaming\\BitTorrent\\BitTorrent.exe";
                    Runtime r2 = Runtime.getRuntime();
                    Process p2 = r2.exec(s2);

                } catch (IOException E1) {
                    E1.printStackTrace();
                }
            }

            else if (v1.equals("aud")) {
                try {
                    System.out.println("opening audacity...");
                    String s3 = "C:\\Program Files (x86)\\Audacity\\audacity.exe";
                    Runtime r3 = Runtime.getRuntime();
                    Process p3 = r3.exec(s3);
                } catch (IOException E2) {
                    E2.printStackTrace();
                }
            }

            else if (v1.equals("xam")) {
                try {
                    System.out.println("opening XAMPP...");
                    String s4 = "C:\\xampp2\\xampp-control.exe";
                    Runtime r4 = Runtime.getRuntime();
                    Process p4 = r4.exec(s4);
                } catch (IOException E3) {
                    E3.printStackTrace();
                }
            }

            else if (v1.equals("ai")) {
                try {
                    System.out.println("opening illustrator...");
                    String s5 = "C:\\Program Files (x86)\\Adobe\\Adobe Illustrator CC 2019 (32 Bit)\\Support Files\\Contents\\Windows\\Illustrator.exe";
                    Runtime r5 = Runtime.getRuntime();
                    Process p5 = r5.exec(s5);
                } catch (IOException E4) {
                    E4.printStackTrace();
                }
            }

            else if (v1.equals("ch")) {
                try {
                    System.out.println("opening chrome...");
                    String s6 = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
                    Runtime r6 = Runtime.getRuntime();
                    Process p6 = r6.exec(s6);
                } catch (IOException E5) {
                    E5.printStackTrace();
                }


            }

            else if (v1.equals("ij")) {
                try {
                    System.out.println("opening IntellijIDE...");
                    String s7 = "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2019.3.3\\bin\\idea64.exe";
                    Runtime r7 = Runtime.getRuntime();
                    Process p7 = r7.exec(s7);
                } catch (IOException E6) {
                    E6.printStackTrace();
                }
            }
            else if (v1.equals("ink")) {
                try {
                    System.out.println("opening inkscape...");
                    String s8 = "C:\\Program Files (x86)\\Inkscape\\inkscape.exe";
                    Runtime r8 = Runtime.getRuntime();
                    Process p8 = r8.exec(s8);
                } catch (IOException E7) {
                    E7.printStackTrace();
                }
            }
            else if (v1.equals("tb")) {
                try {
                    System.out.println("opening Thunder Bird...");
                    String s9 = "C:\\Program Files (x86)\\Mozilla Thunderbird\\thunderbird.exe";
                    Runtime r9 = Runtime.getRuntime();
                    Process p9 = r9.exec(s9);
                } catch (IOException E8) {
                    E8.printStackTrace();
                }
            }
            else if (v1.equals("blue")) {
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
                System.out.println("DEV C++ :------> dev");
                System.out.println("photoscape:------> photo");
                System.out.println("Notepad++:------> nplus");
                System.out.println("sublime text :------> sublime");
                System.out.println("Gravit Designer :------> gravit");
                System.out.println("CCleaner :------> cc");
            }
            else if(v1.equals("dev"))
            {
                try {
                    System.out.println("opening DEVC++...");
                    String s11 = "C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe";
                    Runtime r11 = Runtime.getRuntime();
                    Process p11 = r11.exec(s11);
                } catch (IOException E10) {
                    E10.printStackTrace();
                }

            }
            else if (v1.equals("photo"))
            {
                try {
                    System.out.println("opening Photoscape...");
                    String s12 = "C:\\Program Files (x86)\\PhotoScape\\PhotoScape.exe";
                    Runtime r12 = Runtime.getRuntime();
                    Process p12 = r12.exec(s12);
                } catch (IOException E11) {
                    E11.printStackTrace();
                }
            }

            else if (v1.equals("nplus"))
            {
                try {
                    System.out.println("opening Notepad ++...");
                    String s14 = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe";
                    Runtime r14 = Runtime.getRuntime();
                    Process p14 = r14.exec(s14);
                } catch (IOException E13) {
                    E13.printStackTrace();
                }
            }
            else if (v1.equals("sublime"))
            {
                try {
                    System.out.println("opening Sublime text ...");
                    String s15 ="C:\\Program Files\\Sublime Text 3\\sublime_text.exe";
                    Runtime r15 = Runtime.getRuntime();
                    Process p15 = r15.exec(s15);
                } catch (IOException E14) {
                    E14.printStackTrace();
                }
            }
            else if (v1.equals("gravit"))
            {
                try {
                    System.out.println("opening  Gravit Designer ...");
                    String s16 ="C:\\Program Files\\Gravit GmbH\\Gravit Designer\\Gravit Designer.exe";
                    Runtime r16= Runtime.getRuntime();
                    Process p16 = r16.exec(s16);
                } catch (IOException E15) {
                    E15.printStackTrace();
                }
            }
            else if (v1.equals("cc"))
            {
                try {
                    System.out.println("opening  CCleaner ...");
                    String s17 ="C:\\Program Files\\CCleaner\\CCleaner64.exe";
                    Runtime r17= Runtime.getRuntime();
                    Process p17 = r17.exec(s17);
                } catch (IOException E16) {
                    E16.printStackTrace();
                }
            }

            else {
                System.out.println("command not found !");
            }
        }


    }
}
