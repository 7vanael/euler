(ns euler.level1.problem005)

(defn get-multiple [n]
  (->> n
       (map (fn [[prime frequency]] (Math/pow prime frequency)))
       (apply *)
       int))

(defn get-primes [n]
  (loop [primes [] n n factor 2]
    (cond (<= n 1) primes
          (= 0 (rem n factor)) (recur (conj primes factor) (/ n factor) factor)
          :else (recur primes n (inc factor)))))

(defn max-frequency-map [n get-primes]
  (reduce
    #(merge-with max %1 (frequencies (get-primes %2))) ;The function used to reduce
    {} ;the first argument passed to reduce
    (range 1 (inc n))));the second argument passed to reduce

(defn euler-5 [n]
  (get-multiple (max-frequency-map n get-primes)))