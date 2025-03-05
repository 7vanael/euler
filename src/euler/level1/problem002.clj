(ns euler.level1.problem002)


(defn get-fibonacci-to-n [n]
  (when (> n 1)
    (loop [sequence [1 2]]
      (let [next-num-in-sequence (apply + (take-last 2 sequence))]
        (if (> next-num-in-sequence n)
          sequence
          (recur (conj sequence next-num-in-sequence)))))))

  (defn get-sum-of-evens [coll] (reduce + (filter even? coll)))

(defn euler-2 [n]
  (if (< n 2)
    0
    (get-sum-of-evens (get-fibonacci-to-n n))))