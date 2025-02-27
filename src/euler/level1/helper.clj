(ns euler.level1.helper)

(defn get-primes [n]
  (loop [primes [] n n factor 2]
    (cond (<= n 1) primes
          (= 0 (rem n factor)) (recur (conj primes factor) (/ n factor) factor)
          :else (recur primes n (inc factor)))))