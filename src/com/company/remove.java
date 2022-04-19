package com.company;

public class remove {
    public static void main(String[] args) {
        String s = """
                Lorem Ipsum
                is simply dummy
                text of the printing and typesetting
                 industry.
                """;
        System.out.println("Unchanged row                -> " + s);

        s = s.replace("\n", "");

        System.out.println("Row after deleting transfer  -> " + s);
    }
}
