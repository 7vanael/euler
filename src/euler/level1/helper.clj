(ns euler.level1.helper)

(defn get-primes [n]
  (loop [primes [] n n factor 2]
    (cond (<= n 1) primes
          (= 0 (rem n factor)) (recur (conj primes factor) (/ n factor) factor)
          :else (recur primes n (inc factor)))))

(defn prime? [n]
  (cond (= 2 n) true
        (even? n) false
        (< n 2) false
        :else (loop [factor 3]
                (let [i-squared (* factor factor)]
                  (cond (> i-squared n) true
                        (zero? (rem n factor)) false
                        :else (recur (+ factor 2)))))))