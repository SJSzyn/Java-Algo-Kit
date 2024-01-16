public class Exo5 {
        public static String decrypt(String encryptedMessage) {
            return encryptedMessage.replace("0", ""); // Replace all '0's with an empty string
        }

        public static void main(String[] args) {
            String encryptedMessage = "000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000" +
                    " c00o0000d00000e000000000000r000000000000000000" +
                    " 00000c0000000000o000m00000000000000m0e000" +
                    " 000000000s00i0000000000" +
                    " 0l000e00000000" +
                    " g000000000000a00000000000000000r0s0000" +
                    " 000000000000000000000000000q00000u0000000000000000000000000i00000000" +
                    " 000f000i0ni00000r0000000a" +
                    " 000p00000a00000r0000000000000000000000000000000" +
                    " m00000000000000a000in0t000000e00n000000000i00r0000000000000000" +
                    " 00000000000v00000000000o0000000t00r0000000e000000000" +
                    " 0c000o00d000000000e000000000" +
                    " 00e0000000000000000000000000000000000s0t0000000000000000000" +
                    " 0000000000000u0n00000" +
                    " 0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t0000h0e0" +
                    " 000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t" +
                    " 0000000q0u000000000i" +
                    " 00000000sa00000it00000" +
                    " 000où0000000000" +
                    " 000000v0000000o0000000000u000000000000000s000000000000000000" +
                    " 00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000" +
                    " 00(000000c0i0000000000000000000ta0ti0o00000000n" +
                    " 000000d000000000000000000e00" +
                    " 00J000o00000000000000h0n00" +
                    " 0W00o000000000000o00000000000d0000000s0000000000)0."; // Example encrypted message
            String decryptedMessage = decrypt(encryptedMessage);
            System.out.println("Decrypted Message: " + decryptedMessage);
        }

    }

