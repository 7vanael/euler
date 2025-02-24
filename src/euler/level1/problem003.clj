(ns euler.level1.problem003)

(defn divide-by-factor [number factor]
  (let [remainder (rem number factor)]
    (if (= remainder 0)
      (divide-by-factor (/ number factor) factor)
      number)))

(defn get-primes [n]
  (loop [primes [] n n factor 2 ]
    (let [remainder (rem n factor)
          i-squared (* factor factor)
          done-factoring (and (not= remainder 0) (< n i-squared))]
      (cond (and (> n 1) done-factoring) (conj primes n)
        done-factoring primes
        (= remainder 0) (recur (conj primes factor) (divide-by-factor n factor) (inc factor))
        :else (recur primes n (inc factor))))))

(defn euler-3 [n]
  (if (< n 2)
    "The smallest prime is 2, please try a larger number"
    (apply max (get-primes n))))