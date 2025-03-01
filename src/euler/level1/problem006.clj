(ns euler.level1.problem006)

(defn sum-of-squares [numbers]
  (->> numbers
       (map #(Math/pow % 2))
       (apply +)
       int))

(defn square-of-sums [numbers]
  (->> numbers
       (apply +)
       (#(Math/pow % 2))
       int))

(defn euler-6 [n]
  (let [nums (range 1 (inc n))]
    (- (square-of-sums nums) (sum-of-squares nums))))