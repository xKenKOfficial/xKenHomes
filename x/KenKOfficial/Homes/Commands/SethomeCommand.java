package x.KenKOfficial.Homes.Commands;

import java.util.Arrays;
import x.KenKOfficial.Homes.Basic.Main;
import org.bukkit.ChatColor;
import x.KenKOfficial.Homes.Apis.API;
import org.bukkit.entity.Player;
import x.KenKOfficial.Homes.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.command.CommandExecutor;

public class SethomeCommand implements CommandExecutor
{
    private static final /* synthetic */ String COMMAND_USAGE;
    private static final /* synthetic */ String WRONG_ARGS;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String NO_PERM;
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    
    private static String I(String lIIIIllllllllll, final String lIlIIllllllllll) {
        lIIIIllllllllll = (float)new String(Base64.getDecoder().decode(((String)lIIIIllllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIIllllllllll = new StringBuilder();
        final char[] llIIIllllllllll = lIlIIllllllllll.toCharArray();
        int IlIIIllllllllll = SethomeCommand.l[0];
        final long IIlllIlllllllll = (Object)((String)lIIIIllllllllll).toCharArray();
        final byte llIllIlllllllll = (byte)IIlllIlllllllll.length;
        double IlIllIlllllllll = SethomeCommand.l[0];
        while (IlIl((int)IlIllIlllllllll, llIllIlllllllll)) {
            final char lllIIllllllllll = IIlllIlllllllll[IlIllIlllllllll];
            IIlIIllllllllll.append((char)(lllIIllllllllll ^ llIIIllllllllll[IlIIIllllllllll % llIIIllllllllll.length]));
            "".length();
            ++IlIIIllllllllll;
            ++IlIllIlllllllll;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(IIlIIllllllllll);
    }
    
    private static boolean lIIl(final int lIlIllIllllllll) {
        return lIlIllIllllllll != 0;
    }
    
    private static String ll(final String IIlIIIlllllllll, final String lIIIIIlllllllll) {
        try {
            final SecretKeySpec lllIIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIIIlllllllll = Cipher.getInstance("Blowfish");
            IllIIIlllllllll.init(SethomeCommand.l[2], lllIIIlllllllll);
            return new String(IllIIIlllllllll.doFinal(Base64.getDecoder().decode(IIlIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlllllllll) {
            lIlIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIl(final int IIllllIllllllll, final int llIlllIllllllll) {
        return IIllllIllllllll == llIlllIllllllll;
    }
    
    private static boolean IIIl(final int llIIllIllllllll) {
        return llIIllIllllllll == 0;
    }
    
    public boolean onCommand(final CommandSender lllIlllllllllll, final Command IllIlllllllllll, final String lIlIlllllllllll, final String[] IlIIlllllllllll) {
        if (IIIl(lllIlllllllllll.hasPermission(SethomeCommand.I[SethomeCommand.l[0]]) ? 1 : 0)) {
            lllIlllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SethomeCommand.PREFIX).append(SethomeCommand.I[SethomeCommand.l[1]]).append(SethomeCommand.NO_PERM))));
            return SethomeCommand.l[0] != 0;
        }
        if (lIIl((lllIlllllllllll instanceof Player) ? 1 : 0)) {
            if (IlIl(IlIIlllllllllll.length, SethomeCommand.l[1])) {
                lllIlllllllllll.sendMessage(ChatUtil.fixColor(SethomeCommand.COMMAND_USAGE));
                return SethomeCommand.l[0] != 0;
            }
            if (llIl(IlIIlllllllllll.length, SethomeCommand.l[1])) {
                final String lIIllllllllllll = IlIIlllllllllll[SethomeCommand.l[0]];
                API.setHome((Player)lllIlllllllllll, lIIllllllllllll);
                return SethomeCommand.l[0] != 0;
            }
            lllIlllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SethomeCommand.PREFIX).append(SethomeCommand.I[SethomeCommand.l[2]]).append(SethomeCommand.WRONG_ARGS))));
            "".length();
            if (((0x6E ^ 0x71 ^ (0x29 ^ 0x1F)) & (39 + 124 - 50 + 17 ^ 80 + 68 - 99 + 122 ^ -" ".length())) != 0x0) {
                return ((0x19 ^ 0x4D ^ "   ".length()) & (0x51 ^ 0x7 ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllIlllllllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SethomeCommand.I[SethomeCommand.l[3]])));
        }
        return SethomeCommand.l[0] != 0;
    }
    
    static {
        lll();
        Ill();
        PREFIX = Main.getPlugin().getConfig().getString(SethomeCommand.I[SethomeCommand.l[4]]);
        NO_PERM = Main.getPlugin().getConfig().getString(SethomeCommand.I[SethomeCommand.l[5]]);
        WRONG_ARGS = Main.getPlugin().getConfig().getString(SethomeCommand.I[SethomeCommand.l[6]]);
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(SethomeCommand.I[SethomeCommand.l[7]]);
    }
    
    private static boolean IlIl(final int IIIlllIllllllll, final int lllIllIllllllll) {
        return IIIlllIllllllll < lllIllIllllllll;
    }
    
    private static void lll() {
        (l = new int[9])[0] = ((0x75 ^ 0x68) & ~(0xB5 ^ 0xA8));
        SethomeCommand.l[1] = " ".length();
        SethomeCommand.l[2] = "  ".length();
        SethomeCommand.l[3] = "   ".length();
        SethomeCommand.l[4] = (146 + 172 - 143 + 16 ^ 84 + 50 - 92 + 145);
        SethomeCommand.l[5] = (0xBE ^ 0xBB);
        SethomeCommand.l[6] = (6 + 19 + 36 + 103 ^ 89 + 132 - 110 + 51);
        SethomeCommand.l[7] = (0x43 ^ 0x18 ^ (0x9 ^ 0x55));
        SethomeCommand.l[8] = (0x4F ^ 0x47);
    }
    
    private static String Il(final String llllIIlllllllll, final String IlllIIlllllllll) {
        try {
            final SecretKeySpec IIlIlIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlllIIlllllllll.getBytes(StandardCharsets.UTF_8)), SethomeCommand.l[8]), "DES");
            final Cipher llIIlIlllllllll = Cipher.getInstance("DES");
            llIIlIlllllllll.init(SethomeCommand.l[2], IIlIlIlllllllll);
            return new String(llIIlIlllllllll.doFinal(Base64.getDecoder().decode(llllIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIlllllllll) {
            IlIIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void Ill() {
        (I = new String[SethomeCommand.l[8]])[SethomeCommand.l[0]] = I("Mx01IxkkGzU+XywEMS4LZQU1ORkkGzU=", "KvPMq");
        SethomeCommand.I[SethomeCommand.l[1]] = Il("WljlgZ2ihAE=", "oUTnl");
        SethomeCommand.I[SethomeCommand.l[2]] = ll("dQtizlF05j4=", "SIadm");
        SethomeCommand.I[SethomeCommand.l[3]] = I("GDcBaSQjPw4nKzVyBSAqbD8EMyEtch4zNjszCGk4bDkEJzwjPgJo", "LRkIO");
        SethomeCommand.I[SethomeCommand.l[4]] = Il("cfyL3eZ1xdo=", "AfeNL");
        SethomeCommand.I[SethomeCommand.l[5]] = ll("TjVlaf0SjoyVNsa9fCQdGg==", "ktxkN");
        SethomeCommand.I[SethomeCommand.l[6]] = I("AB0iPCMoDj81Nw==", "woMRD");
        SethomeCommand.I[SethomeCommand.l[7]] = Il("BjjqbLLcbWdJAcbrKm/AJAv4KMGfUIVX", "sdfpe");
    }
}
