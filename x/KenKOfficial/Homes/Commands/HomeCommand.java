package x.KenKOfficial.Homes.Commands;

import java.util.Iterator;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.Bukkit;
import x.KenKOfficial.Homes.Basic.Main;
import org.bukkit.World;
import org.bukkit.Location;
import org.bukkit.scheduler.BukkitRunnable;
import x.KenKOfficial.Homes.Apis.API;
import org.bukkit.entity.Player;
import x.KenKOfficial.Homes.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class HomeCommand implements CommandExecutor
{
    private static final /* synthetic */ String NO_PERM;
    private static final /* synthetic */ String TELEPORT_TIMER;
    private static final /* synthetic */ int[] IIll;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String DONT_FIND_HOME;
    private static final /* synthetic */ String TELEPORT_HOME;
    private static final /* synthetic */ String TELEPORT_CANCEL;
    private static final /* synthetic */ String HOMES_LIST;
    private static final /* synthetic */ String WRONG_ARGS;
    private static final /* synthetic */ String[] llIl;
    
    private static boolean IllIll(final int lIlIIIlllIlllll, final int IIlIIIlllIlllll) {
        return lIlIIIlllIlllll == IIlIIIlllIlllll;
    }
    
    private static boolean IIlIll(final int IIllllIllIlllll) {
        return IIllllIllIlllll != 0;
    }
    
    private static void IlIIll() {
        (IIll = new int[21])[0] = ((0x77 ^ 0xA ^ (0x16 ^ 0x4B)) & (0x68 ^ 0x2F ^ (0xDC ^ 0xBB) ^ -" ".length()));
        HomeCommand.IIll[1] = " ".length();
        HomeCommand.IIll[2] = "  ".length();
        HomeCommand.IIll[3] = "   ".length();
        HomeCommand.IIll[4] = (141 + 15 + 28 + 4 ^ 140 + 11 - 130 + 163);
        HomeCommand.IIll[5] = (0x9A ^ 0xA6 ^ (0x4E ^ 0x77));
        HomeCommand.IIll[6] = (0x84 ^ 0x82);
        HomeCommand.IIll[7] = (63 + 61 - 35 + 44 ^ 108 + 5 - 86 + 103);
        HomeCommand.IIll[8] = (28 + 91 + 3 + 60 ^ 24 + 36 + 13 + 117);
        HomeCommand.IIll[9] = (169 + 122 - 170 + 49 ^ 40 + 7 + 99 + 17);
        HomeCommand.IIll[10] = (0xEE ^ 0xA2 ^ (0xE1 ^ 0xA7));
        HomeCommand.IIll[11] = (0xAC ^ 0xA7);
        HomeCommand.IIll[12] = (0xBA ^ 0xB6);
        HomeCommand.IIll[13] = (0x8C ^ 0x81);
        HomeCommand.IIll[14] = (0x49 ^ 0x47);
        HomeCommand.IIll[15] = (0xE6 ^ 0x94 ^ (0xC0 ^ 0xBD));
        HomeCommand.IIll[16] = (0x1C ^ 0xC);
        HomeCommand.IIll[17] = (0x9F ^ 0x8E);
        HomeCommand.IIll[18] = (0xE9 ^ 0x9B ^ (0xE9 ^ 0x89));
        HomeCommand.IIll[19] = (0x16 ^ 0x5);
        HomeCommand.IIll[20] = (0x4A ^ 0x4E ^ (0x5C ^ 0x4C));
    }
    
    private static boolean lIlIll(final int lIIIIIlllIlllll, final int IIIIIIlllIlllll) {
        return lIIIIIlllIlllll < IIIIIIlllIlllll;
    }
    
    public boolean onCommand(final CommandSender IIIIIIIIIllllll, final Command IIlIIIIIIllllll, final String llIIIIIIIllllll, final String[] lllllllllIlllll) {
        if (llIIll(IIIIIIIIIllllll.hasPermission(HomeCommand.llIl[HomeCommand.IIll[0]]) ? 1 : 0)) {
            IIIIIIIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(HomeCommand.PREFIX).append(HomeCommand.llIl[HomeCommand.IIll[1]]).append(HomeCommand.NO_PERM))));
            return HomeCommand.IIll[0] != 0;
        }
        if (IIlIll((IIIIIIIIIllllll instanceof Player) ? 1 : 0)) {
            final Player IlIlIIIIIllllll = (Player)IIIIIIIIIllllll;
            final List<String> lIIlIIIIIllllll = (List<String>)API.getDataFolder().getFile().getStringList(String.valueOf(new StringBuilder().append(HomeCommand.llIl[HomeCommand.IIll[2]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand.llIl[HomeCommand.IIll[3]])));
            final StringBuilder IIIlIIIIIllllll = new StringBuilder();
            final Iterator<String> iterator = lIIlIIIIIllllll.iterator();
            while (IIlIll(iterator.hasNext() ? 1 : 0)) {
                final String IIllIIIIIllllll = iterator.next();
                IIIlIIIIIllllll.append(IIllIIIIIllllll).append(HomeCommand.llIl[HomeCommand.IIll[4]]);
                "".length();
                "".length();
                if (" ".length() >= "   ".length()) {
                    return ((30 + 63 + 67 + 93 ^ 51 + 72 - 100 + 142) & (0x7A ^ 0x3F ^ (0xA3 ^ 0xBE) ^ -" ".length())) != 0x0;
                }
            }
            final String lllIIIIIIllllll = String.valueOf(IIIlIIIIIllllll);
            if (lIlIll(lllllllllIlllll.length, HomeCommand.IIll[1])) {
                IIIIIIIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(HomeCommand.PREFIX).append(HomeCommand.llIl[HomeCommand.IIll[5]]).append(HomeCommand.HOMES_LIST.replace(HomeCommand.llIl[HomeCommand.IIll[6]], lllIIIIIIllllll)))));
                return HomeCommand.IIll[0] != 0;
            }
            if (IllIll(lllllllllIlllll.length, HomeCommand.IIll[1])) {
                final String llIlIIIIIllllll = lllllllllIlllll[HomeCommand.IIll[0]];
                if (lllIll(API.getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(HomeCommand.llIl[HomeCommand.IIll[7]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand.llIl[HomeCommand.IIll[8]]).append(llIlIIIIIllllll))))) {
                    IIIIIIIIIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(HomeCommand.PREFIX).append(HomeCommand.llIl[HomeCommand.IIll[9]]).append(HomeCommand.DONT_FIND_HOME))));
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return ((3 + 58 + 78 + 37 ^ 31 + 89 - 108 + 172) & (166 + 164 - 210 + 56 ^ 143 + 143 - 148 + 46 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    new BukkitRunnable() {
                        final /* synthetic */ Location last = new Location(this.world, this.x, this.y, this.z);
                        /* synthetic */ double z = IlIlIIIIIllllll.getLocation().getZ();
                        /* synthetic */ double x = IlIlIIIIIllllll.getLocation().getX();
                        private static final /* synthetic */ String[] lIl;
                        /* synthetic */ World world = IlIlIIIIIllllll.getWorld();
                        /* synthetic */ double y = IlIlIIIIIllllll.getLocation().getY();
                        private static final /* synthetic */ int[] Ill;
                        /* synthetic */ int i = Main.getPlugin().getConfig().getInt(HomeCommand$1.lIl[HomeCommand$1.Ill[0]]);
                        
                        public void run() {
                            if (Illll(this.i, HomeCommand$1.Ill[1])) {
                                this.cancel();
                                final double llIIllllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[1]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[2]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[3]])));
                                final double IlIIllllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[4]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[5]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[6]])));
                                final double lIIIllllIllllll = API.getDataFolder().getFile().getDouble(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[7]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[8]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[9]])));
                                final float IIIIllllIllllll = (float)API.getDataFolder().getFile().getInt(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[10]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[11]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[12]])));
                                final float llllIlllIllllll = (float)API.getDataFolder().getFile().getInt(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[13]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[14]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[15]])));
                                final String IlllIlllIllllll = API.getDataFolder().getFile().getString(String.valueOf(new StringBuilder().append(HomeCommand$1.lIl[HomeCommand$1.Ill[16]]).append(IlIlIIIIIllllll.getName()).append(HomeCommand$1.lIl[HomeCommand$1.Ill[17]]).append(llIlIIIIIllllll).append(HomeCommand$1.lIl[HomeCommand$1.Ill[18]])));
                                IlIlIIIIIllllll.teleport(new Location(Bukkit.getWorld(IlllIlllIllllll), llIIllllIllllll, IlIIllllIllllll, lIIIllllIllllll, IIIIllllIllllll, llllIlllIllllll));
                                "".length();
                                IlIlIIIIIllllll.sendMessage(ChatUtil.fixColor(HomeCommand.TELEPORT_HOME));
                                "".length();
                                if (-" ".length() == (0x19 ^ 0x1D)) {
                                    return;
                                }
                            }
                            else {
                                final double lIllIlllIllllll = IlIlIIIIIllllll.getLocation().getX();
                                final double IIllIlllIllllll = IlIlIIIIIllllll.getLocation().getY();
                                final double llIlIlllIllllll = IlIlIIIIIllllll.getLocation().getZ();
                                final World IlIlIlllIllllll = IlIlIIIIIllllll.getWorld();
                                final Location lIIlIlllIllllll = new Location(IlIlIlllIllllll, lIllIlllIllllll, IIllIlllIllllll, llIlIlllIllllll);
                                if (lllll(lIIlIlllIllllll.equals((Object)this.last) ? 1 : 0)) {
                                    this.i -= HomeCommand$1.Ill[1];
                                    IIIIIIIIIllllll.sendMessage(ChatUtil.fixColor(HomeCommand.TELEPORT_TIMER.replace(HomeCommand$1.lIl[HomeCommand$1.Ill[19]], String.valueOf(this.i))));
                                    "".length();
                                    if ((0xAF ^ 0xBA ^ (0x5B ^ 0x4A)) == " ".length()) {
                                        return;
                                    }
                                }
                                else {
                                    this.cancel();
                                    IIIIIIIIIllllll.sendMessage(ChatUtil.fixColor(HomeCommand.TELEPORT_CANCEL));
                                }
                            }
                        }
                        
                        private static void lIlll() {
                            (Ill = new int[21])[0] = ((0x26 ^ 0x4D ^ (0x30 ^ 0x6F)) & (0xCC ^ 0x9D ^ (0x5A ^ 0x3F) ^ -" ".length()));
                            HomeCommand$1.Ill[1] = " ".length();
                            HomeCommand$1.Ill[2] = "  ".length();
                            HomeCommand$1.Ill[3] = "   ".length();
                            HomeCommand$1.Ill[4] = (0x22 ^ 0x26);
                            HomeCommand$1.Ill[5] = (0xAD ^ 0xC6 ^ (0xFE ^ 0x90));
                            HomeCommand$1.Ill[6] = (72 + 91 - 40 + 42 ^ 156 + 43 - 46 + 10);
                            HomeCommand$1.Ill[7] = (51 + 85 - 6 + 39 ^ 103 + 42 - 42 + 71);
                            HomeCommand$1.Ill[8] = (0x84 ^ 0x8C);
                            HomeCommand$1.Ill[9] = (0x8 ^ 0x1);
                            HomeCommand$1.Ill[10] = (0x99 ^ 0x93);
                            HomeCommand$1.Ill[11] = (0x6B ^ 0x37 ^ (0x20 ^ 0x77));
                            HomeCommand$1.Ill[12] = (0x36 ^ 0x3A);
                            HomeCommand$1.Ill[13] = (61 + 7 - 6 + 100 ^ 7 + 32 + 53 + 83);
                            HomeCommand$1.Ill[14] = (87 + 196 - 206 + 126 ^ 120 + 41 - 30 + 66);
                            HomeCommand$1.Ill[15] = (0x9B ^ 0x94);
                            HomeCommand$1.Ill[16] = (0x4C ^ 0x5C);
                            HomeCommand$1.Ill[17] = (27 + 128 - 84 + 70 ^ 108 + 63 - 144 + 129);
                            HomeCommand$1.Ill[18] = (0x5 ^ 0x17);
                            HomeCommand$1.Ill[19] = (75 + 4 + 42 + 43 ^ 36 + 102 - 66 + 111);
                            HomeCommand$1.Ill[20] = (0x41 ^ 0x55);
                        }
                        
                        private static String IlIll(final String lIIIIIllIllllll, final String IlllllIlIllllll) {
                            try {
                                final SecretKeySpec IIlIIIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllllIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                                final Cipher llIIIIllIllllll = Cipher.getInstance("Blowfish");
                                llIIIIllIllllll.init(HomeCommand$1.Ill[2], IIlIIIllIllllll);
                                return new String(llIIIIllIllllll.doFinal(Base64.getDecoder().decode(lIIIIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                            }
                            catch (Exception IlIIIIllIllllll) {
                                IlIIIIllIllllll.printStackTrace();
                                return null;
                            }
                        }
                        
                        private static boolean IIIIIl(final int IIIlIlIlIllllll, final int lllIIlIlIllllll) {
                            return IIIlIlIlIllllll < lllIIlIlIllllll;
                        }
                        
                        static {
                            lIlll();
                            IIlll();
                        }
                        
                        private static boolean Illll(final int IIllIlIlIllllll, final int llIlIlIlIllllll) {
                            return IIllIlIlIllllll == llIlIlIlIllllll;
                        }
                        
                        private static boolean lllll(final int lIlIIlIlIllllll) {
                            return lIlIIlIlIllllll != 0;
                        }
                        
                        private static String llIll(final String IIlIllIlIllllll, final String lIIIllIlIllllll) {
                            try {
                                final SecretKeySpec lllIllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), HomeCommand$1.Ill[8]), "DES");
                                final Cipher IllIllIlIllllll = Cipher.getInstance("DES");
                                IllIllIlIllllll.init(HomeCommand$1.Ill[2], lllIllIlIllllll);
                                return new String(IllIllIlIllllll.doFinal(Base64.getDecoder().decode(IIlIllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                            }
                            catch (Exception lIlIllIlIllllll) {
                                lIlIllIlIllllll.printStackTrace();
                                return null;
                            }
                        }
                        
                        private static String lIIll(String lIIIlIllIllllll, final String lIlIlIllIllllll) {
                            lIIIlIllIllllll = new String(Base64.getDecoder().decode(lIIIlIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                            final StringBuilder IIlIlIllIllllll = new StringBuilder();
                            final char[] llIIlIllIllllll = lIlIlIllIllllll.toCharArray();
                            int IlIIlIllIllllll = HomeCommand$1.Ill[0];
                            final long IIllIIllIllllll = (Object)lIIIlIllIllllll.toCharArray();
                            final String llIlIIllIllllll = (String)IIllIIllIllllll.length;
                            long IlIlIIllIllllll = HomeCommand$1.Ill[0];
                            while (IIIIIl((int)IlIlIIllIllllll, (int)llIlIIllIllllll)) {
                                final char lllIlIllIllllll = IIllIIllIllllll[IlIlIIllIllllll];
                                IIlIlIllIllllll.append((char)(lllIlIllIllllll ^ llIIlIllIllllll[IlIIlIllIllllll % llIIlIllIllllll.length]));
                                "".length();
                                ++IlIIlIllIllllll;
                                ++IlIlIIllIllllll;
                                "".length();
                                if ((0xEC ^ 0x8B ^ (0x9 ^ 0x6A)) != (0xC3 ^ 0x8D ^ (0x44 ^ 0xE))) {
                                    return null;
                                }
                            }
                            return String.valueOf(IIlIlIllIllllll);
                        }
                        
                        private static void IIlll() {
                            (lIl = new String[HomeCommand$1.Ill[20]])[HomeCommand$1.Ill[0]] = lIIll("AzcdNC0fMR00", "kXpQr");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[1]] = lIIll("MAUDFR92", "Xjnpl");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[2]] = IlIll("d+4ceN7shtA=", "lgdBn");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[3]] = IlIll("23qtm6EN730=", "aSrah");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[4]] = IlIll("8zcuLKSyumg=", "KHrFq");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[5]] = IlIll("BHvTreIZ+Kk=", "mYkZq");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[6]] = llIll("XA71vAQ5fXI=", "kZyVk");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[7]] = lIIll("ABk3LiNG", "hvZKP");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[8]] = lIIll("TQ==", "cMtNB");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[9]] = IlIll("BfbZr4iGdSI=", "DnpWh");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[10]] = llIll("lD2nCcA+It8=", "FWVuN");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[11]] = llIll("fV8cAhofR8Y=", "bNDSG");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[12]] = llIll("+RVDj4aq56E=", "NJkXc");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[13]] = llIll("Hqw937cFyMk=", "xTERG");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[14]] = lIIll("fg==", "PlEyq");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[15]] = lIIll("eBsaBQk+", "Vksqj");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[16]] = lIIll("BgwrMDdA", "ncFUD");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[17]] = IlIll("fIu32CFVpyU=", "qrxTU");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[18]] = IlIll("iMX6rv9N6DA=", "vpXqL");
                            HomeCommand$1.lIl[HomeCommand$1.Ill[19]] = IlIll("0dF9BQcmFMtu26LKfFom3g==", "WZvGZ");
                        }
                    }.runTaskTimer((Plugin)Main.getPlugin(), 0L, 20L);
                    "".length();
                }
                "".length();
                if (-"  ".length() > 0) {
                    return ((0x79 ^ 0x52) & ~(0xB3 ^ 0x98)) != 0x0;
                }
            }
            else {
                IIIIIIIIIllllll.sendMessage(String.valueOf(new StringBuilder().append(HomeCommand.PREFIX).append(HomeCommand.llIl[HomeCommand.IIll[10]]).append(HomeCommand.WRONG_ARGS)));
            }
            "".length();
            if ("   ".length() == " ".length()) {
                return (("  ".length() ^ (0x36 ^ 0x61)) & (198 + 104 - 148 + 73 ^ 1 + 110 - 98 + 169 ^ -" ".length())) != 0x0;
            }
        }
        else {
            IIIIIIIIIllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(HomeCommand.llIl[HomeCommand.IIll[11]])));
        }
        return HomeCommand.IIll[0] != 0;
    }
    
    private static void lIIIll() {
        (llIl = new String[HomeCommand.IIll[20]])[HomeCommand.IIll[0]] = IlllIl("13HGznhw+BzLgF3Tp/NLeDVZZF0/6K2E", "gYLIk");
        HomeCommand.llIl[HomeCommand.IIll[1]] = IlllIl("8OjKhctb/bk=", "TDnYr");
        HomeCommand.llIl[HomeCommand.IIll[2]] = llllIl("oVjSjPFb9MI=", "buSbD");
        HomeCommand.llIl[HomeCommand.IIll[3]] = llllIl("1oJlOoLpFFlonogml5Q1tQ==", "BSoNo");
        HomeCommand.llIl[HomeCommand.IIll[4]] = IIIIll("UmRUamcW", "tSxJA");
        HomeCommand.llIl[HomeCommand.IIll[5]] = IIIIll("TQ==", "mwKbS");
        HomeCommand.llIl[HomeCommand.IIll[6]] = IlllIl("fSN7TbvsDgF9GaL5AAr80g==", "UmTGL");
        HomeCommand.llIl[HomeCommand.IIll[7]] = IlllIl("wiAzWZnAS0E=", "nNerO");
        HomeCommand.llIl[HomeCommand.IIll[8]] = llllIl("QeMN0SRCTW0=", "RzfqA");
        HomeCommand.llIl[HomeCommand.IIll[9]] = IIIIll("eA==", "XhkSV");
        HomeCommand.llIl[HomeCommand.IIll[10]] = IIIIll("Qw==", "cFbLM");
        HomeCommand.llIl[HomeCommand.IIll[11]] = IlllIl("qgbQ0aFBUO4pGxdQTqXcmd6Z/HViY7sFBbi6Jcdo8R65Ttl+2Gh1CQ==", "ixeQg");
        HomeCommand.llIl[HomeCommand.IIll[12]] = IlllIl("W7ZxyaIo3sc=", "TFZcW");
        HomeCommand.llIl[HomeCommand.IIll[13]] = IlllIl("ykQgMnL+XaOIKlEJkXmEwA==", "WauVi");
        HomeCommand.llIl[HomeCommand.IIll[14]] = IlllIl("t6dSEFHPFnAZSMR7fdZMug==", "nuSoC");
        HomeCommand.llIl[HomeCommand.IIll[15]] = IlllIl("b6nUmnOTk8/oIrgt9MTpCw==", "EAQox");
        HomeCommand.llIl[HomeCommand.IIll[16]] = IIIIll("LTw6IRErPCMbKCw9Mw==", "ESWDN");
        HomeCommand.llIl[HomeCommand.IIll[17]] = IIIIll("OyQ6IDcnLjsgGDw5IxoAPCYy", "SKWEh");
        HomeCommand.llIl[HomeCommand.IIll[18]] = IIIIll("CQ4jBDAVCCMEHT4MKxIcAAYr", "aaNao");
        HomeCommand.llIl[HomeCommand.IIll[19]] = IIIIll("PhknKyoiEyYrBTkEPhEWNxgpKxk=", "VvJNu");
    }
    
    private static String IlllIl(final String llIlIIlllIlllll, final String IlIlIIlllIlllll) {
        try {
            final SecretKeySpec IIIIlIlllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIlIIlllIlllll.getBytes(StandardCharsets.UTF_8)), HomeCommand.IIll[8]), "DES");
            final Cipher llllIIlllIlllll = Cipher.getInstance("DES");
            llllIIlllIlllll.init(HomeCommand.IIll[2], IIIIlIlllIlllll);
            return new String(llllIIlllIlllll.doFinal(Base64.getDecoder().decode(llIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIIlllIlllll) {
            IlllIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIIIll(String IlIlIllllIlllll, final String IlllIllllIlllll) {
        IlIlIllllIlllll = new String(Base64.getDecoder().decode(IlIlIllllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIllIllllIlllll = new StringBuilder();
        final char[] IIllIllllIlllll = IlllIllllIlllll.toCharArray();
        int llIlIllllIlllll = HomeCommand.IIll[0];
        final char lIlIIllllIlllll = (Object)IlIlIllllIlllll.toCharArray();
        final short IIlIIllllIlllll = (short)lIlIIllllIlllll.length;
        byte llIIIllllIlllll = (byte)HomeCommand.IIll[0];
        while (lIlIll(llIIIllllIlllll, IIlIIllllIlllll)) {
            final char IIIIlllllIlllll = lIlIIllllIlllll[llIIIllllIlllll];
            lIllIllllIlllll.append((char)(IIIIlllllIlllll ^ IIllIllllIlllll[llIlIllllIlllll % IIllIllllIlllll.length]));
            "".length();
            ++llIlIllllIlllll;
            ++llIIIllllIlllll;
            "".length();
            if (-" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lIllIllllIlllll);
    }
    
    static {
        IlIIll();
        lIIIll();
        PREFIX = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[12]]);
        NO_PERM = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[13]]);
        WRONG_ARGS = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[14]]);
        HOMES_LIST = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[15]]);
        DONT_FIND_HOME = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[16]]);
        TELEPORT_HOME = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[17]]);
        TELEPORT_TIMER = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[18]]);
        TELEPORT_CANCEL = Main.getPlugin().getConfig().getString(HomeCommand.llIl[HomeCommand.IIll[19]]);
    }
    
    private static String llllIl(final String IIIllIlllIlllll, final String lllIlIlllIlllll) {
        try {
            final SecretKeySpec lIlllIlllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIlllIlllIlllll = Cipher.getInstance("Blowfish");
            IIlllIlllIlllll.init(HomeCommand.IIll[2], lIlllIlllIlllll);
            return new String(IIlllIlllIlllll.doFinal(Base64.getDecoder().decode(IIIllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlllIlllll) {
            llIllIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIll(final int IlIlllIllIlllll) {
        return IlIlllIllIlllll == 0;
    }
    
    private static boolean lllIll(final Object IlllllIllIlllll) {
        return IlllllIllIlllll == null;
    }
}
