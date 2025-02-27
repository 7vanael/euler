(ns euler.level1.problem005)

(defn get-multiple [n]
  (->> n
       frequencies
       (map (fn [[prime frequency]] (Math/pow prime frequency)))
       (apply *)
       int))

(defn get-primes [n]
  (loop [primes [] n n factor 2]
    (cond (<= n 1) primes
          (= 0 (rem n factor)) (recur (conj primes factor) (/ n factor) factor)
          :else (recur primes n (inc factor)))))

(defn euler-5 [n]
  (let [ prime-list (mapcat #(get-primes %) (range 1 (inc n)))]
    (get-multiple prime-list)))