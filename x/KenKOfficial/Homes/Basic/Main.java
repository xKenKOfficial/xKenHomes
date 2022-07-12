package x.KenKOfficial.Homes.Basic;

import org.bukkit.event.Listener;
import x.KenKOfficial.Homes.Listeners.PlayerJoin;
import org.bukkit.plugin.Plugin;
import x.KenKOfficial.Homes.Apis.API;
import x.KenKOfficial.Homes.Commands.SethomeCommand;
import x.KenKOfficial.Homes.Commands.HomeCommand;
import org.bukkit.command.CommandExecutor;
import x.KenKOfficial.Homes.Commands.DelhomeCommand;
import java.util.Arrays;
import org.bukkit.Bukkit;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    private static /* synthetic */ Main plugin;
    private static final /* synthetic */ int[] IlIl;
    private static final /* synthetic */ String[] lIIl;
    
    private static String IlIlIl(final String lIIlllIIIllllll, final String IllIllIIIllllll) {
        try {
            final SecretKeySpec IIllllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIllIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlllIIIllllll = Cipher.getInstance("Blowfish");
            llIlllIIIllllll.init(Main.IlIl[2], IIllllIIIllllll);
            return new String(llIlllIIIllllll.doFinal(Base64.getDecoder().decode(lIIlllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlllIIIllllll) {
            IlIlllIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIl(String IIlIIlIIIllllll, final String IIIlIlIIIllllll) {
        IIlIIlIIIllllll = (char)new String(Base64.getDecoder().decode(((String)IIlIIlIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIIlIIIllllll = new StringBuilder();
        final char[] IllIIlIIIllllll = IIIlIlIIIllllll.toCharArray();
        int lIlIIlIIIllllll = Main.IlIl[0];
        final String lllllIIIIllllll = (Object)((String)IIlIIlIIIllllll).toCharArray();
        final byte IllllIIIIllllll = (byte)lllllIIIIllllll.length;
        long lIlllIIIIllllll = Main.IlIl[0];
        while (lIllIl((int)lIlllIIIIllllll, IllllIIIIllllll)) {
            final char IlIlIlIIIllllll = lllllIIIIllllll[lIlllIIIIllllll];
            lllIIlIIIllllll.append((char)(IlIlIlIIIllllll ^ IllIIlIIIllllll[lIlIIlIIIllllll % IllIIlIIIllllll.length]));
            "".length();
            ++lIlIIlIIIllllll;
            ++lIlllIIIIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllIIlIIIllllll);
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        this.registerFiles();
        System.out.println(Main.lIIl[Main.IlIl[0]]);
        System.out.println(Main.lIIl[Main.IlIl[1]]);
        System.out.println(Main.lIIl[Main.IlIl[2]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[3]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.lIIl[Main.IlIl[4]]);
        System.out.println(Main.lIIl[Main.IlIl[5]]);
        System.out.println(Main.lIIl[Main.IlIl[6]]);
    }
    
    private static void IIllIl() {
        (IlIl = new int[22])[0] = ((0x19 ^ 0x63 ^ (0xED ^ 0x9B)) & (138 + 80 - 86 + 69 ^ 172 + 7 - 129 + 147 ^ -" ".length()));
        Main.IlIl[1] = " ".length();
        Main.IlIl[2] = "  ".length();
        Main.IlIl[3] = "   ".length();
        Main.IlIl[4] = (0x41 ^ 0x49 ^ (0x62 ^ 0x6E));
        Main.IlIl[5] = (0x65 ^ 0x60);
        Main.IlIl[6] = (0x2F ^ 0x29);
        Main.IlIl[7] = (50 + 40 - 20 + 77 ^ 9 + 78 + 6 + 55);
        Main.IlIl[8] = (63 + 154 - 96 + 43 ^ 118 + 59 - 124 + 119);
        Main.IlIl[9] = (0x86 ^ 0x90 ^ (0x86 ^ 0x99));
        Main.IlIl[10] = (126 + 105 - 218 + 160 ^ 103 + 58 - 7 + 13);
        Main.IlIl[11] = (0xB4 ^ 0xC3 ^ (0xF8 ^ 0x84));
        Main.IlIl[12] = (0xCB ^ 0xC7);
        Main.IlIl[13] = (0xB2 ^ 0xBF);
        Main.IlIl[14] = (0x64 ^ 0x2 ^ (0xDD ^ 0xB5));
        Main.IlIl[15] = (0x1F ^ 0x10);
        Main.IlIl[16] = (0x4B ^ 0x23 ^ (0xEF ^ 0x97));
        Main.IlIl[17] = (0x9F ^ 0x8E);
        Main.IlIl[18] = (0x7D ^ 0x57 ^ (0xFB ^ 0xC3));
        Main.IlIl[19] = (0xD2 ^ 0xC1);
        Main.IlIl[20] = (0x65 ^ 0x71);
        Main.IlIl[21] = (0x27 ^ 0x32);
    }
    
    private static String IIIlIl(final String IIlIIIlIIllllll, final String llIIIIlIIllllll) {
        try {
            final SecretKeySpec lIIlIIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlIIllllll.getBytes(StandardCharsets.UTF_8)), Main.IlIl[8]), "DES");
            final Cipher IIIlIIlIIllllll = Cipher.getInstance("DES");
            IIIlIIlIIllllll.init(Main.IlIl[2], lIIlIIlIIllllll);
            return new String(IIIlIIlIIllllll.doFinal(Base64.getDecoder().decode(IIlIIIlIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlIIllllll) {
            lllIIIlIIllllll.printStackTrace();
            return null;
        }
    }
    
    private void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[14]]).append(this.getName())));
        this.getCommand(Main.lIIl[Main.IlIl[15]]).setExecutor((CommandExecutor)new DelhomeCommand());
        this.getCommand(Main.lIIl[Main.IlIl[16]]).setExecutor((CommandExecutor)new HomeCommand());
        this.getCommand(Main.lIIl[Main.IlIl[17]]).setExecutor((CommandExecutor)new SethomeCommand());
    }
    
    private void saveFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[20]]).append(this.getName())));
        API.getDataFolder().saveData();
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    static {
        IIllIl();
        llIlIl();
    }
    
    private void registerFiles() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[19]]).append(this.getName())));
        API.getDataFolder().setup((Plugin)this);
    }
    
    private static void llIlIl() {
        (lIIl = new String[Main.IlIl[21]])[Main.IlIl[0]] = IIIlIl("wKh9glAo30vAqH2CUCjfS8CofYJQKN9LwKh9glAo30vAqH2CUCjfS8CofYJQKN9LwKh9glAo30shc2kkaLjesw==", "TyQrn");
        Main.lIIl[Main.IlIl[1]] = lIIlIl("AgkDOz8VLwMm", "zBfUw");
        Main.lIIl[Main.IlIl[2]] = IlIlIl("mJ/wRJr2e22zb1JcH07AJXjuNvujgo29", "FjMWO");
        Main.lIIl[Main.IlIl[3]] = IlIlIl("J2y1IXP7TUHKHmn7crol03AG4+PE8nyv", "REMzL");
        Main.lIIl[Main.IlIl[4]] = IlIlIl("q0ysj+4KcGELvMFc89+28w==", "ioicg");
        Main.lIIl[Main.IlIl[5]] = lIIlIl("GRsFLiI4FQIwLjYRTiIjKhkEImc6WgAmNSYJFCIpOh9ONzUyDU4mMicVHDQsOhkGZ2pzIC8FFRw0JwgJFls=", "SznGG");
        Main.lIIl[Main.IlIl[6]] = IIIlIl("JHrAq01DYo0kesCrTUNijSR6wKtNQ2KNJHrAq01DYo0kesCrTUNijSR6wKtNQ2KNJHrAq01DYo1+Jf2Hrxds9w==", "acYNP");
        Main.lIIl[Main.IlIl[7]] = IlIlIl("uZziy/BrePm5nOLL8Gt4+bmc4svwa3j5uZziy/BrePm5nOLL8Gt4+bmc4svwa3j5uZziy/BrePkU6OKC/2s73A==", "VLndP");
        Main.lIIl[Main.IlIl[8]] = IIIlIl("Py/vAwtkf3BNy5Zg1C8pyg==", "GhEbJ");
        Main.lIIl[Main.IlIl[9]] = IIIlIl("UBp32ieU+cLW4a4YR/xFyXWjuGddh0SF", "CyQMc");
        Main.lIIl[Main.IlIl[10]] = IIIlIl("9cD37gjsxmAccyj/UAT8f8zWsE2qrU4m", "qfeoA");
        Main.lIIl[Main.IlIl[11]] = IlIlIl("kuhywCWwEHK1Q1OPG6YFWw==", "jpqMe");
        Main.lIIl[Main.IlIl[12]] = IIIlIl("AQPlfStZ1KLHzddHntH+9eyuNAqsl+DCfvEHc62TXHToxVNI6R8vHD5zH3su+D/lcqIt84/rhC3ezHYmkvmE3A==", "PMZVg");
        Main.lIIl[Main.IlIl[13]] = lIIlIl("VnFme1tWcWZ7W1ZxZntbVnFme1tWcWZ7W1ZxZntbVnFme1tWcWZ7W1ZxZntbVnFme1tWcWZ7W1ZxZns=", "uREXx");
        Main.lIIl[Main.IlIl[14]] = lIIlIl("PTISLQ0QPR8nWho8GycUFXMMYgodJhErFARpVg==", "qSvBz");
        Main.lIIl[Main.IlIl[15]] = IlIlIl("sjSfDuz0vKA=", "IGoTM");
        Main.lIIl[Main.IlIl[16]] = IIIlIl("kawmQs8OmfI=", "BgyCP");
        Main.lIIl[Main.IlIl[17]] = IIIlIl("6z00L7QHKuQ=", "MPqIb");
        Main.lIIl[Main.IlIl[18]] = IIIlIl("aUfW6QfN0pgDbg4XWfaHApvigr3XmTRMozG9UaQPHBA=", "VuKnj");
        Main.lIIl[Main.IlIl[19]] = lIIlIl("FQcFCCc4CAgCcD0JBQYkMgkWHjMxRhELOTIJFkcqeRYNEjcwCBRdcA==", "YfagP");
        Main.lIIl[Main.IlIl[20]] = IlIlIl("q3J6m1RuyeWx07jx4w36RMv7/KAra5F3554rj+ux36jNTk7JraextM6E6G+vQd3f", "nUzLB");
    }
    
    private static boolean lIllIl(final int lIIllIIIIllllll, final int IIIllIIIIllllll) {
        return lIIllIIIIllllll < IIIllIIIIllllll;
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        this.saveFiles();
        System.out.println(Main.lIIl[Main.IlIl[7]]);
        System.out.println(Main.lIIl[Main.IlIl[8]]);
        System.out.println(Main.lIIl[Main.IlIl[9]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[10]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.lIIl[Main.IlIl[11]]);
        System.out.println(Main.lIIl[Main.IlIl[12]]);
        System.out.println(Main.lIIl[Main.IlIl[13]]);
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.lIIl[Main.IlIl[18]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
}
