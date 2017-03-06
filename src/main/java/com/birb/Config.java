package com.birb;

import java.util.Arrays;
import java.util.List;

public class Config {

    //BODY TYPE
    public static int BODY_TYPE_ORDINARY_ROUND = 1;
    public static int BODY_TYPE_ORDINARY_LONG = 2;
    public static int BODY_TYPE_DUCK = 3;
    public static int BODY_TYPE_CRANE = 5;
    public static int BODY_TYPE_VYP = 6;
    public static int BODY_TYPE_CARNIVORE = 7;
    public static int BODY_TYPE_OWL = 8;

    //BEAK TYPE
    public static int BEAK_TYPE_STRAIGHT = 1;
    public static int BEAK_TYPE_DUCK = 2;
    public static int BEAK_TYPE_CURVED = 3;
    public static int BEAK_TYPE_CARNIVORE = 4;

    //LEG TYPE
    public static int LEG_TYPE_DUCK = 1;
    public static int LEG_TYPE_POG = 2;
    public static int LEG_TYPE_ORDINARY = 3;
    public static int LEG_TYPE_CARNIVORE = 4;

    //TAIL TYPE
    public static int TAIL_TYPE_ROUND = 1;
    public static int TAIL_TYPE_SQUARE = 2;
    public static int TAIL_TYPE_HALVED = 3;
    public static int TAIL_TYPE_TET = 4;
    public static int TAIL_TYPE_PIKE = 5;
    public static int TAIL_TYPE_LUSH = 6;

    public static List<String> firstImportance = Arrays.asList("body_type", "beak_type", "main_size", "beak_length", "beak_width");
    public static List<String> secondImportance = Arrays.asList("leg_type", "area");
}
