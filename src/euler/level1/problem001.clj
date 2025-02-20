(ns euler.level1.problem001)

(defn multiples-of-3 [n]
  (loop [n n
         multiples []
          current 3]
     (if (<= n current)
       multiples
       (recur n (conj multiples current) (+ current 3)))))

(defn multiples-of-5 [n]
  (cond (< n 6) []
        (>= n 6)
          (loop [n n
                 multiples []
                 current 5]
            (if (<= n current)
              multiples
              (recur n (conj multiples current) (+ current 5)))))
  )


(defn sum-of-multiples-of-3-or-5 [n]
  (if (<= n 3)
    0
    (reduce + (distinct (concat (multiples-of-3 n) (multiples-of-5 n))))))

(defn multiples-of-x [n x]
  (cond (< n (+ x 1)) []
        (>= n (+ x 1))
        (loop [n n
               multiples []
               current x]
          (if (<= n current)
            multiples
            (recur n (conj multiples current) (+ current x)))))
  )

(defn sum-of-multiples-of-3-or-5-x [n]
  (if (<= n 3)
    0
    (reduce + (distinct (concat (multiples-of-x n 3) (multiples-of-x n 5))))))

(defn euler-1 [n]
  (sum-of-multiples-of-3-or-5-x n)
  )
