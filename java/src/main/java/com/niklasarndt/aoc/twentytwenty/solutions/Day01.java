package com.niklasarndt.aoc.twentytwenty.solutions;

import com.niklasarndt.aoc.twentytwenty.Exercise;
import com.niklasarndt.aoc.twentytwenty.Utils;

import java.util.List;
import java.util.stream.Collectors;

@Exercise(1)
public class Day01 {

    public Day01() {
        List<Integer> els = Utils.readFile("../input/day01.txt").stream()
                .map(Integer::valueOf).sorted().collect(Collectors.toList());

        for (int first : els) {
            for (int second : els) {
                if (second > first)
                    break;

                if (first + second == 2020)
                    System.out.printf("PART ONE: %d + %d = 2020, Multiplied: %d\n", first, second, first * second);

                for (int third : els) {
                    if (third > second)
                        break;

                    if (first + second + third == 2020)
                        System.out.printf("PART TWO: %d + %d + %d = 2020, Multiplied: %d\n",
                                first, second, third, first * second * third);
                }
            }
        }
    }
}
