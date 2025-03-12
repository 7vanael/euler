(ns euler.level1.problem010
  (:require [euler.level1.helper :as helper]))

(defn euler-10 [n]
  (apply + (take-while #(< % n) helper/primes)))