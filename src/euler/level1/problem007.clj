(ns euler.level1.problem007
  (:require [euler.level1.helper :as helper]))

(defn euler-7 [n]
  (nth helper/primes (dec n)))