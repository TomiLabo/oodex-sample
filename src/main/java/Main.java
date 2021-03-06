package main.java;

import main.java.out.NumDataOutput;
import main.java.sequence.NumDataSequence;
import main.java.sequence.NumSequenceGenerator;
import main.java.sort.algo.NumMergeSorter;
import main.java.sort.algo.NumQuickSorter;
import main.java.sort.simple.NumSimpleSorter;

public class Main {
    public static void main(String args[]) {
        NumDataSequence seq = NumSequenceGenerator.generateByShuffle(100, 0.05);
        // NumQuickSorter.sort(seq);
        NumMergeSorter.sort(seq);
        NumDataOutput.puts(seq);
    }
}
