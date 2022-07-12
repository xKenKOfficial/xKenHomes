package x.KenKOfficial.Homes.Listeners;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import x.KenKOfficial.Homes.Utils.ChatUtil;
import x.KenKOfficial.Homes.Basic.Main;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] lll;
    private static final /* synthetic */ int[] IIIl;
    
    private static void lIlIIl() {
        (IIIl = new int[14])[0] = ((0x43 ^ 0x1C) & ~(0x7A ^ 0x25));
        PlayerJoin.IIIl[1] = " ".length();
        PlayerJoin.IIIl[2] = "  ".length();
        PlayerJoin.IIIl[3] = "   ".length();
        PlayerJoin.IIIl[4] = (86 + 119 - 41 + 9 ^ 84 + 40 + 33 + 12);
        PlayerJoin.IIIl[5] = (0x7A ^ 0x7F);
        PlayerJoin.IIIl[6] = (0x2D ^ 0x2B);
        PlayerJoin.IIIl[7] = (15 + 38 + 3 + 95 ^ 59 + 21 + 56 + 8);
        PlayerJoin.IIIl[8] = (0xDF ^ 0xBE ^ (0x2E ^ 0x47));
        PlayerJoin.IIIl[9] = (101 + 150 - 172 + 90 ^ 147 + 24 - 86 + 75);
        PlayerJoin.IIIl[10] = (0x47 ^ 0x4D);
        PlayerJoin.IIIl[11] = (" ".length() ^ (0x73 ^ 0x79));
        PlayerJoin.IIIl[12] = (0x2B ^ 0x52 ^ (0x1D ^ 0x68));
        PlayerJoin.IIIl[13] = (56 + 193 - 108 + 62 ^ 105 + 109 - 141 + 125);
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IllllIIlIllllll) {
        final Player lIlllIIlIllllll = IllllIIlIllllll.getPlayer();
        if (IllIIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.lll[PlayerJoin.IIIl[0]]) ? 1 : 0) && IllIIl(lIlllIIlIllllll.hasPermission(PlayerJoin.lll[PlayerJoin.IIIl[1]]) ? 1 : 0)) {
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[2]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[3]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[4]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[5]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[6]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[7]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.lll[PlayerJoin.IIIl[8]]).append(Bukkit.getBukkitVersion()))));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[9]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[10]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[11]]));
            lIlllIIlIllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.lll[PlayerJoin.IIIl[12]]));
        }
    }
    
    private static boolean IllIIl(final int llIIIllIIllllll) {
        return llIIIllIIllllll != 0;
    }
    
    private static String llIIIl(String lIIIlllIIllllll, final String IIIIlllIIllllll) {
        lIIIlllIIllllll = new String(Base64.getDecoder().decode(lIIIlllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIlllIIllllll = new StringBuilder();
        final char[] llIIlllIIllllll = IIIIlllIIllllll.toCharArray();
        int IlIIlllIIllllll = PlayerJoin.IIIl[0];
        final float IIllIllIIllllll = (Object)lIIIlllIIllllll.toCharArray();
        final long llIlIllIIllllll = IIllIllIIllllll.length;
        int IlIlIllIIllllll = PlayerJoin.IIIl[0];
        while (lllIIl(IlIlIllIIllllll, (int)llIlIllIIllllll)) {
            final char lllIlllIIllllll = IIllIllIIllllll[IlIlIllIIllllll];
            IIlIlllIIllllll.append((char)(lllIlllIIllllll ^ llIIlllIIllllll[IlIIlllIIllllll % llIIlllIIllllll.length]));
            "".length();
            ++IlIIlllIIllllll;
            ++IlIlIllIIllllll;
            "".length();
            if (((0xDD ^ 0x9E) & ~(0x6E ^ 0x2D)) < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlIlllIIllllll);
    }
    
    private static boolean lllIIl(final int IllIIllIIllllll, final int lIlIIllIIllllll) {
        return IllIIllIIllllll < lIlIIllIIllllll;
    }
    
    private static void IIlIIl() {
        (lll = new String[PlayerJoin.IIIl[13]])[PlayerJoin.IIIl[0]] = lIIIIl("3ibzt1Tz40aAIR84cT7IJQ==", "iyDtw");
        PlayerJoin.lll[PlayerJoin.IIIl[1]] = IlIIIl("7KXq/uf+baAT7+yytV7U2Gg6UmGQN40n", "EYoKV");
        PlayerJoin.lll[PlayerJoin.IIIl[2]] = llIIIl("Vm1WDlNNaE1fU01oTV9TTWhNXzVWZlYOFjswHioBHTADRFZWOS1fU01oTV9TTWhNX1NNaE0=", "pUpbn");
        PlayerJoin.lll[PlayerJoin.IIIl[3]] = IlIIIl("ynzKGCmnt5U=", "xOjic");
        PlayerJoin.lll[PlayerJoin.IIIl[4]] = llIIIl("aHZZJAE9NwcaS3BqTlIPMBsLGiUnPQsH", "HPntm");
        PlayerJoin.lll[PlayerJoin.IIIl[5]] = IlIIIl("sYKNyBOlsBc=", "siXmh");
        PlayerJoin.lll[PlayerJoin.IIIl[6]] = llIIIl("VEhUGS8GHQkvbExUQ2goRUBTYwgRGgI=", "tncNJ");
        PlayerJoin.lll[PlayerJoin.IIIl[7]] = lIIIIl("BB2PartjgPo=", "wZanh");
        PlayerJoin.lll[PlayerJoin.IIIl[8]] = IlIIIl("4TUiW1aGSgQvJ1EW2ieK/fybTLOwsnKqqM2L+QA+9Ik=", "zXHJF");
        PlayerJoin.lll[PlayerJoin.IIIl[9]] = IlIIIl("WLoaoJIgEPI=", "HkhFR");
        PlayerJoin.lll[PlayerJoin.IIIl[10]] = lIIIIl("pM9XjubexQ3C9Ff0x/+imxq50YPLXhcce1ZEXCoa2sVCpu/K3ct4nMDWsCc+QRgaB8mIfDCCUAk=", "BHWAK");
        PlayerJoin.lll[PlayerJoin.IIIl[11]] = llIIIl("RA==", "dfhgM");
        PlayerJoin.lll[PlayerJoin.IIIl[12]] = llIIIl("U0tqOXNITnFoc0hOcWhzSE5xaBVTQGo5Nj4WIh0hGBY/c3ZTHxFoc0hOcWhzSE5xaHNITnE=", "usLUN");
    }
    
    static {
        lIlIIl();
        IIlIIl();
    }
    
    private static String IlIIIl(final String IllIIIIlIllllll, final String lIlIIIIlIllllll) {
        try {
            final SecretKeySpec lIIlIIIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIlIllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.IIIl[8]), "DES");
            final Cipher IIIlIIIlIllllll = Cipher.getInstance("DES");
            IIIlIIIlIllllll.init(PlayerJoin.IIIl[2], lIIlIIIlIllllll);
            return new String(IIIlIIIlIllllll.doFinal(Base64.getDecoder().decode(IllIIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIIlIllllll) {
            lllIIIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIl(final String lIIIlIIlIllllll, final String IlIIlIIlIllllll) {
        try {
            final SecretKeySpec IllIlIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlIlIIlIllllll = Cipher.getInstance("Blowfish");
            lIlIlIIlIllllll.init(PlayerJoin.IIIl[2], IllIlIIlIllllll);
            return new String(lIlIlIIlIllllll.doFinal(Base64.getDecoder().decode(lIIIlIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIlIIlIllllll) {
            IIlIlIIlIllllll.printStackTrace();
            return null;
        }
    }
}
