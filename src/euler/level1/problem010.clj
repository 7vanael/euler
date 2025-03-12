(ns euler.level1.problem010
  (:require [euler.level1.helper :as helper]))

#_(defn primes-max-index [n]
  (let [primes (nth helper/primes (range))]
   (when (< n primes)
     (apply + (rest primes))
     )))

(defn euler-10 [n]
  (apply + (filter helper/prime? (range 1 n)))
  #_(apply + (nth helper/primes (range 0 (inc (primes-index n)))))
  #_(->> n
       primes-max-index
       (range 0 )
       (nth helper/primes)
       (apply +))
  )

