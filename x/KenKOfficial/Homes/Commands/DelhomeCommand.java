package x.KenKOfficial.Homes.Commands;

import x.KenKOfficial.Homes.Basic.Main;
import org.bukkit.ChatColor;
import x.KenKOfficial.Homes.Apis.API;
import org.bukkit.entity.Player;
import x.KenKOfficial.Homes.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.command.CommandExecutor;

public class DelhomeCommand implements CommandExecutor
{
    private static final /* synthetic */ String NO_PERM;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] Il;
    private static final /* synthetic */ String WRONG_ARGS;
    private static final /* synthetic */ String COMMAND_USAGE;
    
    private static boolean lIIIl(final int llllIllIlllllll, final int IlllIllIlllllll) {
        return llllIllIlllllll == IlllIllIlllllll;
    }
    
    private static boolean Illl(final int IllIIllIlllllll) {
        return IllIIllIlllllll == 0;
    }
    
    private static String lIl(final String IIlllIIllllllll, final String llIllIIllllllll) {
        try {
            final SecretKeySpec lllllIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllllIIllllllll = Cipher.getInstance("Blowfish");
            IllllIIllllllll.init(DelhomeCommand.Il[2], lllllIIllllllll);
            return new String(IllllIIllllllll.doFinal(Base64.getDecoder().decode(IIlllIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIllllllll) {
            lIlllIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIl(final String llllIIIllllllll, final String IlllIIIllllllll) {
        try {
            final SecretKeySpec IlIIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlllIIIllllllll.getBytes(StandardCharsets.UTF_8)), DelhomeCommand.Il[8]), "DES");
            final Cipher lIIIlIIllllllll = Cipher.getInstance("DES");
            lIIIlIIllllllll.init(DelhomeCommand.Il[2], IlIIlIIllllllll);
            return new String(lIIIlIIllllllll.doFinal(Base64.getDecoder().decode(llllIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIIllllllll) {
            IIIIlIIllllllll.printStackTrace();
            return null;
        }
    }
    
    public boolean onCommand(final CommandSender IllIIlIllllllll, final Command lIIlIlIllllllll, final String IIIlIlIllllllll, final String[] lIlIIlIllllllll) {
        if (Illl(IllIIlIllllllll.hasPermission(DelhomeCommand.I[DelhomeCommand.Il[0]]) ? 1 : 0)) {
            IllIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(DelhomeCommand.PREFIX).append(DelhomeCommand.I[DelhomeCommand.Il[1]]).append(DelhomeCommand.NO_PERM))));
            return DelhomeCommand.Il[0] != 0;
        }
        if (llll((IllIIlIllllllll instanceof Player) ? 1 : 0)) {
            if (IIIIl(lIlIIlIllllllll.length, DelhomeCommand.Il[1])) {
                IllIIlIllllllll.sendMessage(ChatUtil.fixColor(DelhomeCommand.COMMAND_USAGE));
                return DelhomeCommand.Il[0] != 0;
            }
            if (lIIIl(lIlIIlIllllllll.length, DelhomeCommand.Il[1])) {
                final String IIllIlIllllllll = lIlIIlIllllllll[DelhomeCommand.Il[0]];
                API.delHome((Player)IllIIlIllllllll, IIllIlIllllllll);
                return DelhomeCommand.Il[0] != 0;
            }
            IllIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(DelhomeCommand.PREFIX).append(DelhomeCommand.I[DelhomeCommand.Il[2]]).append(DelhomeCommand.WRONG_ARGS))));
            "".length();
            if ((100 + 91 - 180 + 168 ^ 157 + 14 - 72 + 84) <= 0) {
                return ((19 + 15 + 8 + 112 ^ 94 + 143 - 191 + 110) & (0xF6 ^ 0xC4 ^ (0x2F ^ 0x1B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            IllIIlIllllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(DelhomeCommand.I[DelhomeCommand.Il[3]])));
        }
        return DelhomeCommand.Il[0] != 0;
    }
    
    private static boolean IIIIl(final int llIlIllIlllllll, final int IlIlIllIlllllll) {
        return llIlIllIlllllll < IlIlIllIlllllll;
    }
    
    static {
        lIll();
        IIll();
        PREFIX = Main.getPlugin().getConfig().getString(DelhomeCommand.I[DelhomeCommand.Il[4]]);
        NO_PERM = Main.getPlugin().getConfig().getString(DelhomeCommand.I[DelhomeCommand.Il[5]]);
        WRONG_ARGS = Main.getPlugin().getConfig().getString(DelhomeCommand.I[DelhomeCommand.Il[6]]);
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(DelhomeCommand.I[DelhomeCommand.Il[7]]);
    }
    
    private static boolean llll(final int IIIlIllIlllllll) {
        return IIIlIllIlllllll != 0;
    }
    
    private static void IIll() {
        (I = new String[DelhomeCommand.Il[8]])[DelhomeCommand.Il[0]] = l("HyMSBzsIJRIafQA6FgopSSwSBTsIJRI=", "gHwiS");
        DelhomeCommand.I[DelhomeCommand.Il[1]] = l("aA==", "HLZMS");
        DelhomeCommand.I[DelhomeCommand.Il[2]] = l("UA==", "pGxLX");
        DelhomeCommand.I[DelhomeCommand.Il[3]] = IIl("t8URP/VTWsuLx0nLpxIZZzCkEwpl2NmYKbyDCsrxn69DK6QCrSe/Dg==", "Jdvwl");
        DelhomeCommand.I[DelhomeCommand.Il[4]] = l("FR0hHjgd", "eoDxQ");
        DelhomeCommand.I[DelhomeCommand.Il[5]] = IIl("Wa0/AaXyqgR/Z2T3MLcpTA==", "mlkYp");
        DelhomeCommand.I[DelhomeCommand.Il[6]] = lIl("ajux30Eu9JLavrlx8qOhnQ==", "WRtWs");
        DelhomeCommand.I[DelhomeCommand.Il[7]] = l("NAQFIzc9BDYoNz0MCCU8DxQaKj81", "PaiKX");
    }
    
    private static void lIll() {
        (Il = new int[9])[0] = ((0x18 ^ 0x78) & ~(0x1D ^ 0x7D));
        DelhomeCommand.Il[1] = " ".length();
        DelhomeCommand.Il[2] = "  ".length();
        DelhomeCommand.Il[3] = "   ".length();
        DelhomeCommand.Il[4] = (0x94 ^ 0x90);
        DelhomeCommand.Il[5] = (0x98 ^ 0x9D);
        DelhomeCommand.Il[6] = (34 + 126 - 115 + 101 ^ 6 + 119 - 72 + 95);
        DelhomeCommand.Il[7] = (0x9 ^ 0xE);
        DelhomeCommand.Il[8] = (0xBB ^ 0x91 ^ (0x0 ^ 0x22));
    }
    
    private static String l(String IlIllllIlllllll, final String lIIllllIlllllll) {
        IlIllllIlllllll = new String(Base64.getDecoder().decode(IlIllllIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIlllllIlllllll = new StringBuilder();
        final char[] IIlllllIlllllll = lIIllllIlllllll.toCharArray();
        int llIllllIlllllll = DelhomeCommand.Il[0];
        final long lIlIlllIlllllll = (Object)IlIllllIlllllll.toCharArray();
        final short IIlIlllIlllllll = (short)lIlIlllIlllllll.length;
        char llIIlllIlllllll = (char)DelhomeCommand.Il[0];
        while (IIIIl(llIIlllIlllllll, IIlIlllIlllllll)) {
            final char IIIIIIIllllllll = lIlIlllIlllllll[llIIlllIlllllll];
            lIlllllIlllllll.append((char)(IIIIIIIllllllll ^ IIlllllIlllllll[llIllllIlllllll % IIlllllIlllllll.length]));
            "".length();
            ++llIllllIlllllll;
            ++llIIlllIlllllll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIlllllIlllllll);
    }
}
