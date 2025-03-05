(ns euler.level1.problem007
  (:require [euler.level1.helper :as helper]))

(def primes
  (conj (filter helper/prime? (iterate #(+ 2 %) 3)) 2))

(defn euler-7 [n]
  (nth primes (dec n)))