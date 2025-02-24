(ns euler.level1.problem003)

(defn remove-factor [number factor]
  (let [remainder (rem number factor)]
    (if (= remainder 0)
      (remove-factor (/ number factor) factor)
      number)))

(defn get-primes [n]
  (loop [primes [] n n i 2 ]
    (let [remainder (rem n i) i-squared (* i i)]
      (cond (and (not= remainder 0) (< n i-squared))
            (if (> n 1)
              (conj primes n)
              primes)
        (= remainder 0) (recur (conj primes i) (remove-factor n i) (inc i))
        (not= remainder 0) (recur primes n (inc i))))))



(defn euler-3 [n]
  (if (< n 2)
    "The smallest prime is 2, please try a larger number"
    (apply max (get-primes n))))