package com.example.lib;

public class DeleteComma {
    String a = "Taiwan,Touch,Your,Heart";
    StringBuilder stringBuilder = new StringBuilder(a);

    public void DeleteComma() {
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).equals(",")) {
               
                stringBuilder.replace(i, i + 1, " ");
            }

        }
        a = stringBuilder.toString();
        System.out.println("\n" + a);
    }
}
