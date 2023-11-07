package org.example ;

import static java.awt.SystemColor.text;

 public class Soru4 {
    public String changeCase(@org.jetbrains.annotations.NotNull String text) {
        String result = ""; //sonuç stringi tanımlanır
        for(int i=0; i<text.length();i++) {
            char ch = text.charAt(i); // Yazıdaki her bir karakter alınır
            // eğer kareakter küçük harf ise büyük harfe çevrilir ve stringine eklenir
            if(Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
            // eğer karakter büyük harf ise küçük harfe çevrililr ve sonuç stringine eklenir
            else if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            else {
                result += ch; // diğer durumlarda karakter olduğu gibi sonuç stringine eklenir (hehangi bir haf olmama durumu)
            }
        }
        return result; // sonuç stringi döndürülür
    }
 }


