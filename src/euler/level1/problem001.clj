(ns euler.level1.problem001)

(defn get-multiples-of-3 [n]
  (let [three 3]
   (loop [n n
         multiples []
          current three]
     (if (<= n current)
       multiples
       (recur n (conj multiples current) (+ current three))))))

(defn get-multiples-of-5 [n]
  (cond (<= n 5) []
        (> n 5)
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
    (apply + (distinct (concat (get-multiples-of-3 n) (get-multiples-of-5 n))))))

(defn get-multiples-of-x [n x]
  (loop [multiples [] current x]
    (if (<= n current)
      multiples
      (recur (conj multiples current) (+ current x))))
  )

(defn euler-1 [n]
 (let [multiples-of-3 (get-multiples-of-x n 3)
       multiples-of-5 (get-multiples-of-x n 5)]
   (apply + (distinct (concat multiples-of-3 multiples-of-5))))
  )
