package day27enumsexceptions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {

        String capital1 = UsStates.ILLINOIS.getCapital();
        System.out.println(capital1);

        String capital2 = UsStates.TEXAS.getCapital();
        System.out.println(capital2);

        String abre1= UsStates.ALABAMA.getAbbreviation();
        System.out.println(abre1);

        System.out.println("UsStates.values() = " + Arrays.toString(UsStates.values()) );

        for (UsStates w:UsStates.values()){
            System.out.println(w +"->"+w.getAbbreviation()+"->"+w.getCapital());

        }


    }

}