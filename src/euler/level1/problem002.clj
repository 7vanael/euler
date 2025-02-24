(ns euler.level1.problem002)

(defn get-partial-fibonacci [n]
  (if (= n 1)
    [0 1]
    [0]))

(defn get-fibonacci-to-n [n]
  (if (< n 2)
    (get-partial-fibonacci n)
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
