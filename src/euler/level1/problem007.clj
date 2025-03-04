(ns euler.level1.problem007
  (:require [euler.level1.helper :as helper]))

#_(def lazy-sieve
  (letfn [(next-sieve [n xs]
            (lazy-seq
              (let [multiple? #(zero? (rem % n))]
                (cons n (next-sieve (first (drop-while multiple? (rest xs)))
                                    (remove multiple? (rest xs)))))))]
    (next-sieve 2 (iterate inc 2))))

#_(defn euler-7 [n]
  (nth lazy-sieve (dec n)))

(def primes
  (conj (filter helper/prime? (iterate #(+ 2 %) 3)) 2))

(defn euler-7 [n]
    (nth primes (dec n)))

