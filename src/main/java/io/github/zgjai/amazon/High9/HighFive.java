package io.github.zgjai.amazon.High9;

import java.util.Map;

/**
 * There are two properties in the node student id and scores, to ensure that each student will have at least 5 points,
 * find the average of 5 highest scores for each person.
 *
 * Example Given results = [[1,91],[1,92],[2,93],[2,99],[2,98],[2,97],[1,60],[1,58],[2,100],[1,61]]
 *
 * Return
 */
public class HighFive {
    /**
     * @param results a list of <student_id, score>
     * @return find the average of 5 highest scores for each person Map<Integer, Double> (student_id, average_score)
     */
    public Map<Integer, Double> highFive(Record[] results) {
        // Write your code here
    }

    class Record {
        public int id, score;

        public Record(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }
}
