package x.KenKOfficial.Homes.Files;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.IOException;
import org.bukkit.Bukkit;
import java.io.File;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class HomeFile
{
    private static final /* synthetic */ String[] lIll;
    /* synthetic */ FileConfiguration data;
    private static final /* synthetic */ int[] Illl;
    static /* synthetic */ HomeFile instance;
    public static /* synthetic */ File rfile;
    
    public void setup(final Plugin lIllIlIllIlllll) {
        if (IIllll(lIllIlIllIlllll.getDataFolder().exists() ? 1 : 0)) {
            lIllIlIllIlllll.getDataFolder().mkdir();
            "".length();
        }
        final File llllIlIllIlllll = new File(String.valueOf(new StringBuilder().append(lIllIlIllIlllll.getDataFolder()).append(File.separator).append(HomeFile.lIll[HomeFile.Illl[0]])));
        HomeFile.rfile = new File(llllIlIllIlllll, String.valueOf(String.valueOf(new StringBuilder().append(String.valueOf(File.separatorChar)).append(HomeFile.lIll[HomeFile.Illl[1]]))));
        if (IIllll(HomeFile.rfile.exists() ? 1 : 0)) {
            try {
                llllIlIllIlllll.mkdirs();
                "".length();
                HomeFile.rfile.createNewFile();
                "".length();
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            catch (IOException IlIIllIllIlllll) {
                Bukkit.getServer().getLogger().severe(HomeFile.lIll[HomeFile.Illl[2]]);
            }
        }
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(HomeFile.rfile);
    }
    
    private static void IlIlll() {
        (lIll = new String[HomeFile.Illl[4]])[HomeFile.Illl[0]] = IIIlll("QTgBCwY=", "npnfc");
        HomeFile.lIll[HomeFile.Illl[1]] = lIIlll("osW1cAaPwHMXn/gLXpa7sQ==", "JjMfi");
        HomeFile.lIll[HomeFile.Illl[2]] = IIIlll("Nhotcj8cEiQ9agsaLXIwGR8pNiUPEityOhQaIydqEBwlNzlWCiU+", "xsHRJ");
        HomeFile.lIll[HomeFile.Illl[3]] = lIIlll("JAvjQxf8DxprvMyVcesZTJWcnI0ozRgxGjL2ynL/fXAYhaS/iyOYmw==", "JHrmC");
    }
    
    private static boolean IIllll(final int IIlIlllIlIlllll) {
        return IIlIlllIlIlllll == 0;
    }
    
    public static HomeFile getInstance() {
        return HomeFile.instance;
    }
    
    static {
        llIlll();
        IlIlll();
        HomeFile.instance = new HomeFile();
    }
    
    private static String lIIlll(final String lllllllIlIlllll, final String IIlllllIlIlllll) {
        try {
            final SecretKeySpec IlIIIIIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllllIlIlllll.getBytes(StandardCharsets.UTF_8)), HomeFile.Illl[5]), "DES");
            final Cipher lIIIIIIllIlllll = Cipher.getInstance("DES");
            lIIIIIIllIlllll.init(HomeFile.Illl[2], IlIIIIIllIlllll);
            return new String(lIIIIIIllIlllll.doFinal(Base64.getDecoder().decode(lllllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIIIIllIlllll) {
            IIIIIIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllll(final int lllIlllIlIlllll, final int IllIlllIlIlllll) {
        return lllIlllIlIlllll < IllIlllIlIlllll;
    }
    
    public void reloadData() {
        this.data = (FileConfiguration)YamlConfiguration.loadConfiguration(HomeFile.rfile);
    }
    
    public FileConfiguration getFile() {
        return this.data;
    }
    
    private static void llIlll() {
        (Illl = new int[6])[0] = ((0x85 ^ 0x9A) & ~(0xAD ^ 0xB2));
        HomeFile.Illl[1] = " ".length();
        HomeFile.Illl[2] = "  ".length();
        HomeFile.Illl[3] = "   ".length();
        HomeFile.Illl[4] = (111 + 131 - 224 + 114 ^ 58 + 114 - 156 + 112);
        HomeFile.Illl[5] = (0x80 ^ 0x88);
    }
    
    public void saveData() {
        try {
            this.data.save(HomeFile.rfile);
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        catch (IOException lIlIIlIllIlllll) {
            Bukkit.getServer().getLogger().severe(HomeFile.lIll[HomeFile.Illl[3]]);
        }
    }
    
    private static String IIIlll(String llllIIIllIlllll, final String llIIlIIllIlllll) {
        llllIIIllIlllll = new String(Base64.getDecoder().decode(llllIIIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlIIlIIllIlllll = new StringBuilder();
        final char[] lIIIlIIllIlllll = llIIlIIllIlllll.toCharArray();
        int IIIIlIIllIlllll = HomeFile.Illl[0];
        final Exception IlIlIIIllIlllll = (Object)llllIIIllIlllll.toCharArray();
        final float lIIlIIIllIlllll = IlIlIIIllIlllll.length;
        int IIIlIIIllIlllll = HomeFile.Illl[0];
        while (lIllll(IIIlIIIllIlllll, (int)lIIlIIIllIlllll)) {
            final char lIlIlIIllIlllll = IlIlIIIllIlllll[IIIlIIIllIlllll];
            IlIIlIIllIlllll.append((char)(lIlIlIIllIlllll ^ lIIIlIIllIlllll[IIIIlIIllIlllll % lIIIlIIllIlllll.length]));
            "".length();
            ++IIIIlIIllIlllll;
            ++IIIlIIIllIlllll;
            "".length();
            if ((123 + 132 - 205 + 94 ^ 118 + 114 - 229 + 145) < (169 + 8 - 123 + 117 ^ 135 + 110 - 233 + 163)) {
                return null;
            }
        }
        return String.valueOf(IlIIlIIllIlllll);
    }
}
