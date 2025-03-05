(ns euler.level1.problem006)

(defn square [n] (* n n))
(defn sum [nums] (apply + nums))

(defn sum-of-squares [numbers]
  (sum (map square numbers)))

(defn square-of-sums [numbers]
  (square (sum numbers)))

(defn euler-6 [n]
  (let [nums (range 1 (inc n))]
    (- (square-of-sums nums) (sum-of-squares nums))))