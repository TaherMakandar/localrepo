package signature1.signature.demo1;

public class Temp {
//	 @Value("${cr.jwsSignature.privatekey}")
//    private static String privateKeyPEM="MIIEowIBAAKCAQEAyMzHt4zMlplvP6XvbxfE7TivX0T2w1yN7uWPX/428jlr51PqJIuv2Mv1q3QAnty9hBlz+VLw5prXvl1xUlr9BYqjBQR7ijMBRCJcXZK26u4auzyFA5YAZQ9sGGUxJrtYwHsFIXN58g6tZbQPYmQWXtaoGWTC+UUEXPb5BngiKyAcUpgmyfUM1fseQjz7V6v/LlhdWOPtEPBzx7s+CpvjoiuqEVTk6RcBd8+PTGsbuHL7r3fDb1haWdc7RJ0LbnP0rmA301wEWDdQTV/QVUN2eY8eNIRBbGmYXOzqjI5DCxAm+gL3ztDtKNQW9sLiI14YEIb4aonV36rhj8xtSDCU5QIDAQABAoIBAGdXxT25MB4d73yBaR3yzL4OG2vbsWhQPRgDe2u7CQpW9SrELFAMuD7KkbBg7mTUVJElDGP4BNWaQYjOzKDHBUuR016ktPQmVfN7/6+E77EvRACzH/39eEyKyGYxxj8Z0o6Vgcl6hftHBITAS96mhkDfFvqiuhnSJHG4BegHcgZhAV79wbVKfjQ2O7NTjykjf8v13BOQyVFjnzvcXccsA263nz9Mb0ZkyRSBJ8hSH4PIhbkkfqBgfIyKleRMZsmT4aYqUhBSla84nPeF0Y2Ouz3zWtJiWfAmfRRk6QYg9HfmX4yB0zR9FZC/BkoyBIV5+M7BQDXgPg7ucwsOXmGcc40CgYEA8zofkQwxXE/CEzc4uS1QnORL3T6fOc//BxzU1SHJK5q97av4gEUe5sxYpVa+IkM7yxfEA4HTQMCw7gF4gDvNA0CCSajZEkQtLfu/xT7YImPPsUHcyTSY7RLqnAW+K+GF6v9lKPQkp7ObIw3LS4a+9PiwYInV8POjKqj595glmOsCgYEA01hHRow9HeHGzO455IQQjjdVsInF0hMxCdIPNVMJshC9tgdTCbraLmDqJjhM9K1MENi3NHL1DTvr+Fb1MI0/biGJEswztPkxG1e6pTaFvDp+WfetaPlDcSLYXJsIU8DsAQtTmorLZ5suxkFL0NCnf77FLqpc9b1qqg5BkpkIFW8CgYEAgaOiPZplGNG+HKXbSv/3LpiUQwlkrtjJEo5wdmU6p04kG3EE08GDtfqG6SFx2CtDzH0PUds5sRLDeyg3hQnavPf+OaqQgKbr+c1sKoLTiojuo4j6WBf7xqjFeYGqGhNrYJTd41U10FjvwGBS0h+w2jtPLzVoXbRObKeCDFEBAR8CgYBvjy/Ae5JfTaiE0FNa3qNmjqr6zx7O7zZ5eppwiW6awd+CUIdyoWE+DgZLOnjUxw1Z7yt10iCsZa7/ndc7U7PhzG3wsD2zD77uMfbh8s/RNgcwMl8lBD6nX79Z0rQokbOCMZpl/1GzVOTx3dHJXfqsoeSv51m+lcfSEEhou8LanQKBgBlZ392tcd1hNvvFVIgWJjAexUDUJnGCdx0HfRUQB56s3agpp2G7hcG0YrihH30eGc/0oCi0jvchzeGPlr2VCSQuosQlCihl179yt657dwaCqiYRbGDFqxEr5xWqGFpVierYPY1/tJDSSFgXYzr3mQGmykG//C5IIqZC6SQhMCgn";

// private static String convertPEMtoJSONWebKey(String privateKeyPEM) throws Exception {
//        // Remove PEM header, footer, and newline characters
//       
//
//        // Decode base64 encoded private key
//        byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyPEM);
//
//        // Parse PKCS#1 encoded private key
//        BigInteger privateKeyModulus = new BigInteger(1, privateKeyBytes);
//
//        // Create RSAPrivateKeySpec
//        RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(privateKeyModulus, BigInteger.ZERO); // Exponent is 0 for private key
//
//        // Generate PrivateKey object
//        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
//
//        // Convert RSA private key to JWK format
//        String n = Base64.getUrlEncoder().encodeToString(privateKeyModulus.toByteArray());
//        String e = "AQAB"; // Default public exponent for RSA
//        String d = Base64.getUrlEncoder().encodeToString(privateKeyBytes);
//
//        String jwk = "{\"kty\":\"RSA\",\"n\":\"" + n + "\",\"e\":\"" + e + "\",\"d\":\"" + d + "\"}";
//System.out.println("jwk format"+jwk);
//        // Print JWK
//        return jwk;
//    }
//	static String signature = "eyJhbGciOiJSUzI1NiIsImI2NCI6dHJ1ZSwiY3JpdCI6WyJiNjQiXX0..HdRa-l47uK1lKZhUfTsNMlHiNbZyDMUa45Ih2GCaNEpjH2SyQ-Jf_dg6FB-6SrozB7PJbk2PB5ek2V6XbMxZFqbF0jMK3i9CVNx0O3lxenESv0rMKFWY_wGA5Wy2-kXCWX8s1KBklaTNggpXyDSeW3cvcw6mE36stP7OvUmaqK-bVB-pR3XFlNwhK0OpJHDR873SRDcWlIk85PsSYT_B0RNdtXpiBGqpoW_qkDJVFQh0mbcxqxS89dBckrc-ZrBsCtbhv_MNePjSx0m1cetjiZ8_SgTbfJTI7oLBnej0DQrD_DyRMKntVxvbSMSeNGDEKnUgOCFdbXeESFuzEkA9kF4k1k7tc1-i0cAMSEpRZIB6_DY_V2CPljfajiCxXsfEDvNXCLfeJFlIlr7vSdQ1vH-JxyYMQB17EbB3Cg5Ws1UnxShcFZvra7whFGvOx_KW8pjS6cqwl2JNT6B8Y219GGE-cWZQXjoo5ay_yvzV6Ju-w0yOd9K3vPvKUZiPwUJTaDTuDIrrCsczg8v8L54xULpq2Rw-VfQq_j7YqzSVEoLtiDuWc76gI3XjlODvS_s9xqr25QJNfubKz8s8SRpG7zwxQibO6BhgN_uDFbm29DJYV_V0irfzIPvuh5oKwxIUPCRFzJJamCrN4CwGHt3my0uBF7m9s9CAEkc7QSSaXajgGina7joH1DF8PZykiFkiOWvT1PoZltqrufwqbyWOi6EBVuhAg5HjXuAnIXsi-_jrwNxYon6EfECe9NQozl1ZeEnmF_FPPw3paVet0XobusB6_nDa3lBEDtiyGwJXMSlkDx4VTSpcIgU8TRfyXgKRuTH4Ig8FfaEakDPwSjklDQCP_BMbQ7_z1coxCESQPmmsciuAYEiNfg0hyImT6uY9OHxqcjU2pmcmkgOFTe_y1m8-JF0-C2mBoDDjCu6FuXDRDYaojRNAKGnjnRGxubV7rwnoo5T3Mr8dIohAF4uQxh5hX_2P0zGaxzC9-xQSa0xxHQEkqOwrmnkorpv9Zh7yoiZ3WbqNDpOB4mVeNGuktCJXNmGKfXU52zsaKrFJamLZrXqP_MLO7O5Wh1izFmPFzvlc1AVb_OnIZ3FXaKnVy0E1oBeyVjjSnhMOx2l_bikMKz8-1bhnmyWiOi6J3MNqDi1TxwcZuqGU1KfhWl_ApkaORe9J9LtVkUpaR6PDiQLKDfg6xl0S60ZyQvomWEcWEBhDPMsAw8lGE3o-I7cFgG2FhIt6jXZXWEPtTsojhKkp9UMP5fHQp8q9D_hJAza7TXKH8diNSeI0xsfiGlJrir6mHSUQKaKf7_k3-qlLu_PzKB2kMTjrz4aafBPL8ivyheQW0HA3uisNaU4Q3nA6wTn3DnU2uSyuxSy3S_AE0On3S4E-qc6FnlUzcF16snrk0Lm1vgHuwV5EJDNCT4U0Su-tCymr0kvhjiW-hNk9Cp8R65i39VhdHOdh6rYdtU1QieXkIBOwvGfoR1pqgo1KDzlKikxt4_WQYwIh1a52ieqLMOobFaRJCVhKfRXLh0X1f4gijT6tiv_eEF87MSfVQkkF9f1R0iP6IqBKGTjdiMT3vFhtNTHa";	
//	
//private static JsonWebKeySet rsaJsonWebKeySet;
//static String detachedSignature = "eyJhbGciOiJSUzI1NiIsImtpZCI6IkRwQ2o4d1hvMXFYcTc4WHk5T2traXprTHdBMFlVeWdlQkJyMHZCMzlOZlkiLCJiNjQiOmZhbHNlfQ..miLSurDdWYq6R1b2pKSdbGAANbEQ6P9XouHmYOAEC-HkzH0Lzgucv2YwK0-yexCpmjNj3gfBHkzWGVbdvdM580IP5u35tIyAVnKrWEFOwJHR4d9wnfquuXu1Vn2sffSrt_tryakcbRrIVQuC_9NilI6dv4fL_jvrbZZN6cNHM25aUreeEAYb7FS51hMqHNnbK8CUHmTGPMfWJhDQbwy3QcuyAsepIDNanbCMJy_EF-fLXBSwH7voR7QS9w3HMx78ihBRC6tF0olK1sK6tzs0-RFzSAjUJvsrGbPPP3aAdbGECI0o1-W7hzYDzrM9t73vDfXi46T0F5zI0ApgD6cH4Q";
////static String payload = "{\"ver\": \"1.0\", \"timestamp\": \"2024-02-26 16:59:14.473\", \"txnid\": \"29ae-11e8-a8d7-0290\", \"requester\": {\"name\": \"Bank Ltd\", \"id\": \"AAeW\"}, \"entityinfo\": {\"name\": \"Bank Ltd\", \"id\": \"AAeW\", \"code\": \"BBL2\", \"entityhandle\": \"\", \"Identifiers\": [], \"baseurl\": \"fiup.olivecrypto.com\", \"webviewurl\": \"null\", \"fitypes\": [], \"certificate\": {\"alg\": \"RS256\", \"e\": \"AQAB\", \"kid\": \"pPJQ9l0d0wnDkFIijxcTnLwUdS__8vUBlOgkUhQRq8g\", \"kty\": \"RSA\", \"n\": \"kfp4bwdAo6psrfUTXHyZ9xh7f9m6T6kAkQ4LJIzx6aWRvSB6lopxgzv18yA8GXkyF6JBab_dWWgsCkaO7e9vMyWpZ4wGXLsybA5qtrihKH6dJYJHG6TZrqFxoJ9lEz6W3HO_5zQIizY3GKIkWI8bhpCEKqmegYjGyaTE8FiwEEmY-1j4zhfrQv_I7EY1T5gI6S0XYxdJfQQWWmq1FYv7kKG1PAJsy_Ww4WbLY8kGu4ovRNtEuNKDVvmz417C83RvXR4mAYsIDmKYbjoxlveF0liRZc2tNwTrhbp8DWvWaNBbfevTm850oUsCCVLmXe-oQqWodWSZXANbwbwRswxaXw\", \"use\": \"sig\"}, \"tokeninfo\": {\"url\": \"\", \"desc\": \"\"}, \"gsp\": \"null\", \"signature\": {}, \"inboundports\": [\"4200\"], \"outboundports\": [\"8080\"], \"ips\": [\"192.168.0.0\", \"192.0.25.4\"], \"credentialsPk\": {\"alg\": \"RS256\", \"e\": \"AQAB\", \"kid\": \"key7894\", \"kty\": \"RSA\", \"n\": \"9s87F3S_D1...\", \"use\": \"enc\"}, \"oldEntityId\": \"null\"}}";
//
//public SignatureDemoApplication() throws Exception {
//rsaJsonWebKeySet = new JsonWebKeySet("{\n" +
//		"    \"keys\": [\n" +
//		"        {\n" +
//		"            \"p\": \"-UNTuBtSd_A3pC_cY55-yviyXw6Zo5J8cjiAaOSmNetEkTqe0kBVXycUHniaGaB6Bxu8DNtvaoQb3Q1h2q3cjAh8ybGdGlWaVrp-mYef8iljNBN27RqTvtNxEFYY2Dt3wGof1NRO8S7UALFNaVntZcO4bWps_c5fvm0bSyej46c\",\n" +
//		"            \"kty\": \"RSA\",\n" +
//		"            \"q\": \"kO8l7cIS4glNFi_1Ud1SR8UYl6rdOwZwinpOLiUeMY-3FC5-uDkGfk27fJskMxJjSWXWggNmgRyRpUG5NoKqTkzjuNPWXNj5frbk_2FilJHF_ZSYLZoN8wki4AJADWBRE5YK6fJqFN9AgfMPQYK4qvkAz8WD5W2YUjsnNl8Mooc\",\n" +
//		"            \"d\": \"ev1FaL1P9Lue8aHMYpv1rbsyIJL1A_tIm1DLG58C37FA7MBFA-0XHEti51j-Ye7IiHR8_9dg34rBp90zf2F-OkRFkPBKJbKsIRAxe2GdIz0qvZMlsizau5Z2qd-dSEa7BiklGDV8oTqUBCibZD8bCUb7dPMgbJUvoQFxe_10iyzAqPAzWt_AB5FW7NWfx1_5V9s_7zb2iaTD_xn5ClT4wknHD6EHg4oZDW7o_WNaFPc5y_z0qYtYo2aSYeAaRdHATjjJtvIrPx90-oix8QwUZT-EwsuuflRUbGRGiuV2mduQIZwoB8v9kd6_cNXoOHk5su4Pbq3wecDCVcp3NWOZ1Q\",\n" +
//		"            \"e\": \"AQAB\",\n" +
//		"            \"use\": \"sig\",\n" +
//		"            \"kid\": \"DpCj8wXo1qXq78Xy9OkkizkLwA0YUygeBBr0vB39NfY\",\n" +
//		"            \"qi\": \"OkkADk3TVzURxUcXVkRSecW4-SrAjuHhpQ3fnYl89nak4yqSzQ8jVXhplF5hSRk7drmqJnCk6k7QJx-W_Sl4-7qGYCfteU2ZEt0gHcwNDgN-T4Cngzc07u6VJiTjUsulH7wL3yKwNo8tP0CXTsom4n-MjhfU7chuhYwoTTvS6mE\",\n" +
//		"            \"dp\": \"ZW--rBeCUgjRu-E2QNwJITRf8ksQvv4n4puXthgGg77AYpGGfG1t0JEooNXXcEJcJnRk7J6IEsK8TBLcFY_XRq1ViwbathLMAitWxcfpkTTCiDi7lvXP1kJZqpo-9hANRaJqXcQgdAnogHem1w6fi2BAt1YuEINhdy8TglwZV9U\",\n" +
//		"            \"alg\": \"RS256\",\n" +
//		"            \"dq\": \"KIp8tZD_7zJi2b34hTm_dkvvoR0uXQBkIpgrnkTLuVlWANMwpx9sbZAYzbYn3hFarIFMC3ogBiWTqAJGaLUMJnLjkCPRZo9a2tMWI0l-ZciQ9WnHV5osJLt9geOfPx6eDzh9PQuOGOCKDs-KiOyj809LptK9HkQVw4rAYTkdM6k\",\n" +
//		"            \"n\": \"jR654POlax01Os2U7RnQM8fCRcESC1vaU6Zey_f6uSvL8hxu1RyogzWIw28Tr0r5FLBrTR1vylbpcdoR-b0Slf0jxHyrAdrQ-lTo9LuMXhRCOIbeszGmyGEATUMvsVl0I0iFNkHvNF5zbKtonmyK5AuxQmmu9GTvrD6iUY8nZThyy4yc2OoSpiwdtdPISSe8h1_sS__SPj4B0iG6TwBLIfs1Xb_XHD4zgArx-wIyCn-d2nxhI1kTCFI1idFn2oxSTcfGhqI-zuzY6FF17mkqrkCV8XoCzZB5RTIvfkB1aU8BrYK9QI2nF_kvTkppkcYgSBULx9xo8fnryBcbQlC7EQ\"\n" +
//		"        }\n" +
//		"    ]\n" +
//		"}");
//}
//
//
////static String privatekey="MIIEowIBAAKCAQEAyMzHt4zMlplvP6XvbxfE7TivX0T2w1yN7uWPX/428jlr51PqJIuv2Mv1q3QAnty9hBlz+VLw5prXvl1xUlr9BYqjBQR7ijMBRCJcXZK26u4auzyFA5YAZQ9sGGUxJrtYwHsFIXN58g6tZbQPYmQWXtaoGWTC+UUEXPb5BngiKyAcUpgmyfUM1fseQjz7V6v/LlhdWOPtEPBzx7s+CpvjoiuqEVTk6RcBd8+PTGsbuHL7r3fDb1haWdc7RJ0LbnP0rmA301wEWDdQTV/QVUN2eY8eNIRBbGmYXOzqjI5DCxAm+gL3ztDtKNQW9sLiI14YEIb4aonV36rhj8xtSDCU5QIDAQABAoIBAGdXxT25MB4d73yBaR3yzL4OG2vbsWhQPRgDe2u7CQpW9SrELFAMuD7KkbBg7mTUVJElDGP4BNWaQYjOzKDHBUuR016ktPQmVfN7/6+E77EvRACzH/39eEyKyGYxxj8Z0o6Vgcl6hftHBITAS96mhkDfFvqiuhnSJHG4BegHcgZhAV79wbVKfjQ2O7NTjykjf8v13BOQyVFjnzvcXccsA263nz9Mb0ZkyRSBJ8hSH4PIhbkkfqBgfIyKleRMZsmT4aYqUhBSla84nPeF0Y2Ouz3zWtJiWfAmfRRk6QYg9HfmX4yB0zR9FZC/BkoyBIV5+M7BQDXgPg7ucwsOXmGcc40CgYEA8zofkQwxXE/CEzc4uS1QnORL3T6fOc//BxzU1SHJK5q97av4gEUe5sxYpVa+IkM7yxfEA4HTQMCw7gF4gDvNA0CCSajZEkQtLfu/xT7YImPPsUHcyTSY7RLqnAW+K+GF6v9lKPQkp7ObIw3LS4a+9PiwYInV8POjKqj595glmOsCgYEA01hHRow9HeHGzO455IQQjjdVsInF0hMxCdIPNVMJshC9tgdTCbraLmDqJjhM9K1MENi3NHL1DTvr+Fb1MI0/biGJEswztPkxG1e6pTaFvDp+WfetaPlDcSLYXJsIU8DsAQtTmorLZ5suxkFL0NCnf77FLqpc9b1qqg5BkpkIFW8CgYEAgaOiPZplGNG+HKXbSv/3LpiUQwlkrtjJEo5wdmU6p04kG3EE08GDtfqG6SFx2CtDzH0PUds5sRLDeyg3hQnavPf+OaqQgKbr+c1sKoLTiojuo4j6WBf7xqjFeYGqGhNrYJTd41U10FjvwGBS0h+w2jtPLzVoXbRObKeCDFEBAR8CgYBvjy/Ae5JfTaiE0FNa3qNmjqr6zx7O7zZ5eppwiW6awd+CUIdyoWE+DgZLOnjUxw1Z7yt10iCsZa7/ndc7U7PhzG3wsD2zD77uMfbh8s/RNgcwMl8lBD6nX79Z0rQokbOCMZpl/1GzVOTx3dHJXfqsoeSv51m+lcfSEEhou8LanQKBgBlZ392tcd1hNvvFVIgWJjAexUDUJnGCdx0HfRUQB56s3agpp2G7hcG0YrihH30eGc/0oCi0jvchzeGPlr2VCSQuosQlCihl179yt657dwaCqiYRbGDFqxEr5xWqGFpVierYPY1/tJDSSFgXYzr3mQGmykG//C5IIqZC6SQhMCgn";
//	public static String sign(String payload) throws Exception {
//	return dosign(payload,true);
//}
// public static String dosign(String singleRecord,boolean detached) throws JoseException, NoSuchAlgorithmException, InvalidKeySpecException {
//		
//        // Create a new JsonWebSignature object for the signing
//        JsonWebSignature signerJws = new JsonWebSignature();
//   
//        // The content is the payload of the JWS
//        signerJws.setPayload(singleRecord);
//        // Set the signature algorithm on the JWS
//        signerJws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
//        RsaJsonWebKey jwk = getJsonWebKey();
//        		
//        		// The private key is used to sign
//        		signerJws.setKey(jwk.getPrivateKey());	            
//            // Set the "b64" header to false, which indicates that the payload is not encoded when calculating the signature (per RFC 7797)
//            signerJws.getHeaders().setObjectHeaderValue(HeaderParameterNames.BASE64URL_ENCODE_PAYLOAD, !detached);
//
//    		// Produce the compact serialization with an empty/detached payload,
//    		// which is the encoded header + ".." + the encoded signature
//    		if(detached) {
//    			System.out.println("signIn process completed");
//    			return signerJws.getDetachedContentCompactSerialization();	
//    		} else {
//    			// RFC 7797 requires that the "b64" header be listed as critical
//    			signerJws.setCriticalHeaderNames(HeaderParameterNames.BASE64URL_ENCODE_PAYLOAD);
//    			return signerJws.getDetachedContentCompactSerialization();
//    		}
//	 
//       
// }

//private static RsaJsonWebKey getJsonWebKey() {
//	return (RsaJsonWebKey) rsaJsonWebKeySet.getJsonWebKeys().get(0);
//}
//	public static JsonWebSignature parseSign(String signature, String payload, String publicKeyPem) throws Exception {
//    // Use a JsonWebSignature object to verify the signature
//    JsonWebSignature verifierJws = new JsonWebSignature();
//    
//    // Set the algorithm constraints based on what is agreed upon or expected from the sender
//    verifierJws.setAlgorithmConstraints(new AlgorithmConstraints(AlgorithmConstraints.ConstraintType.WHITELIST,
//            AlgorithmIdentifiers.RSA_USING_SHA256));
//
//    if(payload == null) {
//        // The JWS with embedded content is the compact serialization
//        verifierJws.setCompactSerialization(signature);
//    } else {
//        // The JWS with detached content is the compact serialization
//        verifierJws.setCompactSerialization(signature);
//        // The unencoded detached content is the payload
//        verifierJws.setPayload(payload);
//    }
//
//    // Load PEM public key
//    byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyPem.replaceAll("\\n", "").replaceAll("-----BEGIN PUBLIC KEY-----", "").replaceAll("-----END PUBLIC KEY-----", ""));
//    X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
//    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//    PublicKey publicKey = keyFactory.generatePublic(keySpec);
//
//    // The public key is used to verify the signature
//    // This should be the public key of the sender
//    verifierJws.setKey(publicKey);
//
//    if(!verifierJws.verifySignature()) {
//        throw new JoseException("Signature verification failed.");
//    } else {
//        System.out.println("Successful verification");
//    }
//
//    // Return the JWS
//    return verifierJws;
//}
}
