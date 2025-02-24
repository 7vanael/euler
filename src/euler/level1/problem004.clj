(ns euler.level1.problem004
  (:require [clojure.string :as str]))

(defn is-palindrome [n]
  (let [digits (str/upper-case n)]
  (loop [digits digits]
    (let [first (take 1 digits) last (take-last 1 digits) length (count digits)]
      (cond (<= length 1) true
            (not= first last) false
            (< 1 length) (recur (subs digits 1 (dec length))))))))

(defn get-all-palindromes [n]
  )

(defn euler-4 [n]
  )
