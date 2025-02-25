(ns euler.level1.problem004
  (:require [clojure.string :as str]))

(defn palindrome? [digits] (= digits (str/reverse digits)))

(defn number-above-highest-digit-number [n]
  (int (Math/pow 10 n)))

(defn updated-palindromes [product palindromes]
  (if (palindrome? (str product))
    (conj palindromes product)
    palindromes))

(defn get-all-palindromes [n]
  (let [factor (dec (number-above-highest-digit-number n))
        lower-limit (number-above-highest-digit-number (dec n))]
    (loop [a factor b factor palindromes []]
      (cond
        (< a lower-limit) (distinct palindromes)
        (< b lower-limit) (recur (dec a) (dec a) palindromes)
        :else (let [product (* a b)
                    updated-palindromes (updated-palindromes product palindromes) ]
                (recur a (dec b) updated-palindromes))))))

(defn euler-4 [n]
  (if (> n 0)
    (apply max (get-all-palindromes n))
    "You must enter a number of digits greater than 0"))