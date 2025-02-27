(ns euler.level1.problem005
  (:require [euler.level1.helper :as helper]))

(defn get-multiple [n]
  (->> n
       (map (fn [[prime frequency]] (Math/pow prime frequency)))
       (apply *)
       int))

(defn merge-maxes [maxes n]
  (->> n
       helper/get-primes
       frequencies
       (merge-with max maxes)))

(defn max-frequency-map [n]
  (reduce
    merge-maxes                   ;The function used to merge-maxes
    {}                            ;the first argument passed to merge-maxes
    (range 1 (inc n))))          ;the second argument passed to merge-maxes

(defn euler-5 [n]
  (get-multiple (max-frequency-map n)))