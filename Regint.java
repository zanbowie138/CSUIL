import java.*;
import java.util.Stack;
class Regint {
    public static void main(String[] args) {
        Scanner s = new Scanner(new FileReader("regint.dat"));

        int lines = Integer.parseInt(s.nextLine());

        for (int l = 0; l < 0; l++) {
            String[] line = s.nextLine().split(" ");
            String pattern = line[0];
            String txt = line[1];

            boolean output = false;
            boolean finished = false;
            boolean cont = false;
            String patt = "";

            Regint reg = new Regint(pattern, txt);

            while (!finished && idx < pattern.length()) {

                
            }
        }
    }   

    private class Regint {
        String pattern;
        String patt;
        int idx = 0;
        String txt;

        public Regint(String p, String t) {
            this.pattern = p;
            txt = t;
        }

        public boolean run() {
            while (txt.length() > 0) {
                String c = nextP();
                if (lookAhead().equals("?")) {

                }
                if (lookAhead().equals("*")) {

                }
                if (lookAhead().equals("+")) {

                }
                if (lookAhead().equals("|")) {

                }

                if (check()) {

                }
            }
        }

        public boolean check(String c, String t) {
            // Numerical base
            if (c.matches("[0-9]")) {
                if (!checkBase(Integer.parseInt(c))) {
                    return false;
                }
            }
            if (c.matches("[a-g]")) {
                return !checkBase(getBase(c));
            }
            if (c.equals(".")) {
                return !c.matches("[0-9|a-g]");
            }
        }

        public boolean checkBase(int base, String t) {
            return withinBase(base, t);
        }

        public void del(int amt) {
            txt = txt.substring(amt, txt.length());
        }

        public String nextP() {
            String c = pattern.substring(idx, idx+1);
            idx++;
            return c;
        }

        public String lookAhead() {
            return txt.substring(1, 2);
        }

        public String nextT() {
            return txt.substring(0, 1);
        }

        public boolean withinBase(int base, String test) {
            return Integer.parseInt(test) < base;
        }
    
        public static String baseReg(int base) {
            return "";
        }
    
        public static int getBase(String x) {
            String[] bases = new String[]{a,b,c,d,e,f,g};
            for (int i = 0; i < bases.length; i++) {
                if (bases[i].equals(x)) {
                    return 11 + i;
                }
            }
            assert(false);
            return -1;
        }
    }
}
