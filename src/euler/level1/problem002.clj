(ns euler.level1.problem002)

(defn get-fibonacci-to-n [n]
  (loop [sequence [1 2]]
    (let [next-num-in-sequence (reduce + (take-last 2 sequence))]
      (if (> next-num-in-sequence n)
        sequence
        (recur (conj sequence next-num-in-sequence))))))

  (defn get-sum-of-evens [coll] (reduce + (filter even? coll)))

  (defn euler-2 [n]
    (if (< n 2)
      "A sequence must have at least the first two numbers; Try 2 or higher"
      (get-sum-of-evens (get-fibonacci-to-n n))))
