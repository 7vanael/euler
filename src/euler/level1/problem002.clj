(ns euler.level1.problem002)

(defn get-fibonacci-to-n [n]
  (cond (= n 2) [1 2]
        (> n 2)
          (loop [n n
                 sequence [1 2]]
            (if (> (reduce + (take-last 2 sequence)) n)
              sequence
              (recur n (conj sequence (reduce + (take-last 2 sequence))))
            )

          )
        )
  )
(defn get-sum-of-even [coll]
  (reduce + (filter even? coll))
  )


(defn euler-2 [n]
    (get-sum-of-even (get-fibonacci-to-n n))
    )
