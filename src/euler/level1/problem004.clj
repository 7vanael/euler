(ns euler.level1.problem004
  (:require [clojure.string :as str]))

(defn is-palindrome [n]
  (let [digits (str n)]
    (loop [digits digits]
      (let [first-digit (first digits) last-digit (last digits) length (count digits)]
        (cond (<= length 1) true
              (not= first-digit last-digit) false
              (< 1 length) (recur (subs digits 1 (dec length))))))))

(defn highest-digit-number [n]
  (dec (int (Math/pow 10 n))))

(defn get-all-palindromes [n]
  (let [term-a (highest-digit-number n) term-b term-a
        lower-limit (inc (highest-digit-number (dec n)))]
    (loop [a term-a b term-b palindromes []]
      (cond
        (< a lower-limit) (distinct palindromes)
        (< b lower-limit) (recur (dec a) (dec a) palindromes)
        :else (let [product (* a b) updated-palindromes (if (is-palindrome product)
                                                          (conj palindromes product)
                                                          palindromes)]
                (recur a (dec b) updated-palindromes))))))

(defn euler-4 [n]
  (if (> n 0)
    (apply max (get-all-palindromes n))
    "You must enter a number of digits greater than 0"))