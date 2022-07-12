package x.KenKOfficial.Homes.Apis;

import x.KenKOfficial.Homes.Basic.Main;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import x.KenKOfficial.Homes.Utils.ChatUtil;
import org.bukkit.entity.Player;
import x.KenKOfficial.Homes.Files.HomeFile;

public class API
{
    private static final /* synthetic */ String NOT_SUCCESS_REMOVE_HOME;
    private static final /* synthetic */ String[] ll;
    private static final /* synthetic */ int[] IIl;
    private static final /* synthetic */ String SUCCESS_REMOVE_HOME;
    private static /* synthetic */ HomeFile homeFile;
    private static final /* synthetic */ String SUCCESS_CREATE_HOME;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String NOT_SUCCESS_CREATE_HOME;
    
    private static void lIlIl() {
        (ll = new String[API.IIl[43]])[API.IIl[0]] = IlIIl("GkQOpjUNNM8=", "kthgl");
        API.ll[API.IIl[1]] = llIIl("Rg==", "hbqxG");
        API.ll[API.IIl[2]] = IIlIl("S9+4+rR15Ak=", "gwTvB");
        API.ll[API.IIl[3]] = IIlIl("Uqqw8sHzulw=", "RRaUn");
        API.ll[API.IIl[4]] = IIlIl("+LaPcUqAyeg=", "zhLRn");
        API.ll[API.IIl[5]] = llIIl("MScGCzZ3", "YHknE");
        API.ll[API.IIl[6]] = llIIl("fQ==", "SlHvf");
        API.ll[API.IIl[7]] = IIlIl("BB5TzpBG0go=", "puFOm");
        API.ll[API.IIl[8]] = IlIIl("nXGxVMOxIk0=", "EzfiD");
        API.ll[API.IIl[9]] = IIlIl("IZhjPeLZ9NU=", "yVFWs");
        API.ll[API.IIl[10]] = IlIIl("bnR5nKqI1FI=", "IYMoQ");
        API.ll[API.IIl[11]] = IIlIl("Ko3u3Jvo3aQ=", "RVYlL");
        API.ll[API.IIl[12]] = IIlIl("Jde8WYyxqLA=", "rwoUQ");
        API.ll[API.IIl[13]] = IIlIl("XzJuKi6Pgao=", "hQGgg");
        API.ll[API.IIl[14]] = IIlIl("AwZsDk0egjw=", "NzrSe");
        API.ll[API.IIl[15]] = llIIl("fg==", "PYNaU");
        API.ll[API.IIl[16]] = IlIIl("UEWkLrG+4+s=", "ZJuuK");
        API.ll[API.IIl[17]] = llIIl("LQ4BAD5r", "EaleM");
        API.ll[API.IIl[18]] = IIlIl("YNE2BrvbAtg=", "qEyHI");
        API.ll[API.IIl[19]] = IlIIl("617/8pwsGpc=", "MdBvq");
        API.ll[API.IIl[20]] = IlIIl("SGhVovuRF2E=", "VDUyX");
        API.ll[API.IIl[21]] = IIlIl("AeluOtARR5k34r9PdZvLwg==", "zNtVN");
        API.ll[API.IIl[22]] = IlIIl("u4Uv0RsssdU=", "XKlRk");
        API.ll[API.IIl[23]] = llIIl("fDA4OjANND4kIQ==", "RXWWU");
        API.ll[API.IIl[24]] = llIIl("Yw==", "CPIsL");
        API.ll[API.IIl[25]] = llIIl("KQMaOA4NBRQ4Di8=", "RKUuK");
        API.ll[API.IIl[26]] = IIlIl("BZzixaBsQOc=", "NxSxe");
        API.ll[API.IIl[27]] = llIIl("DjsYAwVI", "fTufv");
        API.ll[API.IIl[28]] = IIlIl("tf6cuz1vqcw=", "EdYCb");
        API.ll[API.IIl[29]] = IlIIl("xkqjnyszBKE=", "XnZeV");
        API.ll[API.IIl[30]] = IIlIl("9L5RPymqc6c=", "nbsWL");
        API.ll[API.IIl[31]] = IIlIl("cLbBosy5htE=", "FAcnl");
        API.ll[API.IIl[32]] = IIlIl("XokzO3ICnt4=", "yvSPL");
        API.ll[API.IIl[33]] = IIlIl("d3+y5or7Gx+Ltq3GipY62A==", "OSlQX");
        API.ll[API.IIl[34]] = IIlIl("ciM7jrw+o6Y=", "Fxwdh");
        API.ll[API.IIl[35]] = IIlIl("qRXMa1ld5JmYFK0KrB63Mw==", "NjoPy");
        API.ll[API.IIl[36]] = IlIIl("rIghf1JRiZw=", "WeJCI");
        API.ll[API.IIl[37]] = llIIl("EiQ3AAY2IjkABhQ=", "ilxMC");
        API.ll[API.IIl[38]] = llIIl("OzYmAi8z", "KDCdF");
        API.ll[API.IIl[39]] = IlIIl("5b+60iPrplmQd2CVUmjgq1sO+SdOyfB+", "Jwzrt");
        API.ll[API.IIl[40]] = IlIIl("3Ec7ikO7SV/sL52D83OTKdjGO5dL/uht", "tZrYJ");
        API.ll[API.IIl[41]] = IlIIl("VNOVR5oW6m/FimlN9GXqmI+H7SqSZ2RD", "OPyQp");
        API.ll[API.IIl[42]] = IlIIl("K99jVo7yikoBjI5vO8CUEzW8T5KO61LB", "vpFQQ");
    }
    
