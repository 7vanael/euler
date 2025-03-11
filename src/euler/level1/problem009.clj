(ns euler.level1.problem009
  (:require [euler.level1.helper :as helper]))

(defn squared [n]
  (int (Math/pow n 2)))

(defn pythagorean? [[a b c]]
  (= (+ (squared a) (squared b)) (squared c)))

(defn unique? [[a b c]]
  (not (or (= a b) (= b c) (= a c))))

(defn sum-to-n? [n candidates]
  (= n (apply + candidates)))

(defn meets-acceptance-criteria? [n candidates]
  (and (sum-to-n? n candidates) (unique? candidates) (pythagorean? candidates)))

(defn range-top [n]
  (inc (quot n 2)))

(defn find-pairs [n]
  (map #(vector % (- n %)) (range 1 (range-top n))))

(defn find-triples [n]
  (for [c (range 3 (- n 2))
        [a b] (find-pairs (- n c))]
    [a b c]))

(defn get-acceptable-triple [n]
  (filter #(meets-acceptance-criteria? n %) (find-triples n)))

(defn euler-9 [n]
  (map (fn [v] (apply * v)) (get-acceptable-triple n)))