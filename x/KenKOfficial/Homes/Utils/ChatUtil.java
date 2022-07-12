package x.KenKOfficial.Homes.Utils;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatUtil
{
    private static final /* synthetic */ String[] llll;
    private static final /* synthetic */ int[] IIIIl;
    
    private static void IlIIIIl() {
        (IIIIl = new int[9])[0] = ((0x2C ^ 0x4D) & ~(0xF8 ^ 0x99));
        ChatUtil.IIIIl[1] = " ".length();
        ChatUtil.IIIIl[2] = "  ".length();
        ChatUtil.IIIIl[3] = "   ".length();
        ChatUtil.IIIIl[4] = (0x4A ^ 0x43 ^ (0xB7 ^ 0xBA));
        ChatUtil.IIIIl[5] = (0x60 ^ 0x65);
        ChatUtil.IIIIl[6] = (0x64 ^ 0x4C ^ (0x6B ^ 0x45));
        ChatUtil.IIIIl[7] = (0xDE ^ 0xAE ^ (0xE1 ^ 0x96));
        ChatUtil.IIIIl[8] = (0xD6 ^ 0x8B ^ (0x2F ^ 0x7A));
    }
    
    public static String fixColor(final String llllIllIlIlllll) {
        return llllIllIlIlllll.replaceAll(ChatUtil.llll[ChatUtil.IIIIl[0]], ChatUtil.llll[ChatUtil.IIIIl[1]]).replace(ChatUtil.llll[ChatUtil.IIIIl[2]], ChatUtil.llll[ChatUtil.IIIIl[3]]).replace(ChatUtil.llll[ChatUtil.IIIIl[4]], ChatUtil.llll[ChatUtil.IIIIl[5]]).replace(ChatUtil.llll[ChatUtil.IIIIl[6]], ChatUtil.llll[ChatUtil.IIIIl[7]]);
    }
    
    private static String Illlll(final String lIIllIlIlIlllll, final String IllIlIlIlIlllll) {
        try {
            final SecretKeySpec IIlllIlIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlIlIlIlllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.IIIIl[8]), "DES");
            final Cipher llIllIlIlIlllll = Cipher.getInstance("DES");
            llIllIlIlIlllll.init(ChatUtil.IIIIl[2], IIlllIlIlIlllll);
            return new String(llIllIlIlIlllll.doFinal(Base64.getDecoder().decode(lIIllIlIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIlIlIlllll) {
            IlIllIlIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIl() {
        (llll = new String[ChatUtil.IIIIl[8]])[ChatUtil.IIIIl[0]] = Illlll("r+Q7OHHcFdE=", "htEoX");
        ChatUtil.llll[ChatUtil.IIIIl[1]] = Illlll("lMsnKCRX2kg=", "hybBo");
        ChatUtil.llll[ChatUtil.IIIIl[2]] = llllll("/M5A7vQckQU=", "XWaYI");
        ChatUtil.llll[ChatUtil.IIIIl[3]] = llllll("2VgFadlZhAY=", "ymyTo");
        ChatUtil.llll[ChatUtil.IIIIl[4]] = Illlll("lu/XAfFsptg=", "ppeOj");
        ChatUtil.llll[ChatUtil.IIIIl[5]] = Illlll("U9o06tnmQi4=", "JKZtl");
        ChatUtil.llll[ChatUtil.IIIIl[6]] = llllll("1rO6vgg4TsQ=", "QYpcz");
        ChatUtil.llll[ChatUtil.IIIIl[7]] = IIIIIIl("XA==", "VKAMJ");
    }
    
    private static boolean llIIIIl(final int lIIlllIIlIlllll, final int IIIlllIIlIlllll) {
        return lIIlllIIlIlllll < IIIlllIIlIlllll;
    }
    
    static {
        IlIIIIl();
        lIIIIIl();
    }
    
    private static String IIIIIIl(String IIlIIIlIlIlllll, final String IIIlIIlIlIlllll) {
        IIlIIIlIlIlllll = new String(Base64.getDecoder().decode(IIlIIIlIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIIIlIlIlllll = new StringBuilder();
        final char[] IllIIIlIlIlllll = IIIlIIlIlIlllll.toCharArray();
        int lIlIIIlIlIlllll = ChatUtil.IIIIl[0];
        final char llllllIIlIlllll = (Object)IIlIIIlIlIlllll.toCharArray();
        final short IlllllIIlIlllll = (short)llllllIIlIlllll.length;
        Exception lIllllIIlIlllll = (Exception)ChatUtil.IIIIl[0];
        while (llIIIIl((int)lIllllIIlIlllll, IlllllIIlIlllll)) {
            final char IlIlIIlIlIlllll = llllllIIlIlllll[lIllllIIlIlllll];
            lllIIIlIlIlllll.append((char)(IlIlIIlIlIlllll ^ IllIIIlIlIlllll[lIlIIIlIlIlllll % IllIIIlIlIlllll.length]));
            "".length();
            ++lIlIIIlIlIlllll;
            ++lIllllIIlIlllll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllIIIlIlIlllll);
    }
    
    private static String llllll(final String IIlIIllIlIlllll, final String llIIIllIlIlllll) {
        try {
            final SecretKeySpec lIIlIllIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIlIllIlIlllll = Cipher.getInstance("Blowfish");
            IIIlIllIlIlllll.init(ChatUtil.IIIIl[2], lIIlIllIlIlllll);
            return new String(IIIlIllIlIlllll.doFinal(Base64.getDecoder().decode(IIlIIllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlIlllll) {
            lllIIllIlIlllll.printStackTrace();
            return null;
        }
    }
}