    public static void delHome(final Player llIIIIlIlllllll, final String IlIIIIlIlllllll) {
        if (lllIl(getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(API.ll[API.IIl[27]]).append(llIIIIlIlllllll.getName()).append(API.ll[API.IIl[28]]).append(IlIIIIlIlllllll))))) {
            llIIIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.ll[API.IIl[29]]).append(API.NOT_SUCCESS_REMOVE_HOME))));
            return;
        }
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[30]]).append(llIIIIlIlllllll.getName()).append(API.ll[API.IIl[31]]).append(IlIIIIlIlllllll)), (Object)null);
        final List<String> IIlIIIlIlllllll = (List<String>)getDataFolder().getFile().getStringList(String.valueOf(new StringBuilder().append(API.ll[API.IIl[32]]).append(llIIIIlIlllllll.getName()).append(API.ll[API.IIl[33]])));
        IIlIIIlIlllllll.remove(IlIIIIlIlllllll);
        "".length();
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[34]]).append(llIIIIlIlllllll.getName()).append(API.ll[API.IIl[35]])), (Object)IIlIIIlIlllllll);
        getDataFolder().saveData();
        llIIIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.ll[API.IIl[36]]).append(API.SUCCESS_REMOVE_HOME.replace(API.ll[API.IIl[37]], IlIIIIlIlllllll)))));
    }
    
    private static boolean lllIl(final Object lllIIIIIlllllll) {
        return lllIIIIIlllllll == null;
    }
    
    private static String IIlIl(final String lllIllIIlllllll, final String IllIllIIlllllll) {
        try {
            final SecretKeySpec IlIlllIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIllIIlllllll.getBytes(StandardCharsets.UTF_8)), API.IIl[8]), "DES");
            final Cipher lIIlllIIlllllll = Cipher.getInstance("DES");
            lIIlllIIlllllll.init(API.IIl[2], IlIlllIIlllllll);
            return new String(lIIlllIIlllllll.doFinal(Base64.getDecoder().decode(lllIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIlllIIlllllll) {
            IIIlllIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IlIIl(final String IIIlIlIIlllllll, final String lIIlIlIIlllllll) {
        try {
            final SecretKeySpec lIllIlIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIllIlIIlllllll = Cipher.getInstance("Blowfish");
            IIllIlIIlllllll.init(API.IIl[2], lIllIlIIlllllll);
            return new String(IIllIlIIlllllll.doFinal(Base64.getDecoder().decode(IIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIlIIlllllll) {
            llIlIlIIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IllIl();
        lIlIl();
        PREFIX = Main.getPlugin().getConfig().getString(API.ll[API.IIl[38]]);
        SUCCESS_CREATE_HOME = Main.getPlugin().getConfig().getString(API.ll[API.IIl[39]]);
        NOT_SUCCESS_CREATE_HOME = Main.getPlugin().getConfig().getString(API.ll[API.IIl[40]]);
        SUCCESS_REMOVE_HOME = Main.getPlugin().getConfig().getString(API.ll[API.IIl[41]]);
        NOT_SUCCESS_REMOVE_HOME = Main.getPlugin().getConfig().getString(API.ll[API.IIl[42]]);
        API.homeFile = HomeFile.getInstance();
    }
    
    private static boolean IIIll(final int IlIlIIIIlllllll, final int lIIlIIIIlllllll) {
        return IlIlIIIIlllllll < lIIlIIIIlllllll;
    }
    
    public static HomeFile getDataFolder() {
        return API.homeFile;
    }
    
    public static void setHome(final Player IIIllIlIlllllll, final String lllIlIlIlllllll) {
        final double IllIlIlIlllllll = IIIllIlIlllllll.getLocation().getX();
        final double lIlIlIlIlllllll = IIIllIlIlllllll.getLocation().getY();
        final double IIlIlIlIlllllll = IIIllIlIlllllll.getLocation().getZ();
        final float llIIlIlIlllllll = IIIllIlIlllllll.getLocation().getYaw();
        final float IlIIlIlIlllllll = IIIllIlIlllllll.getLocation().getPitch();
        final String lIIIlIlIlllllll = IIIllIlIlllllll.getWorld().getName();
        if (!lllIl(getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(API.ll[API.IIl[0]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[1]]).append(lllIlIlIlllllll))))) {
            IIIllIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.ll[API.IIl[26]]).append(API.NOT_SUCCESS_CREATE_HOME))));
            return;
        }
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[2]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[3]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[4]])), (Object)IllIlIlIlllllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[5]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[6]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[7]])), (Object)lIlIlIlIlllllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[8]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[9]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[10]])), (Object)IIlIlIlIlllllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[11]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[12]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[13]])), (Object)llIIlIlIlllllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[14]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[15]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[16]])), (Object)IlIIlIlIlllllll);
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[17]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[18]]).append(lllIlIlIlllllll).append(API.ll[API.IIl[19]])), (Object)lIIIlIlIlllllll);
        final List<String> lIIllIlIlllllll = (List<String>)getDataFolder().getFile().getStringList(String.valueOf(new StringBuilder().append(API.ll[API.IIl[20]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[21]])));
        lIIllIlIlllllll.add(lllIlIlIlllllll);
        "".length();
        getDataFolder().getFile().set(String.valueOf(new StringBuilder().append(API.ll[API.IIl[22]]).append(IIIllIlIlllllll.getName()).append(API.ll[API.IIl[23]])), (Object)lIIllIlIlllllll);
        getDataFolder().saveData();
        IIIllIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(API.PREFIX).append(API.ll[API.IIl[24]]).append(API.SUCCESS_CREATE_HOME.replace(API.ll[API.IIl[25]], lllIlIlIlllllll)))));
        "".length();
        if (((0x95 ^ 0x81) & ~(0x34 ^ 0x20)) < 0) {
            return;
        }
    }
    
    private static void IllIl() {
        (IIl = new int[44])[0] = ((0x3D ^ 0x6E) & ~(0xF5 ^ 0xA6));
        API.IIl[1] = " ".length();
        API.IIl[2] = "  ".length();
        API.IIl[3] = "   ".length();
        API.IIl[4] = (0x72 ^ 0x76);
        API.IIl[5] = (184 + 188 - 284 + 107 ^ 108 + 149 - 161 + 102);
        API.IIl[6] = (0x2E ^ 0x28);
        API.IIl[7] = (151 + 87 - 237 + 162 ^ 120 + 90 - 162 + 116);
        API.IIl[8] = (0x5F ^ 0x54 ^ "   ".length());
        API.IIl[9] = (0x6F ^ 0x66);
        API.IIl[10] = (0x4C ^ 0x46);
        API.IIl[11] = (0x53 ^ 0x58);
        API.IIl[12] = (0x7 ^ 0xB);
        API.IIl[13] = (29 + 92 + 31 + 0 ^ 51 + 30 - 17 + 85);
        API.IIl[14] = (102 + 30 - 63 + 91 ^ 114 + 71 - 181 + 170);
        API.IIl[15] = (28 + 116 - 108 + 107 ^ 33 + 74 - 103 + 124);
        API.IIl[16] = (0x63 ^ 0x73);
        API.IIl[17] = (0xD2 ^ 0xC3);
        API.IIl[18] = (0xCE ^ 0x9D ^ (0x58 ^ 0x19));
        API.IIl[19] = (17 + 48 + 31 + 85 ^ 102 + 11 + 50 + 3);
        API.IIl[20] = (0 + 125 - 26 + 79 ^ 120 + 74 - 95 + 67);
        API.IIl[21] = (0x8F ^ 0x8A ^ (0xA9 ^ 0xB9));
        API.IIl[22] = (0x89 ^ 0x9F);
        API.IIl[23] = (75 + 121 - 163 + 122 ^ 4 + 37 + 89 + 10);
        API.IIl[24] = (92 + 5 - 13 + 57 ^ 87 + 105 - 124 + 81);
        API.IIl[25] = (0xCA ^ 0xAA ^ (0x37 ^ 0x4E));
        API.IIl[26] = (0xA7 ^ 0xBD);
        API.IIl[27] = (0x42 ^ 0x45 ^ (0x6C ^ 0x70));
        API.IIl[28] = (0xA8 ^ 0xB4);
        API.IIl[29] = (0x48 ^ 0x55);
        API.IIl[30] = (148 + 158 - 146 + 3 ^ 91 + 122 - 26 + 2);
        API.IIl[31] = (0x91 ^ 0x9C ^ (0x31 ^ 0x23));
        API.IIl[32] = (0x4B ^ 0x6B);
        API.IIl[33] = (164 + 45 - 167 + 144 ^ 71 + 143 - 133 + 74);
        API.IIl[34] = (201 + 49 - 71 + 47 ^ 126 + 123 - 169 + 112);
        API.IIl[35] = (0x35 ^ 0x16);
        API.IIl[36] = (54 + 38 + 65 + 1 ^ 103 + 26 - 116 + 173);
        API.IIl[37] = (0x97 ^ 0xB2);
        API.IIl[38] = (0xB1 ^ 0x97);
        API.IIl[39] = (46 + 91 + 45 + 42 ^ 18 + 189 - 149 + 141);
        API.IIl[40] = (0x88 ^ 0xA0);
        API.IIl[41] = (0x59 ^ 0x70);
        API.IIl[42] = (201 + 38 - 62 + 57 ^ 104 + 123 - 157 + 122);
        API.IIl[43] = (89 + 16 + 23 + 42 ^ 127 + 56 - 64 + 10);
    }
    
    private static String llIIl(String lIlIlIIIlllllll, final String lIIllIIIlllllll) {
        lIlIlIIIlllllll = (int)new String(Base64.getDecoder().decode(((String)lIlIlIIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIllIIIlllllll = new StringBuilder();
        final char[] lllIlIIIlllllll = lIIllIIIlllllll.toCharArray();
        int IllIlIIIlllllll = API.IIl[0];
        final byte IIIIlIIIlllllll = (Object)((String)lIlIlIIIlllllll).toCharArray();
        final int llllIIIIlllllll = IIIIlIIIlllllll.length;
        short IlllIIIIlllllll = (short)API.IIl[0];
        while (IIIll(IlllIIIIlllllll, llllIIIIlllllll)) {
            final char llIllIIIlllllll = IIIIlIIIlllllll[IlllIIIIlllllll];
            IIIllIIIlllllll.append((char)(llIllIIIlllllll ^ lllIlIIIlllllll[IllIlIIIlllllll % lllIlIIIlllllll.length]));
            "".length();
            ++IllIlIIIlllllll;
            ++IlllIIIIlllllll;
            "".length();
            if ((0x90 ^ 0x94) != (0x6B ^ 0x6F)) {
                return null;
            }
        }
        return String.valueOf(IIIllIIIlllllll);
    }
}
