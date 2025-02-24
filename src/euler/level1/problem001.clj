(ns euler.level1.problem001)

(defn get-multiples-of-x [n x]
  (loop [multiples [] current x]
    (if (<= n current)
      multiples
      (recur (conj multiples current) (+ current x)))))

(defn euler-1 [n]
 (let [multiples-of-3 (get-multiples-of-x n 3)
       multiples-of-5 (get-multiples-of-x n 5)]
   (apply + (distinct (concat multiples-of-3 multiples-of-5)))))