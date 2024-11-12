package ders6;

public class bir {

    public static void main(String[] args) {
        char[] massiv = new char[5];
        massiv[0] = ')';
        massiv[1] = '!';
        massiv[2] = '@';
        massiv[3] = '#';
        massiv[4] = '$';

        String simvolmassivi = new String(massiv);
        System.out.println(simvolmassivi);
    }
}
